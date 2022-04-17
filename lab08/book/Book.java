package book;

public class Book{
    private String author;
    private String title;
    protected Integer pages;


    public Book(){
        this.author = "John Steinbeck";
        this.title  = "Of Mice and Men";
        this.pages  = 107;
    }

    public Book(String author, String title, Integer pages){
        if(author == null || title == null || pages == null){
            throw new IllegalArgumentException("Author, title and pages must not be null");
        }

        if(author.length() < 2 || title.length() < 4){
            throw new IllegalArgumentException("Author must be at least 2, title at least 4 characters long");
        }

        this.author = author;
        this.title  = title;
        this.pages  = pages;
    }

    public String getShortName(){
        return this.author.substring(0, 2) + " " + this.title.substring(0, 4) + " p: " + this.pages;
    }
    public Integer getPrice() {
        return this.pages;
    }

    public String createReference(String article, int startPage, int endPage){
        return String.format(this.getShortName() + " [%d-%d] referenced by: %s", startPage, endPage, article);
    }

    @Override
    public String toString(){
        return this.author + " " + this.title + " " + this.pages;
    }
}