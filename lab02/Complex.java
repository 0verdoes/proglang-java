// Class to represent simple Complex nuumbers
class Complex {
    //public for simple testing purposes
    public double im, re;

    public Complex(double re, double im){
        this.im = im;
        this.re = re;
    }

    public double abs(){
        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
    }

    public void add(Complex c){
        this.re += c.re;
        this.im += c.im;
    }
    public void sub(Complex c){
        this.re -= c.re;
        this.im -= c.im;
    }
    public void mul(Complex c){
        double orig_re = this.re; // next line changes re value
        //making calculation invalid if originale value is not saved
        this.re = this.re * c.im - this.im * c.re;
        this.im = orig_re * c.im + this.im * c.re;
    }

    public void recip(){
        double orig_re = this.re; // next line changes re value
        //making calculation invalid if originale value is not saved
        this.re =               orig_re /
            (Math.pow((orig_re),2) + (Math.pow((this.im),2)));
        this.im =              -this.im /
            (Math.pow((orig_re),2) + (Math.pow((this.im),2)));
    }

    public void div(Complex c){
        Complex tmp = new Complex(c.re, c.im);
        tmp.recip();
        this.mul(tmp);
    }

    @Override
    public String toString() {
        return "re: " + this.re + ", im: " + this.im;
    }
}
