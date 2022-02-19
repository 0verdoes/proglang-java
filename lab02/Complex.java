// Class to represent simple Complex nuumbers
class Complex {
    //public for simple testing purposes
    public double im, re;

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
        this.re = this.re * c.re - this.im * c.im;
        this.im = this.re * c.re + this.im * c.im;
    }

    public void recip(){
        this.re = this.re / (Math.pow((this.re),2) + (Math.pow((this.im),2)));
        this.im = this.im / (Math.pow((this.re),2) + (Math.pow((this.im),2)));
    }

    public void div(Complex c){
        Complex tmp = new Complex();
        //copying c to local variable
        tmp.im = c.im;
        tmp.re = c.re;
        tmp.recip();
        this.sub(tmp);
    }
}
