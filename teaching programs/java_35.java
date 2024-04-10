/**
 * super()的作用
 * super. 可以在子类中调用父类被重写的方法或变量
 */

public class java_35 {
    public static void main(String[] args) {
        ChildClass a = new ChildClass();// 这里可以看出，创建了父类的对象后来才创建了子类的对象
        System.out.println("*****************************************");

        a.thisprint();
        FatherClass b = new FatherClass();
        b.thisprint();

        a.testsuper();
        a.age = 30;
        a.testsuper();

    }
}

class FatherClass {

    String name;
    int age;

    public FatherClass() {// 构造器

        System.out.println("出现了这句话表示创建了父类的对象");
        System.out.println("通过对比这句话与子类的顺序可以知道创建过程中的先后顺序");
    }

    public void thisprint() {

        System.out.println("这句话打印出既代表成功调用了父类的方法");
    }

}

class ChildClass extends FatherClass {

    int age;// 若子类中存在与父类相同的变量名时，虽然子类拥有父类的age属性，但是不能直接使用

    public ChildClass() {
        // super();在每个类的第一行若是，没有出现super()等，java都会默认调用这句话，含义是调用父类的构造器
        System.out.println("出现了这句话表示创建了子类的对象");
        System.out.println("通过对比这句话与父类的位置可以知道创建对象的先后顺序");
    }

    public void thisprint() {

        super.thisprint();
        System.out.println("这句话打印出既代表成功调用了子类的方法");
        System.out.println(age);
        System.out.println(super.age);
    }

    public void testsuper() {

        System.out.println(age);
        System.out.println(super.age);
    }

}
