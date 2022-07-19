
public class Book {

	public String title;
    public String author;
    public int price;
    public Book(String title, String author, int price) {
    	this.title=title;
    	this.author=author;
    	this.price=price;
    }
    public void getTitle() {
    	System.out.println("*Title of Book: "+title);
    }
    public void getAuthor() {
    	System.out.println("Author of Book: "+author);
    }
    public void getPrice() {
    	System.out.println("Price of book: "+price);
    }
    public void setTitle(String title)
    {
    	
    	this.title=title;
    }
    public void setAuthor(String author)

    {

       this.author=author;

    }

    public void setCost(int price)

    {

        this.price=price;

    }    

    public void show()

    {

        getTitle();

        getAuthor();

        getPrice();

    }    

}

