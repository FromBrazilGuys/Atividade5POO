public class Aluno {
// extends Pessoa {
    private String A1;
    private double Nota1;
    private double Nota2;
    private double Nota3;

    public Aluno(String NAluno){
        this.A1 = NAluno;
    }

    public void NotasA(double a, double b, double c){
        this.Nota1 = a;
        this.Nota2 = b;
        this.Nota3 = c;
    }

    public double MediaA(){
        return (Nota1 + Nota2 + Nota3) / 3;
    }

    public void ResuMediaA() {
        System.out.println("A média do(a) aluno(a) " + A1 + " é: " + MediaA());
    }
}
