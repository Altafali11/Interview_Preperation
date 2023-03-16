package codeit_preperation;

class Book{
	int BookId ;
	String BookName ;
	 int BookPrice ;
	 String AuthorName ;
	 static String LibraryName = "RK Library";
	 Boolean Availability;
	 
	 public void CreateBook (int BookId, int BookPrice, String BookName,String AuthorName , Boolean Availability,String LibraryName) {
		 this.BookId = BookId;
		 this.BookPrice = BookPrice;
		 this.BookName = BookName;
		 this.AuthorName = AuthorName;
		 this.Availability= Availability;
		 this.LibraryName = LibraryName; 
		 
	 }
	 public void displayBook () {
		 System.out.println(BookId + " " +BookName + " " +BookPrice + " " + AuthorName + " " + Availability + " " + LibraryName );
	 }
	 public void displayBookbyName (String a) {
		 System.out.println(BookId +" " +BookName +" " +BookPrice +" " + AuthorName + " " + Availability + " " + LibraryName );
	 }
	 public void Borrow (String b) {
		 if(Availability == false) {
			 System.out.println("Book is not Available ");
		 }
		 else {
			 System.out.println(" Book Available");
			
		 }
	 }
}
public class Book_Management {
	public static void main(String[] args) {

		Book b = new Book ();
		b.CreateBook(100, 165, "HarryPotter", "J.K Rowllings", true , Book.LibraryName);
		Book b1 = new Book();
		b1.CreateBook(101, 180, "Revolution2020", "ChetanBhagat", true , Book.LibraryName);
		Book b2 = new Book();
		b1.CreateBook(102, 220, "Rich Dad Poor Dad", " Robert Kiyosak", true , Book.LibraryName);
		Book b3 = new Book();
		b1.CreateBook(103, 150, "HalfGirlfriend", "ChetanBhagat", false , Book.LibraryName);
		Book b4 = new Book();
		b1.CreateBook(104, 185, "Harry Potter and the Cursed Child", "J.K Rowlling", true , Book.LibraryName);
		
		
		
		b.displayBook();
		
		b.displayBookbyName("HarryPotter");
		b.Borrow("HarryPotter");
	}

}
