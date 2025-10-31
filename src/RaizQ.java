public class RaizQ {
    Double RQ1;

    public RaizQ (double a) {
        this.RQ1 = a;
    }
    public double RQ() {
        return Math.sqrt(RQ1);
    }
    public void RaizQResu () {
        System.out.println(RQ());
    }
}
