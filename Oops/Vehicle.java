public class Vehicle {

    public String name;

    public String model;

    public  int noOfTres;

    public Vehicle(String name, String model, int noOfTres) {
        this.name = name;
        this.model = model;
        this.noOfTres = noOfTres;
    }

    void  startEngine(){
        System.out.println("Engine is starting of %s\n :", name, model);

    }

    vois stopEngine(){

        System.out.println("Engine is stoping of %s: %s\n", name, model);

    }

    
    
}
