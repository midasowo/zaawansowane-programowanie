package obiektowe.multithreading;

public class ThreadsDemo {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("o t h e r     t h r e a t");
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();//nie run!


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("AAAAAA N O T H E RRRRRRR          THREAD!!");
            }
        });
        thread2.start();

        thread.join();
        System.out.println("-----------KONIEC PRACY wątku 1");
        thread2.join();
        System.out.println("-----------KONIEC PRACY wątku 2");

        for (int i = 0; i < 1000; i++) {
            System.out.println("MAIN MAIN MAIN");
        }
    }
}
