package controllers;

import play.mvc.*;

import views.html.*;
import play.db.ebean.Transactional;

import models.users.*;
import models.products.*;
import models.shopping.*;

import controllers.security.*;

@Security.Authenticated(Secured.class)
@With(CheckIfCustomer.class)

public class ShoppingCtrl extends Controller {
    
	private Customer getCurrentUser() {
		return (Customer)User.getLoggedIn(session().get("email"));
	}

    @Transactional
    public Result showBasket() {
        return ok(basket.render(getCurrentUser()));
    }
    
    @Transactional
    public Result addToBasket(Long id) {

        Product p = Product.find.byId(id);
        
        Customer customer = (Customer)User.getLoggedIn(session().get("email"));

        if (customer.getBasket() == null) {

            customer.setBasket(new Basket());
            customer.getBasket().setCustomer(customer);
            customer.update();
        }

        customer.getBasket().addProduct(p);
        customer.update();
             
        return ok(basket.render(customer));
    }
    
   
    @Transactional
    public Result addOne(Long itemId) {
        
       
        OrderItem item = OrderItem.find.byId(itemId);
       
        item.increaseQty();
       
        item.update();
   
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Transactional
    public Result removeOne(Long itemId) {
        
        OrderItem item = OrderItem.find.byId(itemId);
        
        Customer c = getCurrentUser();

        c.getBasket().removeItem(item);
        c.getBasket().update();

        return ok(basket.render(c));
    }


    @Transactional
    public Result emptyBasket() {
        
        Customer c = getCurrentUser();
        c.getBasket().removeAllItems();
        c.getBasket().update();
        
        return ok(basket.render(c));
    }

    @Transactional
    public Result placeOrder() {
        Customer c = getCurrentUser();
        
        ShopOrder order = new ShopOrder();
        
        order.setCustomer(c);

        order.setItems(c.getBasket().getBasketItems());
  
        order.save();
       
        for (OrderItem i: order.getItems()) {
         
            i.setOrder(order);

            i.setBasket(null);

            i.update();
        }
        
        order.update();
       
        c.getBasket().setBasketItems(null);
        c.getBasket().update();
        
        return ok(orderConfirmed.render(c, order));
    }
    
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }

}
