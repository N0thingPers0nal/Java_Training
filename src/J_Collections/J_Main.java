package J_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class J_Main {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList.add(2121);
//        System.out.println(arrayList.get(0));
        ArrayList<Student> arrayList=new ArrayList<>();
//        using constuctor
        Student s1=new Student(3,"ram");
        arrayList.add(s1);
//        using setter
        Student s1Setter=new Student();
        s1Setter.setName("ads");
        s1Setter.setRollNo(2);
        arrayList.add(s1Setter);
        arrayList.add(new Student(1,"siva"));

//        print
        System.out.println("Before");
        for(Student student:arrayList){
            System.out.println(student.getName());
        }
//        remove
        arrayList.remove(1);
        //        print
        System.out.println("After");
        for(Student student:arrayList){
            System.out.println(student.getName());
        }
        LinkedList<Student> linkedList=new LinkedList<>();

    }
}
