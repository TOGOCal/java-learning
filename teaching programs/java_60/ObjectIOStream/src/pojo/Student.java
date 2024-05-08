package pojo;

import java.io.Serializable;

//加上这个实现代表这个类可以被序列化写出
//类似于食品的合格标签，贴上了代表这个食品是合格的，而这个东西本身没有任何作用
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;//指定版本号
    /**
     * 在不指定版本号的时候，如果对类中的某些信息进行了修改，javaBean会去冲洗对版本号进行计算，
     * 这时候再read就read不到了，所以我们可以通过指定版本号的方式使得java程序不要每次都去计算版本号，而是使用指定的这个版本号
     */

    int id;
    String name;
    int age;
    int score;

    public Student(int id, String name, int age, int score) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + score;
    }
}