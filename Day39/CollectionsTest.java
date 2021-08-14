package Day39;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName: CollectionsTest
 * @Description: Collections：操作Collection、Map的工具类
 * @Author: TianXing.Xue
 * @Date: 2021/8/4 15:49
 * @Version: 1.0
 *
 * 面试题：Collection 和 Collections的区别
 **/

public class CollectionsTest {
    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(765);
        list.add(765);
        list.add(-97);
        list.add(0);

        System.out.println(list);

        //Collections.reverse(list);

        //对List集合元素进行随机排序
        //Collections.shuffle(list);

        //Collections.sort(list);

        //Collections.swap(list,1,2);

        //Comparable max = Collections.max(list);
        //System.out.println(max);

        //返回指定集合中指定元素的出现次数
        int frequency = Collections.frequency(list, 765);
        System.out.println(frequency);

        System.out.println(list);
    }

    @Test
    public void test2() {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);

        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());  //5个null
        Collections.copy(dest, list);

        System.out.println(dest);

        List list1 = Collections.synchronizedList(list);
    }
}
