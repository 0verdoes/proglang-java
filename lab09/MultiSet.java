import java.util.HashMap;

public class MultiSet {
    
    private HashMap<String, Integer> set;

    public MultiSet() {
        this.set = new HashMap<String, Integer>();
    }

    public MultiSet(HashMap<String, Integer> set) {
        this.set = new HashMap<>(set);//deep copy
        //this.set = new HashMap<String, Integer>(set);
        //this.set.addAll(set);
        //both solutions works perfectly
    }

    public HashMap<String, Integer> getData(){
        return new HashMap<>(this.set);//this is to make a deeo  copy
    }

    public void add(String str){
        if(this.set.containsKey(str)){
            this.set.put(str, this.set.get(str) + 1);
        } else{
            this.set.put(str, 1);
        }
    }

    public HashMap<String, Integer> intersect(MultiSet other){
        HashMap<String, Integer> that = other.getData();
        HashMap<String, Integer> result = new HashMap<>();
        this.set.forEach((str, num) -> { //needs 2 lamdba arguments, this is how you do the right syntax
            if(that.containsKey(str)){
                result.put(str, Math.min(num, that.get(str)));
            }
        });
        return result;
    }

}
