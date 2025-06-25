package ex_collection_framework_list;

import java.util.Stack;

public class Lab13_stack {
    public static void main(String[] args) {

        // stack means last in first out priniciple lifo manner

        Stack s = new Stack<>();
        s.add("manoj");
        s.add("kumar");
        s.add("gollapalli");
        s.add("gollapalli2");
        System.out.println(s);


        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop()); // pop means remove
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.add("tinku"));
        System.out.println(s);
    }
}
