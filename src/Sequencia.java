public class Sequencia {
    static int SQ1;
    public Sequencia (int a){
        this.SQ1 = a;
    }

    public static void imprimirAteN() {
        for (int i = 1; i <= SQ1; i++) {
            System.out.println(i);
        }
    }
    private int valorLimite;

    public int somarAteN() {
        int soma = 0;
        for (int i = 1; i <= SQ1; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 até " + SQ1 + " é: " + soma);

        return soma;
    }
    public int somarAteLimite() {
        return somarAteN();
    }
}
