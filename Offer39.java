public class Offer39 {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int x = 0; // 当前众数

        for (int num : nums) {
            if (vote == 0) {
                x = num;
            }
            vote += (num == x) ? 1 : -1;
        }
        return x;
    }
}
