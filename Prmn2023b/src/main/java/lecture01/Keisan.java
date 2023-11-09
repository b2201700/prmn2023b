package lecture01;

public class Keisan {
    int ans = 0;
    void sum(int[] num){
        for(int i=0;i<num.length;i++){
            ans += num[i];
        }
        System.out.println("合計値:" + ans);
    }

    void output() {
        if(ans >= 100) {
            System.out.println("great!!");
        } else if(ans >= 50) {
            System.out.println("big");
        } else {
            System.out.println("small");
        }
    }
}
