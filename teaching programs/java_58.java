/**
 * 双向链表的使用
 * 
 * 剩下的我就不写了，双向链表与循环链表差不多
 */

public class java_58 {
    public static void main(String[] args) {

    }
}

class toLink_DoubleLinkListTest {

    DoubleLinkListTest head = new DoubleLinkListTest(0, "");

    public void printfDoubleLinkListTest() {// 打印链表//==============================

        if (head.next == null) {

            System.out.println("为空链表");
            return;
        }

        DoubleLinkListTest temp = head.next;
        while (temp != head) {

            temp.myprint();
            temp = temp.next;
        }
    }

    public void addDoubleLinkListTest(DoubleLinkListTest d) {

        DoubleLinkListTest temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }

        temp.next = d;
        d.next = head;
        head.prev = d;
    }

    public void changeDoubleLinkListTest(DoubleLinkListTest d) {

        if (head.next == null) {

            System.out.println("链表为空");
            return;
        }

        DoubleLinkListTest temp = head.next;
        while (temp != null) {

        }
    }

}

class DoubleLinkListTest {

    int id;
    String name;
    DoubleLinkListTest prev;
    DoubleLinkListTest next;

    DoubleLinkListTest(int id, String name) {

        this.id = id;
        this.name = name;
    }

    String myprint() {

        return ("id是:" + id + "\n名字是:" + name);
    }
}
