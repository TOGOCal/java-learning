//文件操作类的使用

import java.io.File;

public class java_55 {

    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));// 打印当前文件路径

        File f3 = new File("D:\\code\\java\\testcreat");// 创建目录//类似于创建文件夹
        // f3.mkdir();//创建一个目录，如果路径下有任何找不到的就不创建
        f3.mkdirs();// 创建多个目录，创建的是目标路径下没有的目录
        // 这两个返回值都是一个布尔代数，代表是否成功创建

        for (int i = 0; i < 10; i++) {
            File f = new File("a" + i + ".txt");
            f.createNewFile();// 括号里不添加路径时默认在该路径下生成，该路径就就是上面打印的哪个路劲
        }
    }
}
