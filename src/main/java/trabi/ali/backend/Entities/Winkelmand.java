package trabi.ali.backend.Entities;

import java.util.ArrayList;

public class Winkelmand {

    private String id;
    private Koper koper;
    private ArrayList<Product> producten;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Koper getKoper() {
        return koper;
    }

    public void setKoper(Koper koper) {
        this.koper = koper;
    }

    public ArrayList<Product> getProducten() {
        return producten;
    }

    public void setProducten(ArrayList<Product> producten) {
        this.producten = producten;
    }

    public Winkelmand() {
    }

}
