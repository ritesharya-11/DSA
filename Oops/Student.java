public class Student {

    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    // Constructor
    public Student() {
        System.out.println("Student constructor called");
    }

    // Methods
    public void study(int id, int age, String name, int nos) {
        System.out.println("student Defult ctor Called");
    }

    //Parameterise ctor
    public Student(int id, int age, String name, int nos, String gf){
        System.out.println("student parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    // copy constructor
    public Student(Student srcobj){ // srciobj -> A
        System.out.println(" Student Copy ctor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;

    }

    // Method  / Behaviours

    public void study(){
        System.err.println(name +" studying ");
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }

    public void bunk() {
        System.out.println(name + " bunking");
    }

    private void  gfChanting(){
        System.out.println(name+ "gfChanting");
    }
}