package Transport;

public class Car extends Vehicle {

    public int noOfDoors;
    public String transmissionType;

    public Car(String name, String model, int noOfTres,
               int noOfDoors, String transmissionType) {

        super(name, model, noOfTres);

        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAc() {
        System.out.println("AC started: " + name);
    }
}