public class Comparador2 {
    int C1;
    int C2;
    int C3;

    public Comparador2(int a, int b, int c){
        this.C1 = a;
        this.C2 = b;
        this.C3 = c;
    }
    public void menorEntreTres() {
        int menor = C1;

        if (C2 < menor) {
            menor = C2;
        }
        if (C3 < menor) {
            menor = C3;
        }
        System.out.println("O menor número é: " + menor);

    }

}

