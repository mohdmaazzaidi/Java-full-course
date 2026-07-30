import java.util.Scanner;

public class funnctionOverloading {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sum(23,45,12);
       
        showMsg("Maaz");
    }

    static void sum(){
        System.out.println("Please pass the value of A and B");
    }

    static void sum(int a, int b){
        int ans = a+b;
        System.out.println(ans);
    }

    static void sum(int a, int b, int c){
        int ans = a+b+c;
        System.out.println(ans);
    }

    static void showMsg(){
        System.out.println("Hello");
    }

    static void showMsg(String name){
        System.out.println("Hello "+ name+ "! how are you doing?");
        replyMsg(); // Calling another function inside a function.
    }

    static void replyMsg(){
        String reply = sc.nextLine();
        System.out.println(reply);
    }
}
