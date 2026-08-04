public class defaultsValues {
    public static void main(String[] args) {
        // int a;   // Local variable 
        // System.out.println(a); //This will give error because we can not use local variable before initialization.

        Animal a1 = new Animal();
        System.out.println(a1.name);  //Null ----  Instance Variable contains default values
        System.out.println(a1.age);   //0  ---- Instance Variable contains default values
        System.out.println(a1.canEat);
        System.out.println(a1.num);

    }
}

// Instance Variable contains default values 
// String -- null
// Integer - 0
// boolean - false
// Float - 0.0


class Animal{
    String name; // Instance Variable 
    int age;
    boolean canEat;
    float num;

    void canRun(){         // instance function/method
        System.out.println("Yes they can run");
    }
}



