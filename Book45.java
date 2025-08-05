class Book45 {
private String title;
private int pages;
private String author;

static String[] bookGenres = {"Fiction", "Non-Fiction", "Fantasy", "Biography"};

public static String[] getBookGenres() {
return bookGenres;
}

public void setTitle(String title) {
this.title = title;
}

public String getTitle() {
return title;
}

public void setPages(int pages) {
this.pages = pages;
}

public int getPages() {
return pages;
}

public void setAuthor(String author) {
this.author = author;
}

public String getAuthor() {
return author;
}
}
