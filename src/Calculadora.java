public class Calculadora {

    double N1;
    double N2;

    public Calculadora(double a, double b) {
        this.N1 = a;
        this.N2 = b;
    }

    public double soma(){
        return N1 + N2;
    }
    public double subtracao() {
        return N1 - N2;
    }

    public void Resultado(){
        System.out.println("A soma é:" + soma());
        System.out.println("A subtração é: " + subtracao());
    }

}
