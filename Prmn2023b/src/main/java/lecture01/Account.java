package lecture01;

import java.util.Scanner;
public class Account {
    // フィールド
    String[][] account = new String[5][];
    int index;
    Scanner scan = new Scanner(System.in);
    Account() { // コンストラクタ
        for (int i = 0; i < 5; i++) {
            account[i] = new String[2]; // [i][0]:i番目の学籍番号　[i][1]:i番目のパス
        }
        String[] gakuseki = new String[]{"B2220000", "B2220001", "B2220002", "B2220003", "B2220004"};
        String[] password = new String[]{"qwer", "asdf", "zxcv", "uiop", "hjkl"};
        for (int i = 0; i < 5; i++) {
            account[i][0] = gakuseki[i];
            account[i][1] = password[i];
        }
    }
    void checkGakuseki() { // 入力した学籍番号がリストに含まれているかどうか
        // scan
        System.out.print("学籍番号を入力してください：");
        String num = scan.next();
        // check
        for (int i = 0; i < 5; i++) {
            if (account[i][0].equals(num)) { // 含まれていれば、次へ進む
                index = i;
                return;
            }
        } // 含まれていなければ「error!!」と表示して終了する
        System.out.println("error!!");
        System.exit(0); // 終了
    }


    void checkPass(){ // 入力したパスワードが対応する学籍番号のものと一致するかどうか
        // scan
        System.out.print("パスワードを入力してください：");
        String pass = scan.next();
        // check
        if( account[index][1].equals(pass) ) { // 一致すればログイン
            System.out.println("ログイン完了");
        } else { // 一致しなかったら「不正なアクセス」と表示して終了する
            System.out.println("不正なログイン");
            System.exit(0);
        }
    }

}
