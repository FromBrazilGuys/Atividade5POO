public class ParOuImpar {
    double P1;

    public ParOuImpar(double a) {
        this.P1 = a;
    }

    public boolean PoI(){
        return P1 % 2 == 0;
    }
    public void ResuIP(){
        System.out.println(PoI());
    }
}
