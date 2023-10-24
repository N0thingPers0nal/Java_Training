package C_Method;
//production Deploy
public class C_Method {
    public static void main(String[] args) {
        a a_class=new a();
        a_class.print();
        b b_class=new b();
        System.out.println("Accessing an static variable from class b "+b.static_number);
        System.out.println("Accessing an public variable from class b "+b_class.public_number);
        System.out.println("Accessing an private variable from class b "+b_class);
        System.out.println("Accessing an protected variable from class b "+b_class.protected_number);
        b_class.print("");

    }
}
