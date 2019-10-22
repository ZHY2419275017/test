import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("_A");
            }
        });

         Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                    System.out.print("_B");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
                    System.out.print("_C");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(s);
        thread1.start();
        thread2.start();
        thread3.start();








    }
}
