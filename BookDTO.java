package com.xworkz.collection;

public class BookDTO {
   private int noOfPages;
   private int price;
   private String nameOfTheBook;
   private String author;
   private int edition;
   public BookDTO(int noOfPages, int price, String nameOfTheBook,String author, int edition) {
	   super();
	   this.noOfPages = noOfPages;
	   this.price=price;
	   this.nameOfTheBook=nameOfTheBook;
	   this.author=author;
	   this.edition = edition;
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
public String getNameOfTheBook() {
	return nameOfTheBook;
}
public void setNameOfTheBook(String nameOfTheBook) {
	this.nameOfTheBook = nameOfTheBook;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getEdition() {
	return edition;
}
public void setEdition(int edition) {
	this.edition = edition;
}


	
public int compareTo(BookDTO o) {
	if (this.noOfPages>o.getNoOfPages()) {
		return 1;
	}
	else if(this.noOfPages<o.getNoOfPages()){
	return -1;
	}
	return 0;
	// TODO Auto-generated method stub

	
	}
}