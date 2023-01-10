
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();

    String authorToFind = "L. Frank Baum";

    for (Book x : childrensBooks) {
      if (x.getAuthor().equals(authorToFind))
        System.out.println(x.getTitle());
    }

    String bookToFind = "Sky Island";
    double minimumRating = 0.0;

    for (Book x : childrensBooks) {
      if (x.getTitle().equals(bookToFind))
        minimumRating = x.getRating();
    }

    System.out.println(minimumRating);

    for (Book x : childrensBooks) {
      if (x.getRating() >= minimumRating)
        System.out.println(x.getTitle() + "\t\t" + x.getAuthor());
    }
  }
}