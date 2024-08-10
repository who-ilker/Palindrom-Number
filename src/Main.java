import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.print("Number: ");
        int num = inp.nextInt();

        if(isPalindrom(num))
            System.out.println("It is a palindrom number");
        else
            System.out.println("It is not.");

    }

    static boolean isPalindrom(int num){

        int temp = num, lastNumber, reverseNumber = 0;
        while (temp != 0){
            lastNumber = temp % 10;
            temp = temp / 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
        }

        if(num == reverseNumber)
            return true;
        else
            return false;
    }
}