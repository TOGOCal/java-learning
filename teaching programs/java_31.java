
/**
 * 类的继承
 * 子类可以继承父类的属性
 */

import java.util.*;

public class java_31 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        student_ a = new student_(s.nextLine(), s.nextInt(), s.nextLong(), s.nextLine());

        System.out.println(a instanceof person_);// 判断a是不是从属于person的一个对象，是输出true

        s.close();
    }

}

class person_ {

    String name;
    int age;

    public void play() {

        System.out.println("玩累了");
    }

    // person(){

    // ;
    // }

    // person(String name,int age){

    // this.name=name;
    // this.age=age;
    // }
}

class student_ extends person_ {

    // String name;
    // int age;//这些属性继承了父类的特点，就不用再进行创造

    long id;
    String major;

    public void study() {

        System.out.println("学个der!");
    }

    student_(String name, int age, long id, String major) {

        this.name = name;
        this.age = age;
        this.id = id;
        this.major = major;
    }
}
