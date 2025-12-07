import java.util.Scanner;
//CODE BY JEREMY
public class ArrayNubers11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] num = new double[4];

        num[0] = 5.0;
        num[1] = 12867;
        num[2] = 7.5;
        num[3] = 20000000;

        for (int i = 0; i < 4; i++){
            System.out.println(num[i]);
        }
        scanner.close();
        }
}
