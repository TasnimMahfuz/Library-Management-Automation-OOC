package objectOrientedConcepts;

import java.awt.print.Book;
import java.util.ArrayList;

public class Customer extends Person {
	
	private int customerId;
	private ArrayList <Book> readBook;
	private ArrayList <BorrowedBook> customerBorrowedBook;
	private boolean status;
	
	
	public Customer(String name, String surname, Phone telphone, String email,String password,int customerId, boolean status)
	{
		super(name,surname,telphone,email,password);//ekhane var name onno kichu ki hote parto?
		this.customerId = customerId;
		this.readBook = new ArrayList<Book>();
		this.customerBorrowedBook = new ArrayList<BorrowedBook>();
		this.status = status;
	}
	
	public int getCustomerId()
	{
		return customerId;
	}
	
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	
	public ArrayList <Book> getReadBooks()
	{
		return this.readBook;
	}
	
	public void setReadBooks(ArrayList<Book> readBooks) {
		return this.readBook;
	}
	
	public void setReadBooks(ArrayList<Book> readBooks) {
		this.readBook = readBooks;
	}
	
	public ArrayList<BorrowedBook> getCustomerBorrowedBook()
	{
		return customerBorrowedBook;
	}
	
	public void setCustomerBorrowedBook(ArrayList<BorrowedBook> CustomerBorrowedBook)
	{
		this.customerBorrowedBook = customerBorrowedBook;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void addBorrowedBook(BorrowedBook bb)
	{
		this.customerBorrowedBook.add(bb);
	}
	
	public void learnDeadline()
	{
		for(i = 0; i < customerBorrowedBook.size(); i++)
		{
			System.out.println("Book Name: "+ customerBorrowedBook.get(i).getDeliveryDate());
			
		}
	}
	
	public void listCustomerBorrowedBook()
	{
		for(int i = 0; i < this.customerBorrowedBook.size();i++)
		{
			System.out.println(this.customerBorrowedBook.get(i).toString());
		}
	}
	
	@Override
	
	public Book searchBook(StriBookookName)
	{
		ArrayList<E> <Book> temp = Test.lib.getBooks();
		
		for(int i = 0;i < temp.size();i++)
		{
			if(temp.get(i).getTitle().equalIsIgnoreCase(bookName))
			{
				return temp.get(i);
			}
		}
		System.out.println("The book does not exist! ");
		return null;
	}
	
	@Override
	
	public Book searchBookByAuthor(String authorName)
	{
		ArrayList<Book> temp = Test.lib.getBooks();
		
		for(int i = 0; i  < temp.size(); i++)
		{
			if(temp.get(i).getAuthor().equalIsIgnoreCase(authorName))
			{
				return temp.get(i);
			}
		}
		System.out.println("The book does not exist! ");
		return null;
	}
	
	@Override
	Public string toString()
	{
		return getName()+ "\t" + getSurname()+ "\t" + getTelphone().toString() + "\t" +  getEmail() + "\t" + getPassword() + "\t" + getCustomerId()+ "\t"+ isStatus();				 
				
	}
	
	
}
