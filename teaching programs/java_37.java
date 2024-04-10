
/**
 * 测试多态
 * 以及抽象方法
 */

import java.util.Scanner;

public class java_37 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int an = s.nextInt();
        // animal a=animal();//抽象类无法被直接申请为对象，最终一定要求要实现抽象方法

        if (an == 1) {

            animalshout(new dog());
        } else {

            animalshout(new cat());
        }

        s.close();
    }

    static void animalshout(animal a) {// 此即实现了多态

        a.shout();
    }
}

abstract class animal {// 有抽象方法的类只能被定义为抽象类

    public abstract void shout();// 定义了一个抽象的方法shout；
    // 抽象即代表不必在该类中实现，但子类继承时却一定要具体实现

    public void food() {

        System.out.println("低级消费者");
    }
}

class dog extends animal {

    public void shout() {

        System.out.println("汪汪汪");// 如果不实现父类中的shout方法，则会报错，无法继承
    }

    public void food() {

        System.out.println("狗骨头");
    }
}

class cat extends animal {

    public void shout() {

        System.out.println("喵喵喵");
    }

    public void food() {

        System.out.println("鱼");
    }
}