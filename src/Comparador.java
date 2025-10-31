public class Comparador {
    double C1;
    double C2;

    public Comparador(double a, double b){
        this.C1 = a;
        this.C2 = b;
    }
    public void Resultado() {
        if (C1 > C2) {
            System.out.println("O numero " + C1 + " é maior");
        } else {
            System.out.println("O numero " + C2 + " é maior");
        }
    }
}
