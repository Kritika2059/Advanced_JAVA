enum Laptop2 {
    MacBook(2000), XPS(1800), VivoBook(1200), Vostro(1100);

    private int price;

    private Laptop2(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class enums2 {

    public static void main(String[] args) {

        Laptop2 lap = Laptop2.VivoBook;

        System.out.println(lap + ":" +lap.getPrice());

        //to print all values, we use enhanced for loop

        for (Laptop2 lap1 : Laptop2.values()) {

            System.out.println(lap1 + ":" +lap.getPrice());

        }
    }

}