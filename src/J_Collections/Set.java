package J_Collections;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
//        HashSet<Student> students = new LinkedHashSet<>();
//        students.add(new Student(1, "a"));
//        for (Student student : students) {
//            System.out.println(student.getName());
//        }

////random order
//        HashSet<Integer> integers=new HashSet<>();
//        same order
//        HashSet<Integer> integers=new LinkedHashSet<>();
//        Ascending order
        java.util.Set<Integer> integers = new TreeSet<>();

        Integer one = 1;
        integers.add(3);
        integers.add(one);
        integers.add(one);
        integers.add(2);
//        integers.add(null);
        System.out.println("Test");
        for (Integer i : integers) {
            System.out.println(i);
        }

    }


}
