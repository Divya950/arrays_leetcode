public class isPalindrome_Num {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int rem = 0;
        int o = x;
        while (x > 0) {
            rem = x % 10;
            ans = ans * 10 + rem;
            x /= 10;
        }
        if (ans == o) return true;

        return false;
    }
}
