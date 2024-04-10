//随机数的生成
//目的是为了生成骰子的点数

public class java_17 {
    public static void main(String[] args) {
        double rand1 = Math.random();
        System.out.println(rand1);// Math.random()函数会生成一个位于0-1之间的double类型的数（不包括1

        int rand2 = (int) (Math.random() * 6);// 通过*6的方式可以使得随机数变为0-6直接按的数（不包括6
        System.out.println(rand2);

        int rand3 = (int) (Math.random() * 6) + 1;// 骰子的点数是1-6，因此将其强制类型转化为int类型再进行打印
        System.out.println(rand3);

    }
}
