package models.products;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Genre extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Article> articles;

    public  Genre() {
    }

    public  Genre(Long id, String name, List<Article> articles) {
			this.id = id;
			this.name = name;
			this.articles = articles;
    }

    public static Finder<Long,Genre> find = new Finder<Long,Genre>(Genre.class);
    
    public static List<Genre> findAll() {
        return Genre.find.where().orderBy("name asc").findList();
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Genre g: Genre.find.orderBy("name").findList()) {
            options.put(g.id.toString(), g.name);
        }
        return options;
    }
    
    public static boolean inGenre(Long genre, Long article) {
        return find.where()
            .eq("articles.id", article)
            .eq("id", genre)
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

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}

