public class Temperatura {
    double Temp1;

    public Temperatura (double Cº){
        this.Temp1 = Cº;
    }
    public void TempResu(){
        double TempR = (Temp1 * 9 / 5) + 32;
        System.out.println("A temperatura é de " + TempR + "ºFº");
    }
}
