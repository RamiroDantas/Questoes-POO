import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        int x;

        x = Ler.nextInt();

        while(x > 1) {

            if(x % 2 == 0){
                x = x / 2;
                System.out.println(x);
            } else if(x % 2 == 1) {
                x = 3 * x + 1;
                System.out.println(x);
            }
            
        }
        
    }
}
