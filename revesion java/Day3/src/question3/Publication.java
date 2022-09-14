package question3;

public abstract class Publication {
	
 private	int noOfPages;
private	int price;
private	String publisherName;


public Publication(int noOfPages, int price, String publisherName) {
	super();
	this.noOfPages = noOfPages;
	this.price = price;
	this.publisherName = publisherName;
}

public Publication() {
	super();
	// TODO Auto-generated constructor stub
}

public int getNoOfPages() {
	return noOfPages;
}
public void setNoOfPages(int noOfPages) {
	this.noOfPages = noOfPages;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getPublisherName() {
	return publisherName;
}
public void setPublisherName(String publisherName) {
	this.publisherName = publisherName;
}

@Override
public String toString() {
	return "Publication [noOfPages=" + noOfPages + ", price=" + price + ", publisherName=" + publisherName + "]";
}

}
