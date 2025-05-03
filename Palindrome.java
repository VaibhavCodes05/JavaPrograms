import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");

        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length- 1;
        boolean isPalindrome = true;
        while(left<right){
            if(arr[left] != arr[right]){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome?"Given string is a Palindrome " : "Not a Palindrome ");

        sc.close();
    }
}
