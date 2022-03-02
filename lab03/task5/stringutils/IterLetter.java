package stringutils;

public class IterLetter {
    private int index;
    private String str;

    public IterLetter(String str){
        if(null == str){
            throw new IllegalArgumentException("Cannot iterate through null String!");
        }
        this.str = str;
        this.index = 0;
    }

    public void printNext(){
        if(index < str.length())
            System.out.println(str.charAt(this.index++));
    }

    public void restart(){
        index = 0;
    }

    public boolean hasNext(){
        return index < str.length();
    }
}
