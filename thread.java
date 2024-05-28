class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}

public class thread {

    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();


        obj1.start();
        obj2.start(); // now obj1 and obj2 are threads

    }

}