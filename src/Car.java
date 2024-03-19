public class Car {
    public String brand;
    public String model;
    public float speed;

    public Car(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = (float) speed;
    }

    //Два метода, старт/стоп
    public void start(){
        System.out.println("Start: " + brand + " " + model);
    }
    public void stop(){
        System.out.println("Stop: " + brand + " " + model);
    }

    //геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }


}
