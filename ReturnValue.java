interface ret {
    int add (int x, int y);
}
//lambda expression works with functional Interface only
public class ReturnValue {
    public static void main(String[] args) {

        ret obj = (x,y) ->  x + y;

        int r1 = obj.add(6,7);
        System.out.println(r1);
    }
}
