package lecture01;

public class Gakuseki {
    String number = "B2001000";
    void login(String gakuseki){
        if(number.equals(gakuseki)){
            System.out.println("complete!!");
        }else{
            System.out.println("error!!");

        }
    }
}
