public class Tabuada {
    double T1;

    public Tabuada(double a){
        this.T1 = a;
    }
    public void ResultadoT () {
        int M = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(T1 + " x " + i + " = " + (T1 * i));
        }
    }
}
