package G_Thread;

public class G_Thread_Main extends Thread {
    public void run(){
        System.out.println("as");
    }
    public static void main(String[] args) {
        G_Thread_Main g_thread=new G_Thread_Main();
        g_thread.start();
    }
}
