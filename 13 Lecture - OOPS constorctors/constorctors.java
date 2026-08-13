public class constorctors {
    public static void main(String[] args) {
        Student s1 = new Student("Maaz", 23,1,"BU");
        s1.studentData();
    }
}

class Student {
    String name;
    int age;
    int rollNo;
    String clg;

    Student(){
        this("Undefine");
    }

    Student(String name){
        this(name, 0);
    }

    Student(String name, int age) {
        this(name, age, 0);
    }

    Student(String name, int age, int rollNo) {
        this(name, age, rollNo, "Undefine");
    }

    Student(String name, int age, int rollNo, String clg) {
        this.name = name;
        this.age  = age;
        this.rollNo = rollNo;
        this.clg = clg;
    }


    void studentData() {
        System.out.println(name + " " + age + " " + rollNo + " " + clg);
    }
}
