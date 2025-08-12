import java.util.Scanner;

public class Userinput {
    public  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first no");
        int a = sc.nextInt();
        System.out.println("Enter a second no");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of numbers:" + sum);
        float c = sc.nextFloat();
        System.out.println("Enter a float number");
        float d = sc.nextFloat();
        System.out.println("Enter a float number");
        float add = c + d;
        System.out.println("Add:" + add);


    }
    
}
