package models.products;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Category extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products; 

    public  Category() {
    }

    public  Category(Long id, String name, List<Product> products) {
			this.id = id;
			this.name = name;
			this.products = products;
    }

    public static Finder<Long,Category> find = new Finder<Long,Category>(Category.class);
    
    public static List<Category> findAll() {
        return Category.find.where().orderBy("name asc").findList();
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Category c: Category.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }
    
    public static boolean inCategory(Long category, Long product) {
        return find.where()
            .eq("products.id", product)
            .eq("id", category)
            .findRowCount() > 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

