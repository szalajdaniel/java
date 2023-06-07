
public class Main{

    public static double x=1;
    public static double px = 1;
    public static double Fx = Math.sqrt(x);
    public static int stopienFi=2;
    public static double[] tablicafx = new double[stopienFi+1];

    public static double[][] macierz = new double[stopienFi][stopienFi];

    public static double obliczamx(double x) {

        for (int i=0;i<=stopienFi; i++) {

            if (i == 0) {
                tablicafx[0] = 1;
            } else
            {
                tablicafx[i] = Math.pow(x, i);
            }

        }
      // System.out.println(tablicafx[2]);
        return 0;
    }

    public static double setmacierz() {

        for (int i = 0; i < stopienFi; i++) {
            for (int j = 0; j < stopienFi; j++) {
                //tutaj bedzie trzeba uzyc metody(trapezow) do wyznaczenia całki
                macierz[i][j] = tablicafx[i] * tablicafx[j] * px;

             //   double obliczamxx = obliczamxX(n, 1, 3, xx,pomocx);
               // double wynikkk = funkcja1(n, 1, 3, xx,pomocx);

            }
        }
        return 0;
    }

    public static void main(String[] args) {

        double obliczamx = obliczamx(x);
        System.out.println(obliczamx);
        double w = setmacierz();
        System.out.println(w);



    }

}
