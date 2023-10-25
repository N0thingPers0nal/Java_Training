package I_Exception;

public class I_Main {
    public static void main(String[] args) {
        try {
            new Test().test_Throw();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try{
            int a=1/0;
        }
        catch (Exception e){
            if(e instanceof ArithmeticException){
                System.out.println("Error");
            }
            else{
                System.out.println(e);
            }
        }
    }
}
class Test{
    void test_Throw() throws Exception{
        throw new Exception("Custom ");
    }
}