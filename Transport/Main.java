package Transport;

public class Main {

    public static void main(String[] args) {

        Car c = new Car(
            "maruti",
            "800",
            4,
            4,
            "Auto"
        );

        c.startEngine();
        c.startAc();
        c.stopEngine();


    }
}