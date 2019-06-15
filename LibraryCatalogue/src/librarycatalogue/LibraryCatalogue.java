/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    //Properties/ Fields/ Global Variables
    Map <String, Book> bookCollection = new HashMap<String, Book>();
    
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;
    
    //Constructors
    public LibraryCatalogue(Map<String, Book> collection){
        this.bookCollection = collection;
    }
    
    public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }
    
    //Getters
    public int getCurrentDay() {
        return this.currentDay;
    }
    
    public Map<String, Book> getBookCollection(){
        return this.bookCollection;
    }
    
    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle); 
    }
    
    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }
    
    public double getInitialLateFee() {
        return this.initialLateFee;
    }
    
    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }
    
    
    //Setters
    public void nextDay() {
        currentDay++;
    }
    
    public void setDay(int day) {
        currentDay = day;
    }
    
    //INSTANCE METHODS:
    public void checkOutBook(String title) {
        Book book = getBook(title);
        if(book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day "+
                    (getCurrentDay()+getLengthOfCheckoutPeriod())+".");
        }
    }
    
    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library "+ (getInitialLateFee() + daysLate * getFeePerLateDay()) +
                    " beacuse your book is "+daysLate+ " days overdue.");
        } else {
            System.out.println("Book Returned. Thank You");
        }
        book.setIsCheckedOut(false, -1);
    }
    
    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. "
        + "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()) + ".");
    }
    
    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book chetan = new Book("5 point", 479493, 892384289);
        bookCollection.put("5 point", chetan);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("5 point");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("5 point");
        lib.setDay(17);
        lib.returnBook("5 point");
        lib.checkOutBook("5 point");
    }
    
}
