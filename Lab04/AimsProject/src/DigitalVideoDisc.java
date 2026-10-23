public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;

    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    private void assignId() {
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        assignId();
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        assignId();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category,
                            String title, double cost) {
        assignId();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director,
                            int length, double cost) {
        assignId();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public double getCost() { return cost; }
    public static int getNbDigitalVideoDiscs() { return nbDigitalVideoDiscs; }

    public void setTitle(String title) { this.title = title; }
}
