
package online_book_store_system;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Admin {
    String username;
    String password;
    //-------------------------Constructor----------------------------
    Admin(String username, String password){
        this.username = username;
        this.password = password;
    }
    //-----------------------Methods---------------------------------
    void signUp() {
        JOptionPane.showMessageDialog(null, "Same process as visitor");
    }
    void login() {
       JOptionPane.showMessageDialog(null, "Same process as visitor"); 
    }
    void searchBooks(){
        JOptionPane.showMessageDialog(null, "Same process as visitor");
    }
}
class AddBooksAdmin{
    String bookName;
    AddBooksAdmin(String bookName){
        this.bookName = bookName;
    }
    void addBooks(){
        try{
            File dataBase = new File("Books.txt");
            FileWriter fw = new FileWriter(dataBase, true);
            fw.write(bookName);
            fw.write("\n");
            JOptionPane.showMessageDialog(null, bookName+" book added successfully");
            fw.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File not found");                
        }
    }
}
class Contact{
    String firstName, lastName, email;
    Contact(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    void sendMsg(){
        if(firstName.length()==0 || lastName.length()==0 || email.length()==0){
            JOptionPane.showMessageDialog(null, "Empty field !!!");
        }
        else{
            JOptionPane.showMessageDialog(null, "SMessage sent successfully.");
        }
    }
}
