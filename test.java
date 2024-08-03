import java.util.Scanner;

public class test {
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayisini giriniz : ");
        int n2 = input.nextInt();

        for (int k = n1; k >= 1; k--) {
            if ( n1 % k == 0 && n2 % k == 0 ){
                int ebob = k;
                System.out.println(ebob);
                break;
            }

        }
        System.out.print("y1 sayisini giriniz : ");
        int y1 = input.nextInt();

        System.out.print("y2 sayisini giriniz : ");
        int y2 = input.nextInt();

        for ( int i = 1; i <= (n2 * n2); i++) {
            if ( i % y1 == 0 && i % y2 == 0){
                System.out.println(i);
                break;
            }
        }


    }







