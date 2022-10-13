package obiektowe.multithreading;

public class MyTask implements Runnable {

    private long number = 0;
    private Thread thread = new Thread(this);
    private boolean running = true;

    public void start() {
        thread.start();
    }

    public void abort() {
        running = false;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200_000_000; i++) {
            number++;
            if (!running) {
                System.out.println("PRZERWANO!");
                return;
            }
        }
    }

    public long getNumber() {
        return number;
    }

    public Thread getThread() {
        return thread;
    }
}
