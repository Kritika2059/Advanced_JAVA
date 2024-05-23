class M {
    public void show() {
        System.out.println("In M show");
    }
}

abstract class M1 {
    public void show() {
        System.out.println("In M1 show");
    }
}

public class anonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous inner class that extends M and overrides the show method
        M obj = new M() {
            // Overriding the show method in an anonymous inner class
            @Override
            public void show() {
                System.out.println("In new show, anonymous inner class");
            }
        };
        obj.show(); // Output: In new show, anonymous inner class

        // Anonymous inner class that extends M1 and overrides the show method
        M1 obj1 = new M1() {
            // Overriding the show method in an anonymous inner class
            @Override
            public void show() {
                System.out.println("In overridden M1 show, anonymous inner class");
            }
        };

        obj1.show(); // Output: In overridden M1 show, anonymous inner class
    }
}
