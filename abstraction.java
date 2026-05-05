abstract class Car {

    public abstract void drive();

    public void playMusic() {
        System.out.println("Play music");
    }
}

class RangeRover extends Car {

    @Override
    public void drive() {
        System.out.println("Driving Range Rover...");
    }
}

public class abstraction {

    public static void main(String[] args) {

        Car obj = new RangeRover();

        obj.drive();
        obj.playMusic();
    }
}