package trabi.ali.backend.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

public class Product {

    //temp lokaal klein db
    private ArrayList tempProducts;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private double price;
    private String category;

    public Product(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    //constructor om de temp array te vullen met nepdata
    public Product() {
        Product p1 = new Product("hond owo", "lekkere hondenbrokjes", 9.0, "voeding");
        Product p2 = new Product("kitty xo", "zachte kattenpaal", 12.0, "speelgoed");
        Product p3 = new Product("blubby", "nepvis", 4.0, "speelgoed");
        Product p4 = new Product("stro", "warme stro om de winter aan te gaan", 3.0, "habitat");
        Product p5 = new Product("yellow carrot", "zeldzame wortels voor de konijntjes", 20.0, "voeding");
        Product p6 = new Product("dekentje pro", "zachte deken maar duurzaam", 10.0, "habitat");

        tempProducts.add(p1);
        tempProducts.add(p2);
        tempProducts.add(p3);
        tempProducts.add(p4);
        tempProducts.add(p5);
        tempProducts.add(p6);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
