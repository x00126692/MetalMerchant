package models.products;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
import models.products.Category;
import models.shopping.*;

@Entity
public class Article extends Model {

    @Id
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "articles")
    private List<Genre> genres = new ArrayList<Genre>();

    private List<Long> genSelect = new ArrayList<Long>();

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String story;


    public  Article() {
    }

    public  Article(Long id, String name, String Story){
        this.id = id;
        this.name = name;
        this.story = story;
        
    }
	
    public static Finder<Long,Article> find = new Finder<Long,Article>(Article.class);

    public static List<Article> findAll(String filter) {
        return Article.find.where()
                        
                        .ilike("name", "%" + filter + "%")
                        .orderBy("name asc")
                        .findList();
    }
    
    public static List<Article> findFilter(Long genID, String filter) {
        return Article.find.where()
                        
                        .eq("genres.id", genID)
                        
                        .ilike("name", "%" + filter + "%")
                        .orderBy("name asc")
                        .findList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Long> getGenSelect() {
        return genSelect;
    }

    public void setGenSelect(List<Long> genSelect) {
        this.genSelect = genSelect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }


   
}
