package lecture01;

import java.util.Scanner;
public class prac2_1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力して下さい:");
        String gakuseki = scan.next();
        Gakuseki num = new Gakuseki();
        num.login(gakuseki); // 学籍番号の判別とメッセージ表示
    }
}
