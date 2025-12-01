import org.junit.Test;
import java.util.Arrays;
//测试例子：数组1，2，3，4，5，6
//输出：[720, 360, 240, 180, 144, 120]
public class L2023113468_18_Test {

    @Test
    public void testProductExceptSelf() {
        Solution s = new Solution();

        int[] nums = {1,2,3,4,5,6};
        int[] expected = {720, 360, 240, 180, 144, 120};

        int[] result = s.productExceptSelf(nums);

        // 断言内容是否相等
        org.junit.Assert.assertArrayEquals(expected, result);
    }
}

