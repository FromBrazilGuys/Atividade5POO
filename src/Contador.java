public class Contador {
    double Cont1;

    public Contador (double a) {
        this.Cont1 = a;
    }
    public void ContResu() {
        int qtd = 0;
        for (int i = 1; i <= Cont1; i++) {
            if (i % 2 == 0) {
                qtd++;
                System.out.println("Existem " + qtd + " numeros pares de 1 até " + Cont1);
            }
        }
    }
}
