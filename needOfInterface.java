interface Computer {
    void code() ;

}

class Desktop implements Computer {
    public void code() {
        System.out.println("code..compile...test...run : Faster");
    }
}

class Laptops implements Computer {
    public void code() {
        System.out.println("code..compile...test...run");
    }

}


class Developer{
    public void devApp(Computer comp) {
        // System.out.println("Coding");
        comp.code();
    }

}
public class needOfInterface {
    public static void main(String[] args) {
        Computer lap = new Laptops();
        Computer desk = new Desktop();

        Developer dep = new Developer();
        dep.devApp(desk);
    }
}
