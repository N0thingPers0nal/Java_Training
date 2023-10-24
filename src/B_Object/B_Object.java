package B_Object;

import A_Object.A_Object;

public class B_Object {
    public static void main(String[] args) {
        B_Object a=new B_Object();
        a.inside();
        Outside b=new Outside();
        b.out();
//        From other package
        A_Object c=new A_Object();
        c.a();
        System.out.println(c.b());
    }
    void inside(){
        System.out.println("Inside the same class");
    }
}

