package trabi.ali.backend.Entities;

public class Koper {

    private int id;
    private String naam;

    public Koper() {
    }

    public Koper(String naam) {
        this.naam = naam;
    }

    // adress ofwel een apparte klasse ofwel gewoon allemaal in een string
    private String adress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
