import javax.swing.*;
import java.io.*;

public class TestSort {
    public static void main(String[] args) throws IOException {

        File file = new File("testSort\\source\\source.txt");

        fileSort(file);
    }

    public static void fileSort(File file) throws IOException {

        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter( new File("testSort\\source\\toSort"+file.getName()));

        int ch=0;
        StringBuilder sb= new StringBuilder();

        while((ch=fr.read())!=-1){

            sb.append((char)ch);
        }

        String str = sb.toString();

        String[] numbers = str.split(" ");//通过什么对字符串进行分割

        int[] arr = new int[numbers.length];

        for(int i=0;i<arr.length;i++){

            arr[i] = Integer.parseInt(numbers[i]);//将字符串转成对应的数字
        }

        quickSort(arr,0,arr.length-1);

        sb = new StringBuilder();

        for(int i=0;i<arr.length;i++){

            sb.append(arr[i]);
            sb.append(" ");
        }

        //字符串可以调用replace方法将所有某个字符转成另一个字符

        fw.write(sb.toString());
        fw.close();
        fr.close();
    }

    public static void quickSort(int[] arr, int left, int right) {

        if (left >= right) {

            return;
        }

        int rand = arr[ (int)( Math.random()*(right-left+1)+left ) ];

        int p1 = left-1;
        int p2 = right+1;

        for(int i = left; i < p2; i++) {

            if(arr[i] < rand) {

                swap(arr, i, p1+1);
                p1++;
            }else if(arr[i] > rand) {

                swap(arr, i, p2-1);
                p2--;
                i--;
            }
        }

        quickSort(arr, left, p1);
        quickSort(arr, p2, right);
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}