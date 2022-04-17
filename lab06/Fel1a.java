class Fel1a{


    public static void main(String[] args) {

        try {
            if(args.length != 3){
                throw new IllegalArgumentException("Only EXACTLY 3 arguments are supported");
            }

            double a = Integer.parseInt(args[0]),
                   b = Integer.parseInt(args[2]),
                   result  = 0;
            char operator = args[1].charAt(0);//this could be more refined
            switch(operator){
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if(b == 0){
                        throw new ArithmeticException("Division by zero error, you aren't too clever R U?");
                    }
                    result = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operation!");
            }

            System.out.println("Result is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("ILLEGAL-ARGUMENT-EXCAPTION:: " + e.getMessage());
            e.printStackTrace();
        } catch(ArithmeticException e){
            System.out.println("ARITHMETIC-EXCAPTION:: " + e.getMessage());
            e.printStackTrace();
        } catch(NumberFormatException e){
            System.out.println("NMBFORMAT:: " + e.getMessage());
            e.printStackTrace();
        } catch(Exception e){
            System.out.println("EXCAPTION:: " + e.getMessage());
            e.printStackTrace();
        } finally{
            System.out.println("FINALLY:: We done finally ;)" );
        }
    }
}