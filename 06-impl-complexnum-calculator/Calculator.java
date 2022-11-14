public class Calculator {
    int nOpDone;
    double lastRes;

    void build(){
        nOpDone=0;
        lastRes=0;
    }
    double add(double n1, double n2){
        nOpDone++;
        lastRes=n1+n2;
        return lastRes;
    }

    double sub(double n1, double n2){
        nOpDone++;
        lastRes=n1-n2;
        return lastRes;
    }

    double mul(double n1, double n2){
        nOpDone++;
        lastRes=n1*n2;
        return lastRes;
    }

    double div(double n1, double n2){
        nOpDone++;
        lastRes=n1/n2;
        return lastRes;
    }
}
