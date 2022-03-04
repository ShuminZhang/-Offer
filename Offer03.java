
/**
 * 找出数组中重复的数字。
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：

输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3
 */
import java.util.*;

public class Offer03 {
    public int findReaptNumber(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for (int num : nums) {
            if (dic.contains(num)) {
                return num;
            }
            dic.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toString();
        String[] arr = str.split(",");
        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }
        Offer03 o = new Offer03();
        System.out.println(o.findReaptNumber(array));
        sc.close();
    }
}
