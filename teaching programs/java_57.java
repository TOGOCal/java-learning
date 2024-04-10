
/**
 * Java中链表的使用
 * 这里的是单项链表
 * 链表中表头是不存入信息且不可改变的
 * 表末一定是空指针，也不存入信息
 */

import java.util.Scanner;

public class java_57 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        toLink_linkListTest test = new toLink_linkListTest();
        boolean key = true;

        while (key) {

            todomenu.printmenu();
            char a = s.nextLine().charAt(0);
            switch (a) {
                case '1':
                    test.printflinkListTest();
                    break;

                case '2':

                    System.out.print("输入id:");
                    int id = s.nextInt();
                    s.nextLine();

                    System.out.print("输入name:");
                    String name = s.nextLine();

                    linkListTest l = new linkListTest(id, name);
                    test.addList(l);
                    break;

                case '3':
                    System.out.print("想要修改节点的id:");
                    int id_ = s.nextInt();
                    s.nextLine();

                    System.out.print("想要修改为什么:");
                    String name_ = s.nextLine();

                    linkListTest l2 = new linkListTest(id_, name_);
                    test.changeList(l2);

                    break;

                case '4':// 删除节点（还没看懂
                    System.out.print("想要删除的那个节点的id:");
                    int _id = s.nextInt();
                    s.nextLine();
                    test.deleteList(_id);
                    break;

                case '5':

                    test.sortLinkListTest1();
                    break;

                default:
                    key = false;
                    break;
            }
            System.out.println();
        }

        s.close();
    }

}

class todomenu {

    public static void printmenu() {

        System.out.println("请选择你需要进行的操作：");
        System.out.println("如果多输入按照第一个输入的数字为准");
        System.out.println("1.打印链表\t2.添加节点");
        System.out.println("3.修改节点\t4.删除节点");
        System.out.println("5.按照id进行排序(通过交换内容)");
        System.out.println("else:退出程序");
        System.out.println("======================================================");

    }

}

class toLink_linkListTest {// 这是构建链表

    private linkListTest head = new linkListTest(0, "");// 构建头节点

    public linkListTest getHead() {// 返回类型为其中一个节点

        return head;// 返回头文件
    }

    public void printflinkListTest() {// 打印链表//=======================================

        if (head.next == null) {

            System.out.println("该链表为空");
            return;
        }

        linkListTest temp = head.next;

        while (temp != null) {

            System.out.println(temp.myPrint());
            temp = temp.next;
        }
    }

    public void addList(linkListTest l) {// 添加某个节点//===============================================

        linkListTest temp = head;// 由于head是private（防止头文件被修改）

        while (true) {

            if (temp.next == null) {// 链表最终是一个空指针
                // 加入的节点添加到链表的最后
                break;
            }
            temp = temp.next;
        }
        temp.next = l;
    }

    public void changeList(linkListTest l) {// 修改某个节点中的信息//============================================

        if (head.next == null) {// 由于head是定义在这个类里面，所以可以直接调用

            System.out.println("链表为空");
            return;
        }

        linkListTest temp = head.next;
        boolean key = false;
        while (temp != null) {

            if (temp.id == l.id) {

                key = true;
                break;
            }
            temp = temp.next;
        }

        if (key) {

            temp.name = l.name;// 将对应节点的信息修改
        } else {

            System.out.println("找不到该id对应的节点");
        }
    }

    public void deleteList(int id) {// 删除链表

        if (head.next == null) {

            System.out.println("为空链表");
            return;
        }

        linkListTest temp = head;

        while (temp.next != null) {

            if (temp.next.id == id) {

                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

        System.out.println("没有找到该id");
    }

    public void sortLinkListTest1() {// 排序链表

        if (head.next == null) {

            System.out.println("链表为空");
            return;
        }

        linkListTest temp1 = head;
        while (temp1.next != null) {
            linkListTest temp2 = temp1.next;
            while (temp2.next != null) {

                if (temp1.next.id > temp2.next.id) {

                    // 交换2 和 3
                    // 相当于交换1.next指向3，2.next指向4 3.next指向2
                    listcopy(temp1.next, temp2.next);

                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
    }

    public void listcopy(linkListTest l1, linkListTest l2) {// 交换两个位置的值

        l1.id = l1.id ^ l2.id;
        l2.id = l1.id ^ l2.id;
        l1.id = l1.id ^ l2.id;

        String str = l1.name;
        l1.name = l2.name;
        l2.name = str;
    }
}

class linkListTest {// 构建每一个节点

    public int id;
    public String name;
    public linkListTest next;// 访问下一个节点

    public linkListTest(int id, String name) {

        this.id = id;
        this.name = name;
    }

    String myPrint() {

        return ("id是" + id + "\n名字是:" + name);
    }
}
