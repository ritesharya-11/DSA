public class app {

    public static void main(String[] args) {

        // Parameterized constructor
        Student A = new Student(1, 12, "Ritesh", 3, "ABC");

        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);

        A.study();
        A.sleep();
        A.bunk();
    }
}