import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());

        System.out.println(num);

        // New Method
        System.out.println("Enter two Numbers");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        int num3 = num1 + num2;

        System.out.println(num3);

        sc.close();

        bf.close();
    }
}