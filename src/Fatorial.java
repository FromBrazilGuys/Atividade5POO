public class Fatorial {
    double F1;

    public Fatorial(double a){
        this.F1 = a;
    }
    public void ResultadoF (){
        double fatorial = 1;
        for (int i = 1; i <= F1; i++){
            fatorial *= i;
            double resultado = (fatorial);
            System.out.println("O fatorial de " + F1 + " é : " + resultado);
        }
    }
}
