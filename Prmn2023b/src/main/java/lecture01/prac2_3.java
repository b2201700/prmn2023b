package lecture01;

public class prac2_3 {
    public static void main(String[] args) {
        Account account = new Account();
        account.checkGakuseki(); // 学籍番号を入力し、リストに含まれているか
        account.checkPass(); // パスワードを入力し、対応する学籍番号のものと一致するかどうか
    }
}
