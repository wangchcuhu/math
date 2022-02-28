import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: 数据结构和算法
 * @description: 数组
 * @author: Z-Man
 * @create: 2022-02-18 08:49
 */
public class Arr {
     //找出数组中的最大数
    public static Comparable findMax(Comparable[] arr) {
        int MaxIndex=0;
        for (int i = 0; i < arr.length; i++) {
            //和最大的比较，比较的规则是由Comparable决定的
           if (arr[i].compareTo(arr[MaxIndex])>0) MaxIndex=i;
        }
        return MaxIndex;
    }
    public static void totalArea(Collection<Shape> collection) {
        System.out.println("success");
    }
    public static void main(String[] args) {
        Comparable[] a = {new ComparableClass(2), new ComparableClass(5), new ComparableClass(1)};
        //调用方法找出最大的那个值
        System.out.println(findMax(a));
        //验证一下泛型以及泛型集合不是协变
        Collection<Shape> collection = new ArrayList<>();
        Collection<Square> collection1 = new ArrayList<>();
        totalArea(collection);//成功
//        totalArea(collection1);//失败
    }
}

@Getter @Setter
class Shape{
    int areas;
}

class Square extends Shape {
}















