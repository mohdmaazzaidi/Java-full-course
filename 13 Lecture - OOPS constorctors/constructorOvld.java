public class constructorOvld {
    public static void main(String[] args) {
        Student s1 = new Student("Maaz",101, 23);
        

    }
}

class Student{
    String name;
    int age;
    int rollNo;
    String college;

    Student(){
        System.out.println("Please Pass the value");
    }

    Student(String name){
        this.name = name;
        System.out.println("Hello! "+name);
    }

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Hello! "+name);
        System.out.println("Your roll no. is: "+rollNo);
    }

    Student(String name, int rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        System.out.println("Hello! "+name);
        System.out.println("Your roll no. is: "+rollNo);
        System.out.println("Your age is: "+age);
    }

     Student(String name, int rollNo, int age, String college){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.college = college;

        System.out.println("Hello! "+name);
        System.out.println("Your roll no. is: "+rollNo);
        System.out.println("Your age is: "+age);
        System.out.println("Your college is:"+college);
    }
}

