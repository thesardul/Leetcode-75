package leetcode_75.bit_Manipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] A = {2, 2, 1};
        System.out.println(singleNumber(A));
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans ^= i;
        }
        return ans;
    }
}
