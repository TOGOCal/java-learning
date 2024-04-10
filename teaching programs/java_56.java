import java.io.File;

/**
 * 使用递归和文件打印目录
 */

public class java_56 {
    public static void main(String[] args) {
        File f = new File("d:\\code\\java_program");
        printmenu(f, 0);
    }

    public static void printmenu(File file, int level) {

        for (int i = 0; i < level; i++) {

            System.out.print("-");
        }
        System.out.println(file.getName());// 打印文件名

        if (file.isDirectory()) {// 如果是目录

            File files[] = file.listFiles();// 列出该目录下所有的子文件
            for (File temp : files) {

                printmenu(temp, level + 1);
            }
        }
    }
}
