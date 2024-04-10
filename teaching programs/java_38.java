public class java_38 {

}

interface fly {

    int MAX_HEIGHT = 100;

    // 这个是个常量，默认前缀为 public static final
    // 意味着这个值不可被改变
    /* public abstract */void cnafly();// 在接口中定义哈数默认前缀为public abstract，故而实现的时候也需要将方法定义为public

}

interface holdsomething {

    void hold();

    default void testmoren() {// 可以在接口中定义默认方法，无需被实现
        // 需要使用default进行定义
        System.out.println("用来测试在接口中定义默认方法");
    }
}

class plane implements fly, holdsomething {

    public void cnafly() {

        System.out.println("飞机能飞");
    }

    public void hold() {

        System.out.println("飞机能载人");
    }
}

/**
 * 免责声明：以下都是我猜的
 * 接口更像是类的一些属性，由这些属性构成一些类
 * 同样的，类在实现接的过程中，像是在证明自己拥有这些接口的特征
 * 
 * 与抽象类不同的是，接口更像是一些形容词？
 * 而抽象类只是未来为描述了一些共同的属性（或者说继承也是如此
 * 接口则是像不同的属性组成了新的类
 */