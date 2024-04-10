/**
 * 用get方法与set方法使得外部可以访问或修改内部private变量
 * 与java_37联合学习，
 */

public class java_36 {
    private int age;// 以后这种从属于类的变量都用private修饰
    private String name;
    private boolean right;

    public int getAge() {

        return age;
    }// get方法，可以使外部拿到Age的值

    public void setAge(int age) {

        this.age = age;
    }// set方法，可以使外部修改age的值

    public String getName() {

        return name;
    }

    public void setname(String name) {

        this.name = name;
    }

    public boolean isRight() {

        return right;
    }

    public void setRight(boolean right) {

        this.right = right;
    }
}
