package bingo.exception;

public class BingoException extends Exception{
    
    private BingoExceptionReason reason;

    public BingoException(BingoExceptionReason reason){
        super();
        this.reason = reason;
    }

    public BingoExceptionReason getReason(){
        return reason;
    }
}
