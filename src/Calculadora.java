public class Calculadora {

    double N1;
    double N2;
    double N3;
    double NP1;

    public Calculadora(double a, double b, double c, double d) {
        this.N1 = a;
        this.N2 = b;
        this.N3 = c;
        this.NP1 = d;
    }

    public double soma(){
        return N1 + N2;
    }
    public double subtracao() {
        return N1 - N2;
    }

    public void Resultado(){
        System.out.println(N1+ " + " +N2+ " = " + soma());
        System.out.println(N1+ " + " +N2+ " = " + subtracao());
    }
    //    -----------------------
    public double DobroR(){
        return N1 * 2;
    }
    public void ResultadoDobro(){
        System.out.println(N1+ " x " +N1+ " = " +DobroR());
    }
    //    -----------------------
    public boolean PoI(){
        return N1 % 2 == 0;
    }
    public void ResuIP(){
        System.out.println("O primeiro número é par? " +PoI());
    }

    public void MNResu() {
        if (N1 > N2) {
            System.out.println(N1 + " é maior que " +N2);
        } else {
            System.out.println(N2 + " é maior que " +N1);
        }
    }
    public void menorEntreTres() {
        double menor = N1;

        if (N2 < menor) {
            menor = N2;
        }
        if (N3 < menor) {
            menor = N3;
        }
        System.out.println("O menor número entre 3 é: " + menor);
    }

    public void ResultadoT () {
        int M = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(N1 + " x " + i + " = " + (N1 * i));
        }
    }
    public boolean CalcNP () {
        if (N1 <= 1) {
            return false;
        }
        for (int i = 2; i <= N1 / 2; i++) {
            if (N1 % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void ResuNP() {
        System.out.println("O número " +N1+ " é um número primo? " +CalcNP());
    }

    public double RQ() {
        return Math.sqrt(N1);
    }
    public void RaizQResu () {
        System.out.println("A raiz quadrada de " +N1+ " é: " +RQ());
    }

    public double PotResu () {
        long resultado = 1;
        int i = 0;

        while (i < NP1) {
            resultado *= N1;
            i++;
        }
        return resultado;
    }
    public void TextPot (){
        System.out.println("O resultado de " + N1 + " elevado a " + NP1 + " é: " + PotResu());
    }
}
