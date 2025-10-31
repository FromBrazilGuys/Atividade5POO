public class Pessoa {
    String N;
    double P;
    double A;
    int I;

    public Pessoa(String nome) {
        this.N = nome;
    }
    public void Peso(double peso) {
        this.P = peso;
    }
    public void Altura(double altura) {
        this.A = altura;
    }
    public void Idade(int idade){
            this.I = idade;
    }

    public double CalculoIMC() {
        return P / (A * A);
    }
    public void ResultadoIMC(){
        System.out.println("Seu IMC é: " + CalculoIMC());
    }
    public void ResuId() {
        if (I > 18) {
            System.out.println(N + " você é maior de idade");
        } else {
            System.out.println(N +" acesso negado, você é menor de idade");
        }
    }
}


