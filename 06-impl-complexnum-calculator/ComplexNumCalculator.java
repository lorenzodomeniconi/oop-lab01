public class ComplexNumCalculator{    
    int nOpDone;
    ComplexNum lastRes = new ComplexNum();

    void build(){
        nOpDone=0;
        lastRes.build(0, 0);
    }
    String add(ComplexNum n1, ComplexNum n2){
        nOpDone++;
        lastRes.re=n1.re+n2.re;
        lastRes.im=n1.im+n2.im;
        return lastRes.toStringRep();
    }

    String sub(ComplexNum n1, ComplexNum n2){
        nOpDone++;
        lastRes.re=n1.re-n2.re;
        lastRes.im=n1.im-n2.im;
        return lastRes.toStringRep();
    }

    String mul(ComplexNum n1, ComplexNum n2){
        nOpDone++;
        lastRes.re=n1.re*n2.re;
        lastRes.im=n1.im*n2.im;
        return lastRes.toStringRep();
    }

    String div(ComplexNum n1, ComplexNum n2){
        nOpDone++;
        lastRes.re=n1.re/n2.re;
        lastRes.im=n1.im/n2.im;
        return lastRes.toStringRep();
    }
}