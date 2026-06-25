//Library Management with Books and Authors
//○ Description: Model a Book system where Book is the superclass, and Author is a subclass.
//○ Tasks:
//■ Define a superclass Book with attributes like title and publicationYear.
//■ Define a subclass Author with additional attributes like name and bio.
//■ Create a method displayInfo() to show details of the book and its author.
//○ Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.



class Books{
  String title;
  int publicationYear;

  Books(String title, int publicationYear){
    this.title = title;
    this.publicationYear = publicationYear;
  }
}

class Author extends Books{
  String name;
  String bio;

  Author(String title, int publicationYear, String name, String bio){
    super(title,publicationYear);
    this.name = name;
    this.bio = bio;
  }


  void displayInfo(){
    System.out.println("Book title: "+title);
    System.out.println("Book publicationYear: "+publicationYear);
    System.out.println("Author name: "+name);
    System.out.println("Author bio: "+bio);
  }
}

public class LibraryManagement {
  public static void main(String[] args) {
    Author a1 = new Author("DSA Concepts",2025,"Siddhi Dublish","DSA Trainer and Instructor");

    a1.displayInfo();
  }
}
