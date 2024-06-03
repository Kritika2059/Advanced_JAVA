import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UsingList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(2);
        nums.add(50);
        nums.add(-5);
        nums.add(55);


        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(-5));


        Set<Integer> nums2 = new HashSet<Integer>();

        nums2.add(22);
        nums2.add(5);
        nums2.add(17);
        nums2.add(-13);
        nums2.add(15);

        System.out.println("Using Set");
        for(int n: nums2) {
            System.out.println(n);
        }
System.out.println("Using Iterator");
        Iterator<Integer> values = nums2.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }


    }
}