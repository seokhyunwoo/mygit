import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        String val = "long";
        for (int i = 1; i <= num1; i+=4) {
            System.out.print(val + " ");
        }
        System.out.println("int");

        }
        
    }



