package book;

public class PrintedBook extends Book{
    private static enum Format{
        HARDCOVER, SOFTCOVER;
    }
    private Format format;

    public PrintedBook(){
        super();
        this.pages += 6;
        this.format = Format.HARDCOVER;
    }

    @Override
    public String createReference(String article, int startPage, int endPage){
        return String.format(super.toString() + " [%d-%d] referenced by: %s", startPage, endPage, article);
    }

    @Override
    public Integer getPrice(){
        switch(this.format){
            case SOFTCOVER:
                return this.pages * 2;
            case HARDCOVER:
                return this.pages * 3;
            default:
                return this.pages;
        }
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.format.name();
    }
}
