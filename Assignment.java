import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.Armstrong Number
        System.out.print("Enter a number for Armstrong: ");
        int num = sc.nextInt();
        int temp = num, sum = 0, digits = String.valueOf(num).length();
        while (num != 0) {
            int d = num % 10;
            sum += Math.pow(d, digits);
            num /= 10;
        }
        if (sum == temp) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");

        // 2.Count Digits
        System.out.print("\nEnter a number to count digits: ");
        int n1 = sc.nextInt();
        int count = 0;
        int copy1 = n1;
        while (copy1 != 0) {
            copy1 /= 10;
            count++;
        }
        System.out.println("Digits = " + count);

        // 3.Factorial
        System.out.print("\nEnter a number for factorial: ");
        int n2 = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n2; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);

        // 4.Fibonacci
        System.out.print("\nEnter how many terms for Fibonacci: ");
        int n3 = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Series: " + a + " " + b + " ");
        for (int i = 2; i < n3; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();

        // 5.Multiplication Table
        System.out.print("\nEnter number for table: ");
        int n4 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n4 + " x " + i + " = " + (n4 * i));
        }

        // 6.Palindrome String
        sc.nextLine(); 
        System.out.print("\nEnter a word for palindrome: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        // 7.Prime Check
        System.out.print("\nEnter number for prime: ");
        int n5 = sc.nextInt();
        boolean flag = true;
        if (n5 <= 1) flag = false;
        else {
            for (int i = 2; i <= Math.sqrt(n5); i++) {
                if (n5 % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) System.out.println("Prime");
        else System.out.println("Not Prime");

        // 8.Pythagorean Triplets
        System.out.print("\nEnter limit for triplets: ");
        int n6 = sc.nextInt();
        boolean found = false;
        for (int x = 1; x < n6; x++) {
            for (int y = x; y < n6; y++) {
                int z = (int) Math.sqrt(x * x + y * y);
                if (z * z == x * x + y * y && z <= n6) {
                    System.out.println(x + " " + y + " " + z);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("No triplets");

        // 10.Strong Number
        System.out.print("\nEnter number for strong: ");
        int n7 = sc.nextInt();
        int temp2 = n7;
        int sum2 = 0;
        while (n7 != 0) {
            int d = n7 % 10;
            int f = 1;
            for (int i = 1; i <= d; i++) {
                f *= i;
            }
            sum2 += f;
            n7 /= 10;
        }
        if (sum2 == temp2) System.out.println("Strong");
        else System.out.println("Not Strong");

        // 11.Sum of Digits
        System.out.print("\nEnter number for digit sum: ");
        int n8 = sc.nextInt();
        int s = 0;
        while (n8 != 0) {
            s += n8 % 10;
            n8 /= 10;
        }
        System.out.println("Sum = " + s);

        // 12.Sum of Natural Numbers
        System.out.print("\nEnter n for natural sum: ");
        int n9 = sc.nextInt();
        int s2 = 0;
        for (int i = 1; i <= n9; i++) {
            s2 += i;
        }
        System.out.println("Natural Sum = " + s2);

        sc.close();
    }
}