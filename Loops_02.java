import java.util.Scanner;

public class Loops_02 {
    public static void main(String[] args) {
        // Print number from 1 to 20
        // While loop
        int i = 1;
        while (i < 21) {
            System.out.println(i);
            i++;
        }

        // Print even numbers from 1 to 20
        for (int i1 = 1; i1 <= 10; i1++) {
            System.out.println(2 * i1);
        }

        // Print odd numbers from 1 to 20
        for (int i2 = 1; i2 <= 10; i2++) {
            System.out.println(2 * i2 + 1);
        }

        // reverse counting from 10 to 0
        for (int f = 10; f >= 0; f--) {
            System.out.println(f);
        }

        // sum of even numbers from 1 to 100
        int sum = 0;
        for (int s = 1; s <= 50; s++) {
            int even = 2 * s;   // even numbers
            sum = sum + even;   // sum of even number
        }
        System.out.println(sum);

    }
}

