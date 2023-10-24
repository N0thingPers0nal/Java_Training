package A_Object;

public class A_Object {
     String a="1";
    public static void main(String[] args) {
//        System.out.println(a);
//        a="12121";
        A_Object obj1=new A_Object();
        System.out.println(obj1);
        System.out.println(obj1.a);
//        System.out.println(a);
        //only static variables or methods can be accessed inside the static method or else create object and access it.

        A_Object obj2=new A_Object();
        System.out.println(obj2);
        System.out.println(obj2.a);
    }
    public void a(){
        System.out.println("A_Object");
//        return 0;
    }
    public int b(){
        System.out.println("A_Object");
        return 0;
    }
}
