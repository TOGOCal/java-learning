import pojo.Student;

import java.io.*;

public class Main {
    /**
     * 本关考验你：序列化流的使用
     *
     * 序列化流的使用场景：
     * 在玩一些单机游戏的时候，存档是必要的
     * 但是程序运行的特点是程序中的所有数据都不能保存
     * 若要实现存档功能，就需要将程序中一些东西些到外部文件中
     *
     * 而序列化流就能够将程序中的对象保存在文件中
     * 同时序列化流中的内容是不能被人读取的，所以这同时还能够防止别人随意修改
     *
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Student stu = new Student(1 , "张三" , 18 ,705 );
//
//        saveStudent(stu);

        Student stu = readStudent();

        System.out.println(stu);
    }

    public static void saveStudent(Student stu) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectIOStream\\source\\documentStudent.txt"));

        oos.writeObject(stu);

        oos.close();
    }

    public static Student readStudent() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectIOStream\\source\\documentStudent.txt"));

        Student stu = (Student)ois.readObject();

        ois.close();

        return stu;
    }
}
