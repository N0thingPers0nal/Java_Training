package J_Collections;

public class Student {
//    Encapsulation
    private int rollNo;
    private String name;

    public Student() {
    }


    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
