package Day39;

import Day38.Users;
import org.junit.Test;

import java.util.*;

/**
 * @ClassName: TreeMapTest
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/8/4 14:48
 * @Version:
 **/
public class TreeMapTest {

    //向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
    //因为要按照key进行排序：自然排序、定制排序
    //自然排序
    @Test
    public void test1() {
        TreeMap map = new TreeMap();
        Users u1 = new Users("Tom", 23);
        Users u2 = new Users("Jerry", 32);
        Users u3 = new Users("Jack", 20);
        Users u4 = new Users("Rose", 18);
        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 76);
        map.put(u4, 100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }

    //定制排序

    @Test
    public void test2() {
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Users && o2 instanceof Users) {
                    Users users1 = (Users) o1;
                    Users users2 = (Users) o2;

                    return Integer.compare(users1.getAge(), users2.getAge());
                }
                throw new RuntimeException("输入的类型不匹配");
            }
        });

        Users u1 = new Users("Tom", 23);
        Users u2 = new Users("Jerry", 32);
        Users u3 = new Users("Jack", 20);
        Users u4 = new Users("Rose", 18);
        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 76);
        map.put(u4, 100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
