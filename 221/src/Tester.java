public class A {
    private int x = 25;

    public A() {
        x = 10;
    }

    public void setX(int a) {
        x = a;
    }

    public String toString() {
        return "x = " + x;
    }
}

public class B extends A {

    private int y;

    public B(int a) {
        super();
        y = a;
    }

    public B(int a, int b) {
        super();
        setX(a);
        y = b;
    }

    public String toString() {
        return super.toString() + ", y = " + y;
    }
}

    public class TestBandA {

        public static void main (String[] args) {

            B q = new B(100);
            System.out.println(q);
            A r = new A();
            System.out.println(r);
            B s = new B(1, 2);
            System.out.println(s);
        }
    }
}