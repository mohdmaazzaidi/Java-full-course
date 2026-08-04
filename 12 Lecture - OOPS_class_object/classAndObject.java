public class classAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Maaz";
        s1.age = 23;
        s1.rollNo = 233;


        s2.name = "Sam";
        s2.age = 24;
        s2.rollNo = 234;
        
        s1.printMsg();
        System.out.println();
        s2.printMsg();

    }
}


class Student{
    String name;
    int age;
    int rollNo;

    void printMsg(){
        System.out.println(name + " Can go college");
        System.out.println("His age is : " + age);
        System.out.println("His rollNo. is : " + rollNo);
    }
}
