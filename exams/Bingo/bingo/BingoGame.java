package bingo;

import java.util.*;

import bingo.exception.BingoException;
import bingo.exception.BingoExceptionReason;

public class BingoGame{
    
    protected List<String> rowNames;
    protected boolean[] isHit;

    public BingoGame(List<String> rowNames, int m){
        if(rowNames == null || m < 1){
            throw new IllegalArgumentException();
        }

        this.rowNames = new ArrayList<>(rowNames);
        isHit = new boolean[rowNames.size() * m];
    }

    public int getRowCount(){
        return rowNames.size();
    }

    public int getColumnCount(){
        return isHit.length / rowNames.size();
    }

    public void call(String rowName, int column) throws BingoException{
        if(column < 0){
            throw new BingoException(BingoExceptionReason.WRONG_COLUMN);
        }

        if(null == rowName || !rowNames.contains(rowName)){
            throw new BingoException(BingoExceptionReason.WRONG_ROW);
        }

        int index = this.rowNames.indexOf(rowName) * this.getColumnCount() + column;
        assert(index >= this.isHit.length);
        this.isHit[index] = true;
    }

    public void addIdentation(StringBuilder sb, String row){};

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String row : this.rowNames){
            sb.append(row);
            addIdentation(sb, row);
            int columnLen = this.getColumnCount();
            int firstIndex = columnLen *  this.rowNames.indexOf(row);
            for(int i = firstIndex; i < firstIndex + columnLen; ++i){
                sb.append(isHit[i]? " x" :" 0");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}