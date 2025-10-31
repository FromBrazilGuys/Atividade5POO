public class DobroCalc {
    double D1;

    public DobroCalc(double a) {
        this.D1 = a;
    }

    public double DobroR(){
        return D1 * 2;
    }

    public void Resultado(){
        System.out.println("O dobro de " + D1 +" é: " + DobroR());
    }
}
