package objectOrientedConcepts;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;


public class BOOK implements IBOOK{
	
	
	private int id;
	private String title;
	private String author;
	private String publisher;
	private int pageCount;
	private Date releaseDate;
	
	private Queue<Customer> customerWantedList;
	private Type type;
	private boolean status;
	
	public Book(int id,String title, String author, String publisher, int pageCount, Date releaseDate, Type type, boolean status )
	{
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pageCount = pageCount;
		this.releaseDate = releaseDate;
		this.customerWantedList = new LinkedList <customer()>();//But this was a queue, not a linked list!!!
		this.type = type;
		this.status = status;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	public int getPageCount()
	{
		return pageCount;
	}
	
	public void setPageCount(int pageCount)
	{
		this.pageCount = pageCount;
	}
	
	public Date getReleaseDate()
	{
		return releaseDate;
	}
	
	public void setReleaseDate(Date releaseDate)
	{
		this.releaseDate = releaseDate;
	}
	
	public Queue<Customer> getCustomerWantedList()
	{
		return customerWantedList;
	}
	
	public void setCustomerWantedList(Queue <>)
	{
		this.customerWantedList = customerWantedList;
	}
	

	public Type getType() {
		return type;
	}




	public void setType(Type type) {
		this.type = type;
	}

	
	
	public boolean isStatus() {
		return status;
	}




	public void setStatus(boolean status) {
		this.status = status;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}

	public void addPersonToWanted(Person P)
	{
		this.customerWantedList.add((Customer) p);
		//was this an example of type casting?
	}
	
	public void deletePersonFromWanted(Person p)
	{
		if(this.customerWantedList.isEmpty())
			return;
		if(this.customerWantedList.contain(p))
		{
			while(this.customerWantedList.peek() != p)
			{
				//what did I do in the while condition checking?
				
				Person temp = this.customerWantedList.poll();
				this.customerWantedList.add((Customer) temp);
				//what does .poll() do?
			}
			this.customerWantedList.poll();
			
		}else
		{
			System.out.println("This person does not exist in the system!");
		}
	}


}
