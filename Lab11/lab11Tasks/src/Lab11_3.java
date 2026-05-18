class Priority implements Runnable {
    int count;
    Thread thread;
    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        do {
            count++;
        } while (!stop && count < 10_000_000);

        if (!stop) {
            stop = true;
            System.out.println("WINNER: " + thread.getName());
        }
    }
}

class PriorityDemo {

    public static void main(String[] args) {

        int highWins = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("\n=== RUN " + i + " ===");

            Priority.stop = false;
            Priority.currentName = "";

            // create threads
            Priority high = new Priority("High priority thread");
            Priority low = new Priority("Low priority thread");

            Priority normal1 = new Priority("Normal thread #1");
            Priority normal2 = new Priority("Normal thread #2");
            Priority normal3 = new Priority("Normal thread #3");

            // set priorities
            high.thread.setPriority(Thread.MAX_PRIORITY);
            low.thread.setPriority(Thread.MIN_PRIORITY);

            normal1.thread.setPriority(Thread.NORM_PRIORITY);
            normal2.thread.setPriority(Thread.NORM_PRIORITY);
            normal3.thread.setPriority(Thread.NORM_PRIORITY);

            high.thread.start();
            low.thread.start();
            normal1.thread.start();
            normal2.thread.start();
            normal3.thread.start();

            try {
                high.thread.join();
                low.thread.join();
                normal1.thread.join();
                normal2.thread.join();
                normal3.thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // print results
            System.out.println("High count: " + high.count);
            System.out.println("Low count: " + low.count);
            System.out.println("Normal #1 count: " + normal1.count);
            System.out.println("Normal #2 count: " + normal2.count);
            System.out.println("Normal #3 count: " + normal3.count);

            if (high.count >= 10_000_000) {
                highWins++;
                System.out.println("Winner: HIGH priority thread");
            } else {
                System.out.println("Winner: another thread");
            }
        }

        System.out.println("\n=== FINAL RESULT ===");
        System.out.println("High priority won: " + highWins + "/10 times");
    }
}