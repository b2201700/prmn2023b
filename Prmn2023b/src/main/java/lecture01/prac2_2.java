package lecture01;

import java.util.Scanner;
public class prac2_2{
    public static void main(String[] args){
        int[] num = new int[5]; //配列の定義(C言語とほぼ同じ考え方)
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("数字" + (i+1) + "つ目:");
            num[i] = scan.nextInt();
        }

        Keisan kei = new Keisan();
        kei.sum(num); // 合計値を求める
        kei.output(); // 判別する
    }
}
