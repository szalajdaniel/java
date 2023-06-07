public class Main2 {

    public static double wynik;
    public static double h1;
    public static double h;

    public static double h1(double a, double b,double n){
        h1= (b-a)/n;
        return h1;
    }
    public static double obliczamx(int n, double a, double b, double[] x, double[] pomocx){
        for (int i=0;i<=n;i++){

            x[i]=a+(h1*(i));

        }
        for (int i=0;i<n;i++){

            pomocx[i]=(x[i]+x[i+1])/2;

             pomocx[i]=Math.pow(pomocx[i],2.0);

        }h=(x[n]-x[n-1])/2;
        for (int i=0;i<=n;i++){
            x[i]=a+(h1*(i));

            x[i]=Math.pow(x[i],2.0);

        }

        return 0;
    }
    public static double funkcja1(int n, double a, double b, double[] x, double[]pomocx){


        double wynikfunkcji1=x[0]+x[n];

        for(int i=0;i<=n-1;i++){
            wynikfunkcji1+=4*pomocx[i];

        }
        for(int i=1;i<=n-1;i++){
            wynikfunkcji1+=2*x[i];

        }
        System.out.println("h1: "+h1);
        System.out.println("h2: "+h);
        System.out.println("n: "+n);
        return (h/3)*wynikfunkcji1;
    }


    public static void main(String[] args) {
        int n = 3;
        double[] pomocx = new double[n];
        double[] x = new double[n + 1];
        double wynikh = h1(-1, 1, n);
        //System.out.println(wynikh);
        double obliczamxx = obliczamx(n, -1, 1, x,pomocx);

        double wynikkk = funkcja1(n, -1, 1, x,pomocx);
        System.out.println(wynikkk);



    }}