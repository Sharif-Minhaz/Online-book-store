
package online_book_store_system;

import javax.swing.JOptionPane;

public class Accountant {
    String username;
    String password;
    //-------------------------Constructor----------------------------
    Accountant(String username, String password){
        this.username = username;
        this.password = password;
    }
}
class GetBill{
    int amount;
    GetBill(int amount){
        this.amount = amount;
    }
    int getTotalBill(){
        int res = amount*300; 
        return res; 
    }
}
class Donate{
    String currency;
    int money;
    Donate(String currency, int money){
        this.currency = currency;
        this.money = money;
    }
    void confirmation(){
        JOptionPane.showMessageDialog(null, money+" "+currency+" donated successfully."); 
    }
}
