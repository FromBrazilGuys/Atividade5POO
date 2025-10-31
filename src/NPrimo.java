public class NPrimo {
    double NP1;

    public NPrimo (double a) {
        this.NP1 = a;
    }
    public boolean CalcNP () {
        if (NP1 <= 1) {
            return false;
        }
        for (int i = 2; i <= NP1 / 2; i++) {
            if (NP1 % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void ResuNP(){
        System.out.println(CalcNP());
    }

}
