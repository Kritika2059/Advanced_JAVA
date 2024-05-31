import java.util.ArrayList;
import java.util.Collection;

public class UsingCollection {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(1);
        nums.add(-5);
        nums.add(55);

        System.out.println(nums);
        for (Object n : nums) {
            int num = (Integer) n;
            System.out.println(num);
        }
    }
}