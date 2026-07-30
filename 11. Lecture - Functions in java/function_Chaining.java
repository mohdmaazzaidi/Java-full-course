public class function_Chaining {

    static String name = "jhon";  // Created global variable
    public static void main(String[] args) {
        System.out.println(name);
        A();
    }

    
    // function chaining.

    static void A(){
        B();
        System.out.println("bye!");
    }

    static void B(){
        C();
        System.out.println("How are you?");
    }

    static void C(){
        System.out.println("Hello");
        System.out.println(name);
    }


    
}
