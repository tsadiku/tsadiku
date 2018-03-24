/*
the follwing code is for showing the mvc design pattern.
the main method is treated as the view as it manages how the UI should look like
the "choose()" function is treated as the controller as it controlls the data
 in the enum
the "Books" enum is treated as the model class as it stores the datas.

*/
package bookdetails;
import java.util.EnumSet;
import java.util.Scanner;

public class BookDetails {

    //the main function is used as the view  as it manages how the ui should happen.
    public static void main(String[] args) {
        System.out.println("this is book store\n what book would you like to see the details?\n");
        System.out.println("enter:\n1 for DHTP\n2 for CHTP\n3 for IW3HTP\n4 for CPPHTP\n5 for VBHTP\n"
                + "6 for CSHARPHTP\n7 for PHHTP\n8 for JSHTP\n9 for PHPHTP\n10 for MPHTP\n");
        
        
        choose();
        

    }
    
    // this function is treated as the ontroller as it controls the data in the enum
    public static void choose(){
        Scanner input = new Scanner(System.in);
      for (int i = 0; i < 5; i++){
        int bookNumber = input.nextInt();
        switch(bookNumber){
            case 1:bookDetails(Books.values()[0]);
                   break;
            case 2:bookDetails(Books.values()[1]);
                   break;
            case 3:bookDetails(Books.values()[2]);
                   break;
            case 4:bookDetails(Books.values()[3]);
                   break;
            case 5:bookDetails(Books.values()[4]);
                   break;
            case 6:bookDetails(Books.values()[5]);
                   break;
            case 7:bookDetails(Books.values()[6]);
                   break;
            case 8:bookDetails(Books.values()[7]);
                   break;
            case 9:bookDetails(Books.values()[8]);
                   break;
            case 10:bookDetails(Books.values()[9]);
                   break;       
        }
          
      }
    }
    public static void bookDetails(Books book){
        System.out.printf("title: %s\ncopyright year: %s\n", book.getTitle(), book.getCopyrightYear());
    }
    
    public enum Books {
JHTP( "Java How to Program", "2012" ),
CHTP( "C How to Program", "2007" ),
IW3HTP( "Internet & World Wide Web How to Program", "2008" ),
CPPHTP( "C++ How to Program", "2012" ),
VBHTP( "Visual Basic 2010 How to Program", "2011" ),
PHHTP("python How to Program", "2011"),
JSHTP("javascript How to Program", "2011"),
PHPHTP("php 2011 How to Program", "2011"),
MPHTP("Mobole Programming 2008 How to Program", "2011"),
CSHARPHTP( "Visual C# 2010 How to Program", "2011" );
private final String title; // book title
private final String copyrightYear; // copyright year

Books( String bookTitle, String year )
 {
 title = bookTitle;
 copyrightYear = year;
} // end enum Book constructor

 // accessor for field title
 public String getTitle()
 {
 return title;
 } // end method getTitle
 // accessor for field copyrightYear
 public String getCopyrightYear()
 {
 return copyrightYear;
 } // end method getCopyrightYear
 }
    
}
