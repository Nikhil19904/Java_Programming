class Car {
    String color;
    int speed;

    void showDetails() {
        System.out.println("Color: " + color + ", Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {

        // Object 1
        Car c1 = new Car();
        c1.color = "Red";
        c1.speed = 100;

        // Object 2
        Car c2 = new Car();
        c2.color = "Blue";
        c2.speed = 80;

        // Object 3
        Car c3 = new Car();
        c3.color = "Black";
        c3.speed = 120;

        // Display details
        c1.showDetails();
        c2.showDetails();
        c3.showDetails();
    }
}