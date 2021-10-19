package com.java;

public class HasARelationshipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student=new Student();
        Library library=new Library();
        
        library.name="SHARADA";
        library.noOfBooks=100;
        library.location="BANGLORE";
        
        library.student=student;
    
        library.student.name="NISHA";
        library.student.dob="14/10/1999";
        library.student.id=1;
        
        System.out.println("library name: "+library.name);
        System.out.println("library noOfBooks: "+library.noOfBooks);
        System.out.println("library location: "+library.location);
        
        System.out.println("library student.name:"+library.student.name);
        System.out.println("library student.dob: "+library.student.dob);
        System.out.println("library student.id: "+library.student.id);
        }

}
