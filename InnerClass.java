class Ai {
    private int age;

    public void show() {
        System.out.println("In A show");
    }

    class Bi {//inner class
        public void config() {
            System.out.println("In B config");
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        //to call show() it is very easy 
        Ai obj = new Ai();
        obj.show();

        Ai.Bi obj1 = obj.new Bi();
        //we can make inner class as static class, and we know that we dont need object for static class, if B was static classs then
        // A.B obj2 =new A.B();

        obj1.config();

    }

}