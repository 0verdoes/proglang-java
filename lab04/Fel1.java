class Fel1 {

    /**Solves both A and B side of exercise
     * If given args, process them and do the
     * mathametics with whatever the arrays hold
     *
     * There is some play with Double[] and double[] types as well
    */
    public static void main(String[] args) {

        double array[];
        Double ref_array[];

        if(args.length > 0){
            System.out.println("Mennyi számot olvassak be?");
            int n     =  Integer.parseInt(System.console().readLine());
            array     = new double[n];
            ref_array = new Double[n];
            for(int i = 0; i < n;++i){
                System.out.print((i + 1) + ": ");
                array[i]     = Double.parseDouble(System.console().readLine());
                ref_array[i] = array[i];
            }
        } else{
            array     = new double[]{-3.14, 4.20, 5, 6, 70.5};
            ref_array = new Double[]{-3.14, 4.20, 5., 6., 70.5};
        }
        double avg = 0;
        //foreach loop
        //can loop through any Collection, Array, and data structure in general
        //But this loop is a "read only" loop, you cannot modify the values stored in the looped object
        for(double num : array){
            avg += num;
            System.out.print(num + ( num == array[array.length - 1]?"\n" : ", "));
            num = 42;
        }

        avg /= array.length;
        for(int i = 0; i < array.length;++i){
            System.out.print(array[i] + ( i == array.length-1? "\n" : ", "));
        }
        //not even if it is a reference type
        for(double num : ref_array){
            avg += num;
            System.out.print(num + ( num == ref_array[ref_array.length - 1]?"\n" : ", "));
            num = 4.2;
        }
        avg /= array.length;
        for(int i = 0; i < ref_array.length;++i){
            System.out.print(array[i] + ( i == ref_array.length-1? "\n" : ", "));
        }
    }
}
