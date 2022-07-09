
package online_book_store_system;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Users {
    String username;
    String password;
    //------------------------------Constructor---------------------------------
    Users(String username, String password){
        this.username = username;
        this.password = password;
    }
    //------------------------------Sign up-------------------------------------
    void signUp() {
        if(username.length()==0 || password.length()==0){ 
            JOptionPane.showMessageDialog(null, "Input missing");
        }
        else {
            try{
                File dataBase = new File("Database.txt");
                FileWriter fw = new FileWriter(dataBase, true);
                fw.write(username);
                fw.write("\n");
                fw.write(password);
                fw.write("\n");
                JOptionPane.showMessageDialog(null, "Registration complete");
                fw.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "File not found");                
            }
        }
    }
    //------------------------------Log in--------------------------------------
    int flagForLogin;
    void login() {
        try{
            File dataBase2 = new File("Database.txt");
            Scanner userAllData = new Scanner(dataBase2);
            String userData = "";

            while(userAllData.hasNext()){
                userData = userAllData.nextLine();
                if(username.equals(userData)){
                    userData = userAllData.nextLine();
                    if(password.equals(userData)){
                        flagForLogin = 1;
                        break;
                    }
                }
            }
            if(flagForLogin == 1) {
                JOptionPane.showMessageDialog(null, "Login successful. Welcome "+username+"!!!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File not found");
        }       
    }
}
//-------------------------Show recent books------------------------------------
class RecentBooks{
    String arr[] = new String[20];
    int n=0;
    String info;
    void recent(){
        try{
            File recentBooks = new File("Books.txt");
            Scanner inputBook = new Scanner(recentBooks);
            while(inputBook.hasNext()){
                try{
                    arr[n] = inputBook.nextLine();
                }
                catch(ArrayIndexOutOfBoundsException e){
                    JOptionPane.showMessageDialog(null, "Problem with array size");
                }
                n++;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File not found");
        }
        
    }
    void finalShow(){
        try{
            info = "1. "+arr[n-1]+"\n"+"2. "+arr[n-2]+"\n"+"3. "+arr[n-3];
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Problem with array size");
        }
    }
}
//------------------------Show all available books------------------------------
class ShowBooks{
    String bookData = "";
    void showAllBooks(){
        
        try{
            File availableBooks = new File("Books.txt");
            Scanner booksData = new Scanner(availableBooks);
            int n = 0;
            while(booksData.hasNext()){
                n = n+1;
                bookData += n+". "+booksData.nextLine()+"\n";
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File not found");
        }
    }
}
class bookSearch{
    String bookName;
    bookSearch(String bookName){
        this.bookName = bookName;
    }
    //------------------------------Search books--------------------------------
    void searchBooks(){
        int flagForSearchBook = 0;
        try{
            File books = new File("Books.txt");
            Scanner input = new Scanner(books);
            String bookData = "";

            while(input.hasNext()){
                bookData = input.nextLine();
                if(bookName.equalsIgnoreCase(bookData)){
                    flagForSearchBook = 1;
                    break;
                }
            }
            if(flagForSearchBook == 1){
                JOptionPane.showMessageDialog(null, bookName+" --book found");
            }
            else {
                JOptionPane.showMessageDialog(null, "Sorry!!! This book is not available");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "File not found");
        }
    }
}

