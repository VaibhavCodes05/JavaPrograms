import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :  ");
        int number = sc.nextInt();

        boolean isPrime = checkPrimeNumber(number);

        if(isPrime){
            System.out.println("Given Number " + number + " is a prime number.");
        }else{
            System.out.println("Given Number " + number + " is not a prime number.");
        }


    }

    private static boolean checkPrimeNumber(int number){

        if(number<=1)return false;
        if(number==2)return true;

        for(int i = 2; i<=Math.sqrt(number); i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
