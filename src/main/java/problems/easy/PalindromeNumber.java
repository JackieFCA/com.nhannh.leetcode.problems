package problems.easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < -231 || x > 230) {
            return false;
        }

        int temp = x;
        int reverseX = 0;
        while (temp > 0) {
            int modX = temp % 10;
            reverseX = (reverseX * 10) + modX;
            temp = temp / 10;
        }
        return x == reverseX ? true : false;
    }
}
