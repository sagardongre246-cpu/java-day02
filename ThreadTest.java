// First Thread A
class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\t From Thread A: i " + i);
        }
        System.out.println("Exit from A");
    }
}

// Second Thread B
class B extends Thread {
    public void run() {
        for (int j = 0; j <= 5; j++) {
            System.out.println("\t From Thread B: j " + j);
        }
        System.out.println("Exit from B");
    }
}

// third Thread C
class C extends Thread {
    public void run() {
        for (int k = 0; k <= 5; k++) {
            System.out.println("\t From Thread C: k " + k);
        }
        System.out.println("Exit from C");
    }
}

// Main Thread
class ThreadTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
    }
}