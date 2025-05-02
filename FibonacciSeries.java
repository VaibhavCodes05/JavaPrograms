import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Number should be greater than zero");
        }
        System.out.println("Output Series : " + getFibonacciSeries(n));
    }

    public static List<Integer> getFibonacciSeries(int n){
        List<Integer> series = new ArrayList<>();
        int first = 0;
        int second = 1;
        if(n >= 1){
            series.add(first);
        }
        if(n>=2){
            series.add(second);
        }
         for (int i=2; i<n;i++){
            int next = first + second;
            first = second;
            second = next;
            series.add(next);
         }
        return series;
    }
}

