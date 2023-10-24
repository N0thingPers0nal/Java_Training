package D_Override;

public class Classroom {
    public Classroom(){
        System.out.println("Default Constructor");
        //this will be called once object is created for this class
    }
    public Classroom(int a){
        System.out.println("Constructor Overloading ");
        //this will be called once object is created for this class
    }

    private int a=10;
    void students(){
        System.out.println("Students");
    }
    void count(){
        System.out.println(a+" Students");
    }
}
