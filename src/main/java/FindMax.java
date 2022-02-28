import java.util.Comparator;

/**
 * @program: 数据结构和算法
 * @description:比较器的做法
 * @author: Z-Man
 * @create: 2022-02-18 14:38
 */
public class FindMax {
    public static <T>  T findMax(T[] arr,Comparator<? super T> cmp) {
        int maxIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (cmp.compare(arr[i],arr[maxIndex])>0) maxIndex=i;
        }
        return  arr[maxIndex];
    }

    public static void main(String[] args) {
        String[] arr = {"Book","Math", "Book", "English"};
        System.out.println(findMax(arr, new CaseComparable()));
    }
}
class CaseComparable implements Comparator<String> {

    public int compare(String a,String b) {
        return a.compareToIgnoreCase(b);
    }
}