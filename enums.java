enum Status {
    Running, Failed, Pending, Success;
}

public class enums {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        //print all
        for (Status s1 : Status.values()) {
            System.out.println(s1);
        }
    }
}