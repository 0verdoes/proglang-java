class Print {

    //mistakes corrected from original, faulty code
    public static void main(String[] args) {

        System.out.print("num1: ");
        int start = Integer.parseInt(System.console().readLine());
        System.out.print("num2: ");
        int end   = Integer.parseInt(System.console().readLine());

        for( int i = start; i <= end; i++ ) {
            System.out.println(i/2.0);
        }
        /*
        int i = 4;
        System.out.println("Kiirtam " + i + " szamot");
        */
    }
}
