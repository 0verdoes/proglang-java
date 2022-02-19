class Calc {
    //basic calculator
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("2 args pls!");
            return;
        }

        int a = Integer.parseInt(args[0]),
            b = Integer.parseInt(args[1]);

        System.out.println("Summ: " + (a + b));
        System.out.println("Sub : " + (a - b));
        System.out.println("Mult: " + (a * b));
        if(0 != b){
            System.out.println("Div : " + (a / b));
        }else{
            System.out.println("You re not to clever, are you? Div by Zero");
        }
    }
}
