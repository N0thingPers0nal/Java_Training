package C_Method;
public class b {
    static int static_number = 1;
    int public_number = 3;
    private int private_number = 23;
    //    Connot access it in C_Method Class
    protected int protected_number = 4;
//    Con access it only in C_Method Class because we imported it

    void print(String a) {
        System.out.println("From class b " + a);
    }
}
