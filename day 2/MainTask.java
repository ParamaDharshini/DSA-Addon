package day2;

public class MainTask {
	 public static boolean isPalindrome(String s) {
	       s = s.toLowerCase();
	       String rev = "";
	       for (int i = s.length() - 1; i >= 0; i--) {
	           rev = rev + s.charAt(i);
	       }
	       return s.equals(rev);
	   }
	   public static void main(String[] args) {
	       String s = "Maam";
	       boolean res = isPalindrome(s);
	       if (res) {
	           System.out.println('"' + s + '"' + " is a palindrome.");
	       } else {
	           System.out.println('"' + s + '"' + " is not a palindrome.");
	       }
	}

}
