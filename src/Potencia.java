public class Potencia {
    double PN1;
    double PE1;

    public Potencia (double a, double b){
        this.PN1 = a;
        this.PE1 = b;
    }
    public double PotResu () {
        long resultado = 1;
        int i = 0;

        while (i < PE1) {
            resultado *= PN1;
            i++;
        }
        return resultado;
    }
    public void TextPot (){
        System.out.println("O resultado de " + PN1 + " elevado a " + PE1 + " é: " + PotResu());
    }
}
