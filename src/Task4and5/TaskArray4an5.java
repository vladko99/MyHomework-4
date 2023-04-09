package Task4and5;

import java.util.Scanner;
public class TaskArray4an5 {
    /*
   Задача:4
    Напишете програма (метод), която отпечатва на конзолата числата от 1 до N.
    Числото N се приема като параметър.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for n: ");
        int n = Integer.parseInt(sc.next());

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "  ");
        }
        /*
        Задача:5
        Напишете програма, която отпечатва на конзолата
        числата от 1 до n, които не се делят на 3 и 7.
         */
        System.out.print("\n\nNumbers not divided by 3 & 7:  ");

        for (int i = 1; i <=n; i++) {
            if (i % 3 != 0 && i % 7 != 0)
                System.out.print(i + "  ");

        }
        System.out.println("\n");
    }
}

