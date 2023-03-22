package Practice;
import java.util.*;
public class pallindromeCheck {
    public static void main(String[] args) {
       
      System.out.print("Enter a number: ");
      int num = -121;
      if (num < 0) {
          num = -num; // make negative number positive
      }

      int reversed = 0;
      int original = num;

      while (num != 0) {
          int digit = num % 10;
          reversed = reversed * 10 + digit;
          num /= 10;
      }

      if (original < 0) {
          reversed = -reversed; // make reversed number negative
      }

      if (original == reversed) {
          System.out.println(original + " is a palindrome.");
      } else {
          System.out.println(original + " is not a palindrome.");
      }
  }
}

