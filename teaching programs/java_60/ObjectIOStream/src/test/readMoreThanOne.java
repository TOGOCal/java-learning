package test;

import pojo.Student;

import java.io.*;
import java.util.ArrayList;

public class readMoreThanOne {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("ObjectIOStream\\source\\testMoreThanOne.txt");

        Solution solution = new Solution();

        System.out.println("method1:");
        solution.method1(file);

        System.out.println("===================================");

        System.out.println("method2:");
        solution.method2(file);

        System.out.println("====================================");

        file = new File("ObjectIOStream\\source\\testMoreThanOne2.txt");
        System.out.println("method3:");
        solution.method3(file);

    }

    public static class Solution{

        public void method1(File file) throws IOException, ClassNotFoundException {
            //在我们明确知道有多少个的时候，这是一种办法（但绝不是最优解
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            Student stu1 = (Student) ois.readObject();
            Student stu2 = (Student) ois.readObject();
            Student stu3 = (Student) ois.readObject();

            System.out.println(stu1);
            System.out.println(stu2);
            System.out.println(stu3);

            ois.close();
        }

        public void method2(File file) throws IOException, ClassNotFoundException {
            //方法思路：在read的调用的时候，如果读取到了文件末尾，并不会返回-1或者null
            //而是会抛出一个异常EOFException（end of file exception）
            //解决方式：使用try catch
            //缺点：尽量不要让程序自己产生错误

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            ArrayList<Student> students = new ArrayList<>();

            while(true){

                try {
                    Student stu1 = (Student) ois.readObject();
                    students.add(stu1);
                } catch (EOFException e){

                    break;
                }
            }

            for(Student stu : students){

                System.out.println(stu);
            }
        }

        public void method3(File file) throws IOException, ClassNotFoundException {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            //直接将读取到的对象强转成对应的数组对象就行
            ArrayList<Student> students = (ArrayList<Student>) ois.readObject();

            for(Student stu : students){

                System.out.println(stu);
            }

        }
    }
}
