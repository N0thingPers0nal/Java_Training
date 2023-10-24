package D_Override;

public class Override {
    public static void main(String[] args) {
        Classroom all = new Classroom();
        Classroom al = new Classroom(1);
        all.students();
        all.count();
        Tenth tenth = new Tenth();
        tenth.students();
        tenth.count();
//        Unboxing
        Integer a=3;
        int a1=a;
        System.out.println(a1);
//        Autoboxing
        float numFloat=1.2f;
        int f= (int) numFloat;
        System.out.println(f);
//                                                 check deployment
//        casting
        int int_a=(int) numFloat;

//        upcasting
        Classroom parentToChild=new Tenth();
        parentToChild.students();

//        downcasting
//        Tenth childToParent=new Classroom();
//        chilToParent.students();
    }
}
