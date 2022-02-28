package algorithmAnalysis;

/**
 * @program: 数据结构和算法
 * @description:算法分析
 * @author: Z-Man
 * @create: 2022-02-18 14:54
 */
public class AlgorithmAnalysis {
    //一个简单的运行时间计算
    public static int sum(int n ){
        int partialSum;
        partialSum=0;
        for (int i = 0; i <=n; i++) {
            partialSum = partialSum + i*i*i;
        }
        return partialSum;
    }
    //最大子序列和的问题
    //第一种方法，进行穷举的方式(从第一个加，每次累加知道最后一个)
    public static final int sum1(int[] a) {
        int maxSum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum=0;
                for (int k = i; k <=j; k++) {
                    thisSum += a[k];
                    if (thisSum > maxSum) {
                        maxSum = thisSum;
                    }
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6,-5};
        System.out.println(sum1(a));
    }
}
