/**
 * switch 语句的使用
 * switch语句中表达式的值，是int（byte，short，char，但是long不行），枚举或者字符串
 * byte，short，char可以的原因是因为他们可以自动转化成int类型的数据
 * 表达式既是其判断条件（判断语句
 * 其中每种情况对应的操作部分代码称为语句块
 */

public class java_18 {
    public static void main(String[] args) {

        int rand1 = (int) (Math.random() * 6) + 1;

        switch (rand1) {// 其中的判断条件rand1为switch语句中的表达式
            case 1:
                System.out.println("摇到1了");
                break;// 没有break则会继续进行，switch对应的case相当于一个入口，程序从这里开始

            case 2:
                System.out.println("摇到2了");
                break;

            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("摇到" + rand1 + "了");
                break;

            default:// d几种情况都没有找到
                System.out.println("这部分代码结果应该是在1——6之间,前面的代码有问题,请检查");
                break;
        }
    }
}
