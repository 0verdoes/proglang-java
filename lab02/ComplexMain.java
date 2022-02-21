class ComplexMain {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 1);
        System.out.println("orig: " +c1);
        c1.recip();
        System.out.println("recip: " +c1);
        c1.div(new Complex(2, 2));
        System.out.println("div/2: " +c1);

    }
}
