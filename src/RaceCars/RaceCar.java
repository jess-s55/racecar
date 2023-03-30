package RaceCars;

public class RaceCar {
    private String color;
    private String make;
    private String model;
    private int carNumber;
    private boolean turbo;

    public RaceCar() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public String getColor() {
        return color;
    }
    public int getCarNumber() {
        return carNumber;
    }
    public boolean getTurbo() {
        return turbo;
    }
}


