import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ab = new int[5];
        
        for(int i = 0; i<5; i++){
            ab[i] = sc.nextInt();
        }

        for(int i = 0; i<5; i++){
            System.out.println(ab[i]);
        }
    }
}
