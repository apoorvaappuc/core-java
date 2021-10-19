package com.java;

public class HasARelationshipDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Author author=new Author();
         Book book=new Book();
         author.authorname="Johan";
         author.age=45;
         author.place="PARIS";
         
         author.book=book;
         
         author.book.bookname="JAVA FOR BEGGINERS";
         author.book.price=1200;
         
         
         System.out.println("authorname:"+author.authorname);
         System.out.println("author.age: "+author.age);
         System.out.println("author.place: "+author.place);
         
         System.out.println("author.book.name: "+author.book.bookname);
         System.out.println("author.book.price: "+author.book.price);
         
	}

}
