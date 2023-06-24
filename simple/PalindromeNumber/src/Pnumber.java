import java.util.ArrayList;

public class Pnumber {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // 负数不是回文数
        }

        int original = x; // 保存原始数字
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

}
