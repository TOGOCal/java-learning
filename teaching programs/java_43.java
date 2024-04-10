/**
 * 通过for-each遍历数组元素
 */

public class java_43 {
    public static void main(String[] args) {
        String ss[] = { "a", "bb", "ccc", "dddd" };// 这是另一种声明数组的方式
        for (String temp : ss) {// temp的名字随便取//String为数据类型

            System.out.print(temp);
            System.out.print("\t");// 这种方法只能读取而不能修改元素的值
            // 同时也不设计索引的操作
        }
    }
}
