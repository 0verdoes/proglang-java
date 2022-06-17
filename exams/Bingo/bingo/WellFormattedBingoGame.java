package bingo;

import java.util.List;

public class WellFormattedBingoGame extends BingoGame{

    private final int maxRowNameLen;

    public WellFormattedBingoGame(List<String> rowNames, int m){
        super(rowNames, m);
        int indentTo = 0;
        for(String str : this.rowNames){
            if(indentTo < str.length()){
                indentTo= str.length();
            }
        }

        maxRowNameLen = indentTo;
    }

    @Override
    public void addIdentation(StringBuilder sb, String row) {
        int toAdd = maxRowNameLen - row.length();
        for(int i = 0; i < toAdd;++i){
            sb.append(" ");
        }
    }

}
