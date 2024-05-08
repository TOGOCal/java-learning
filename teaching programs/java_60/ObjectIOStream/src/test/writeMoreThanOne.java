package test;

import pojo.Student;

import java.io.*;
import java.util.ArrayList;

public class writeMoreThanOne {

    public static void main(String[] args) throws IOException {

        File file = new File("ObjectIOStream\\source\\testMoreThanOne.txt");

        Method method = new Method();

        method.add1(file);

        file = new File("ObjectIOStream\\source\\testMoreThanOne2.txt");

        method.add2(file);
    }

    public static class Method{

        public void add1(File file) throws IOException {
            //方法1：一个一个写入
            ObjectOutputStream ois = new ObjectOutputStream( new FileOutputStream(file) );
            Student stu1 = new Student(1,"1",1,1);
            Student stu2 = new Student(2,"2",2,2);
            Student stu3 = new Student(3,"3",3,3);

            ois.writeObject(stu1);
            ois.writeObject(stu2);
            ois.writeObject(stu3);

            ois.close();
        }

        public void add2(File file) throws IOException {

            ObjectOutputStream ois = new ObjectOutputStream( new FileOutputStream(file) );

            Student stu1 = new Student(1,"1",1,1);
            Student stu2 = new Student(2,"2",2,2);
            Student stu3 = new Student(3,"3",3,3);

            ArrayList<Student> students = new ArrayList<Student>();

            students.add(stu1);
            students.add(stu2);
            students.add(stu3);

            //将对象最为数组读取，就可以避免使得程序抛出错误
            ois.writeObject(students);

            ois.close();
        }
    }
}
