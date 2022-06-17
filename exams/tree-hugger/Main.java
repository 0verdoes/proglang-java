import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

import node.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            HashMap<String, Node> keys = new HashMap<>();
            while(sc.hasNextLine()){
                String line  = sc.nextLine();
                String[] sides = line.split("=");
                String key = sides[0].trim();
                Node node = null;
                if(sides[1].contains("+")){
                    String[] lineKeys = sides[1].split("\\+");
                    for(int i = 0; i < lineKeys.length;++i){
                        lineKeys[i] = lineKeys[i].trim();
                    }
                    if(!keys.containsKey(lineKeys[0]) || !keys.containsKey(lineKeys[1])){
                        throw new IllegalStateException("Keys (" +lineKeys[0] + ", " + lineKeys[1] + 
                                        " )read before found in file: input.txt");
                    }
                    node = new AdditionNode(keys.get(lineKeys[0]), keys.get(lineKeys[1]));
                } else {
                    node = new LeafNode(Integer.parseInt(sides[1].trim()));
                }

                keys.put(key, node);
            }
            
            for(Entry<String, Node> e : keys.entrySet()){
                System.out.println(e.getKey() + ": " + e.getValue() + " -> " + e.getValue().getValue());
            }   
        } catch (FileNotFoundException e) {
            System.err.println("input.txt not found!");
        }
    }
}
