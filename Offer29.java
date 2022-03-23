import java.util.*;

public class Offer29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix == null)
            return new int[0];

        int m = matrix.length;
        int n = matrix[0].length;
        int[] nums = new int[m * n];
        int l = 0, r = n - 1, u = 0, d = m - 1;
        int x = 0;
        while (true) {
            for (int j = l; j <= r; j++) {
                nums[x] = matrix[u][j];
                x++;
            }
            if (++u > d) {
                break;
            }

            for (int i = u; i <= d; i++) {
                nums[x] = matrix[i][r];
                x++;
            }
            if (--r < l) {
                break;
            }

            for (int j = r; j >= l; j--) {
                nums[x] = matrix[d][j];
                x++;
            }
            if (--d < u) {
                break;
            }

            for (int i = d; i >= u; i--) {
                nums[x] = matrix[i][l];
                x++;
            }
            if (++l > r) {
                break;
            }
        }

        // 不知道数组返回后再main方法中如何输出，所以在方法中打印了
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行数:");
        int row = sc.nextInt();
        System.out.println("输入列数:");
        int column = sc.nextInt();
        int array[][] = new int[row][column];
        System.out.println("输入数组:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        Offer29 o = new Offer29();
        o.spiralOrder(array);
        sc.close();
    }
}
