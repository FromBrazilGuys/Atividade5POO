public class Idade extends Pessoa{
    double I1;

    public Idade(String nome) {
        super(nome);
    }

    public void Idade(double a) {
        this.I1 = a;
    }
    public void ResuId() {
        if (I1 > 18) {
            System.out.println(nome + " você é maior de idade");
        } else {
            System.out.println(nome +" acesso negado, você é menor de idade");
        }
    }

}