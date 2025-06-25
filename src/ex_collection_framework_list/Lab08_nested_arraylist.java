package ex_collection_framework_list;

import java.util.ArrayList;
import java.util.List;

public class Lab08_nested_arraylist {
    public static void main(String[] args) {

        List<String> fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        // fruits1.add(133);
        System.out.println(fruits1);

        List fruits2 = new ArrayList<>();
        fruits2.add("grapes");
        fruits2.add("papaya");
        fruits2.add("watermelon");
        System.out.println(fruits2);

        List vegetables = new ArrayList<>();
        vegetables.add("tamato");
        vegetables.add("onions");
        vegetables.add("potato");
        System.out.println(vegetables);

        List all_fruits_vegetables = new ArrayList<>();
        all_fruits_vegetables.add(fruits1);
        all_fruits_vegetables.add(fruits2);
        all_fruits_vegetables.add(vegetables);

        System.out.println(all_fruits_vegetables);
        System.out.println(all_fruits_vegetables.size());
    }
}
