class Thread1 implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread1");
                Thread.sleep(2000);
            }
        } catch (Exception e) {}
    }
}

class Thread2 implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread2");
                Thread.sleep(4000);
            }
        } catch (Exception e) {}
    }
}

class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        t1.start();
        t2.start();
    }
}
