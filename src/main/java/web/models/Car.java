package web.models;

public class Car {
    private String producer;
    private String model;
    private int series;

    public Car(String producer, String model, int series) {
        this.producer = producer;
        this.model = model;
        this.series = series;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}
