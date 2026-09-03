package Transport;

public class MotorCycle extends Vehicle {


    public String handleBarStyle;

    public String suspensionType;

    public MotorCycle(String name, String model, int noOfTres, String handleBarStyle, String suspensionType ) {
      
        super(name, model, noOfTres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheeliee(){
        System.out.println("MotorCyle is doing whwllee " + name);
    }

    
    
}
 