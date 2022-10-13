package obiektowe.multithreading;

public class AbortThread {

    public static void main(String[] args) throws InterruptedException {
        MyTask myTask = new MyTask();
        myTask.start();
        Thread.sleep(1);
//        myTask.getThread().stop();
        myTask.abort();
        System.out.println(myTask.getNumber());
        Thread.sleep(100);
        System.out.println(myTask.getNumber());
    }
}
