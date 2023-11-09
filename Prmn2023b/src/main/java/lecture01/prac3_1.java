package lecture01;

import java.util.Scanner;
public class prac3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("氏名：");
        String name = scan.next();
        System.out.print("学籍番号：B");
        int num = scan.nextInt();

        System.out.println("氏名：" + name + "\t学籍番号：B" + num);
    }
}
