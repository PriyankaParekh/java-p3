class Demo {
    public static void method1() {
        System.out.println("Method-1 of the parent class is executed.");
    }

    public void method2() {
        System.out.println("Method-2 of the parent class is executed.");
    }
}

public class p3 extends Demo {
    public static void method1() {
        System.out.println("Method-1 of the child class is executed.");
    }

    public void method2() {
        System.out.println("Method-2 of the child class is executed.");
    }

    public static void main(String args[]) {
        Demo d1 = new Demo();

        Demo d2 = new p3();

        d1.method1();
        d2.method2();

        d1.method1();
        d2.method2();
    }
}