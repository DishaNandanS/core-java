class Book45Runner {
public static void main(String[] args) {
Book45[] books = new Book45[2];

Book45 book1 = new Book45();
book1.setTitle("Wings of Fire");
book1.setPages(300);
book1.setAuthor("Dr. A.P.J. Abdul Kalam");
books[0] = book1;

Book45 book2 = new Book45();
book2.setTitle("The Alchemist");
book2.setPages(208);
book2.setAuthor("Paulo Coelho");
books[1] = book2;

for (int i = 0; i < books.length; i++) {
System.out.println("Book======== " + (i + 1));
System.out.println("Title: " + books[i].getTitle());
System.out.println("Pages: " + books[i].getPages());
System.out.println("Author: " + books[i].getAuthor());
}

System.out.println("Available Book Genres:");
for (String genre : Book45.getBookGenres()) {
System.out.println(genre);
}
}
}
