package ex_collection_framework_list;

import java.util.ArrayList;
import java.util.List;

public class Lab14_ArrayList_class_element {
    public static void main(String[] args) {

        student s1 = new student("manoj","1");
        student s2 = new student("kumar","2");
        student s3 = new student("gollapalli","3");

        List<student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);



    }
}
