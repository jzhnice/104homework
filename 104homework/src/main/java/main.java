import java.util.*;
/**
 * @author jzh
 * @version 1.0
 * @date 2022/1/4 9:49
 * 已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位
 * String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 * 将该数组里面的所有qq号都存放在LinkedList中，
 * 将list中重复元素删除，
 * 将list中所有元素分别用迭代器和增强for循环打印出来。
 */
public class main {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList linklisted = new LinkedList(Arrays.asList(strs));
        System.out.println("初始的数据"+linklisted);
        Set set = new HashSet();
        set.addAll(linklisted);
        linklisted.clear();
        LinkedList linklisted1 = new LinkedList(set);
        System.out.println("增强for循环打印");
        linklisted1.forEach(System.out::println);
        System.out.println("迭代打印");
        Iterator iterator1 = linklisted1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
    }