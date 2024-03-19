public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Mers", "E300", 180.6);
        Car car2 = new Car ("Audi", "A8", 200.6);
        car1.stop();
        System.out.println("First car brand: " + car1.brand + ". Model: " + car1.model + ". Speed: " + car1.speed + " km/h");

        car2.start();
        car2.stop();
        System.out.println("Second car brand: " + car2.brand + ". Model: " + car2.model + ". Speed: " + car2.speed + " km/h");
    }
}
