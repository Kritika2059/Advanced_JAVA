//while using List or ArrayList we know that they have index value like 0,1,2,3 what if we want different kinds of index values like any name in that case we use map, it has a key and value

import java.util.HashMap;
import java.util.Map;

public class UsingMap {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();
        // HashTable

        students.put("Kritika", 100);
        students.put("Kridip", 65);
        students.put("Diya", 77);
        students.put("Basant", 83);
        students.put("Gyanu", 72);

        System.out.println(students);
        // to get individual => use key

        System.out.println(students.get("Kritika"));

        // to change
        students.put("Gyanu", 66);
        // as we are not geting new Gyanu, so we conclude that key cannot be repeated

        // to print one by one we use enhanced for loop

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }

}