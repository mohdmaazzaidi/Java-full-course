public class demo {
    public static void main(String[] args) {
        int n = 5;
        printnum(n);
    }

    static void printnum(int num){
        if(num == 0){
            return;
        }
        printnum(num - 1);
        System.out.println(num);
    }
}
