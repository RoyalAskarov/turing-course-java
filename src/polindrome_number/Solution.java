package polindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int a = x, b = 0;
        while (x != 0) {
            b = b * 10 + (x % 10);
            x /= 10;
        }
        return a == b;
    }
}
