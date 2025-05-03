import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = sc.nextInt();

        System.out.println("Prime numbers are upto " + num + " are : ");

        for(int i =2; i< num; i++){
            if(isPrime(i)){
                System.out.print(i +  " ");
            }
        }

    }

    private static boolean isPrime(int num){
        for(int i = 2; i< Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }

        }
        return true;
    }
}
