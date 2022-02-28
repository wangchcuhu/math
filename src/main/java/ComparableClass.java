/**
 * @program: 数据结构和算法
 * @description: 比较实现对象
 * @author: Z-Man
 * @create: 2022-02-18 09:15
 */
public class ComparableClass implements Comparable<ComparableClass>{
    private int id;

    public ComparableClass(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(ComparableClass o) {
      if (id>o.id)return 1;
      if (id<o.id)return -1;
      return 0;
    }
}


