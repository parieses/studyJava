package secondLearning.red;

import java.util.ArrayList;

/**
 * totalMoney 总金额 单位分
 * totalCount 红包个数
 *
 * @ ArrayList<Integer> 各个红包的金额值
 */
public interface OpenMode {
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}
