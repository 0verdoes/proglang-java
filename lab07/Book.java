public class Book {
    public enum Genre {
        SCIFI,
        FANTASY,
        SATIRE,
        EDUCATIONAL,
        PHILOSOPHY;
    }

    private Genre  genre;
    private String title;
    private String author;
    private int    reservePrice;
    private int    id;
    private static int nextId = 1;

    private Book(Genre genre, String title, String author, int reservePrice) {
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.reservePrice = reservePrice;
        this.id = nextId++;
    }
    /**
     * Primary way of creating a Book. returns null if parameters are invalid
     * @throws IllegalArgumentException if genre is not a valid String of a present Genre
     * @param genre
     * @param title
     * @param author
     * @param reservePrice
     * @return Book created accordingly to parameters or null if parameters are invalid
     */
    public static Book make(String genre, String title, String author, int reservePrice) throws IllegalArgumentException{
        if(genre == null || title == null || author == null || reservePrice < 1){
            return null;
        }
        if(title.length() < 2 || author.length() < 2 ||
           !title.matches("[a-zA-Z0-9 ]+") || !author.matches("[a-zA-Z0-9 ]+")){ //regex matches letters and numbers and spaces
            return null;
        }
        Genre g = Genre.valueOf(genre);
        return new Book(g, title, author, reservePrice);

    }

    public static boolean isSameGenre(Book b1, Book b2) {
        return b1.genre == b2.genre;
    }

    public int compare(Book other){
        if(!isSameGenre(this, other)){
            throw new IllegalArgumentException("Books are not of the same genre");
        }
        return (int)Math.signum(this.reservePrice - other.reservePrice);
    }

    /**
     * This greatly improves testability!
     * allows (almost) comparison of inner state of 2 Books
     * ID is not compared to have a more general comparison 
     */
    @Override
    public boolean equals(Object that){
        if(null == that || !(that instanceof Book)){
            return false;
        }
        Book other = (Book)that;
        return  this.genre == other.genre && 
                this.title.equals(other.title) && 
                this.author.equals(other.author) &&
                this.reservePrice == other.reservePrice;
    }
}