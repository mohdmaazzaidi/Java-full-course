public class recursion {
    public static void main(String[] args) {
        printCount(10);
        // System.out.println( printFactorial(15));
        // reversCount(16);
        // System.out.println(sumCount(5));
        // printCount(12);
    }

    
    // When a function call itself ia called recursion

    static void printCount(int num){
        if(num == 0){
            return;
        }
        printCount(num-1);
        System.out.println(num);
    }

    // static long printFactorial(int num){
    //     if(num == 1){
    //         return 1;
    //     }
    //     return num * printFactorial(num-1);
    // }

    // static void reversCount(int num){
    //     if(num == 0 ){
    //         return;
    //     }
    //     System.out.println(num);
    //     reversCount(num - 1);
    // }

    // static int sumCount(int num){
    //     if(num == 0 ){
    //         return 0;
    //     }
    //     return num + sumCount(num-1);
    // }
}
