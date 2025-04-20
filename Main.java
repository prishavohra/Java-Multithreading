// Name:   Prisha Vohra
// PRN no: 23070126096
// Batch: AIML B1 (2023-2027)

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started.");


        //creating the objects from the MyThread.java class
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");


        //starting those threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread ended.");
    }
}
