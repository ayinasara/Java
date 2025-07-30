package programs;
class Book{
	String title;
	String author;
	double price;
	int quantity;
	double totalvalue;

	Book(String title,String author,double price,int quantity){
		this.title=title;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
		
	}
	public void displayDetails(){
		
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
		totalvalue=price*quantity;
		System.out.println("total value:"+totalvalue);
	
	
		
	}


public class Bookstore {
	public static void main(String []args) {
	
	Book book1=new Book("the","aksa",120,2);
	book1.displayDetails();
	Book book2=new Book("them","aksak",1200,3);
	book2.displayDetails();
}

}}
