import java.io.*;

class Fel2 {

    public static void main(String[] args){

        // try with resources clears out the created objects, closes the file streams! Doesn't leak anything!
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            int cnt = 0;
            while(null != (line = br.readLine())){
                String[] nums = line.split(",");
                long sum = 0;
                for(int i = 0; i < nums.length;++i){
                    sum += Long.parseLong(nums[i]);
                }
                //if 4, a) this is just a System.out.println
                bw.write("Sum of #" + ++cnt + " line: " + sum + "\n");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
