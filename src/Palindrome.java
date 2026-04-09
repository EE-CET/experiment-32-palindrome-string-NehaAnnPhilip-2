import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the string
        if (!sc.hasNextLine()) return;
        String input = sc.nextLine();

        // TODO: Convert to lower case (to handle 'Malayalam' correctly)
        String s = input.toLowerCase();

        // TODO: Check if the string is the same reversed
        boolean isPalindrome = true;
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // TODO: Print "1" if palindrome, "0" if not
        if (isPalindrome) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        sc.close();
    }
}
