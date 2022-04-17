package book;

public class EBook extends Book {
    private Integer fileSize;


    public EBook(String author, String title, Integer pages, Integer fileSize){
        super(author, title, pages);
        this.fileSize = fileSize;
    }


    @Override
    public String createReference(String article, int startPage, int endPage){
        return String.format(super.toString() + " (PDF size: %d)[%d-%d] referenced by: %s", fileSize, startPage, endPage, article);
    }

    public String createReference(String article, int startPage, int endPage, String date){
        return String.format(super.toString() + " (PDF size: %d)[%d-%d] referenced by: %s, accessed: %d",
                                                fileSize, startPage, endPage, article, date);
    }

    @Override
    public Integer getPrice() {
        return this.fileSize + this.pages;
    }
    @Override
    public String toString(){
        return super.toString() + " " + this.fileSize;
    }

}