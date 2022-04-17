public class Fel3 {

    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Usage: java Fel3 <filename>");
            System.exit(1);
        }

        System.out.println("What string to count in "+ args[0] + "?");
        String target = System.console().readLine();
        if(target.length() == 0 || null == target){
            System.out.println("Wrong input!");
            System.exit(1);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            int cnt = 0;
            while(null != (line = br.readLine())){
                if(line.contains(target)){
                    ++cnt;
                }
            }
            System.out.println("Number of lines containing " + target+ ":" + " " + cnt);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
    
}
