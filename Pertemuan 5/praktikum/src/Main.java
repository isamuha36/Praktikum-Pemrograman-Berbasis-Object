import peckage2.Account;
import  peckage1.*;

public class Main {
    public static void main(String[] args) {
        peckage2.Account acount1 = new peckage2.Account();
        acount1.username = "abed";
//        acount1.password = "1234";
        acount1.setPassword("zzzzz");

        System.out.println(acount1.getPassword());
        acount1.printName();

        peckage1.Account acount2 = new peckage1.Account();
        acount2.email = "aaa@aaa.com";
    }
}
