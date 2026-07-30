public class funtion {
    public static void main(String[] args) {
        msg();
        System.out.println(sum());
        printMsg("Maaz");
        System.out.println(inputOutput(10,45));
    }
    
    // No IP, NO OP
    static void msg(){
        System.out.println("Hello");
    }

    // No IP, OP.
    static int sum(){
        int result = 20+20;
        return result;
    }

    // IP. NO OP
    static void printMsg(String name){
        System.out.println("Hello "+name);
    }

    // IP, OP
    static int inputOutput(int a , int b){
        int result = a + b;
        return result;
    }
}
