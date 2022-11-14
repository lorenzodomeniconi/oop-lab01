class ComplexNum {
    double re, im;

    void build(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        if(re == num.re && im == num.im){
            return true;
        }
        return false;
    }

    void add(ComplexNum num) {
        re += num.re;
        im += num.im;
    }

    String toStringRep() {
        return ""+re+"+("+im+")i";
    }
}