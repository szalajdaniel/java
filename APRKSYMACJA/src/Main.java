public class Main {
    public static double x=-0.25;
    public static double h1;
    public static double h;
    public static int stopienFi=4;

    public static double[][] macierz = new double[stopienFi+1][stopienFi+1];
    public static double[] macierz_a = new double[stopienFi];
    public static double px = 1;


    public static double h1(double a, double b,double n){
        h1= (b-a)/n;
        return h1;
    }
    public static double GAUSSS(double[] wyniki){
        int rozmiar = stopienFi;


        // Eliminacja Gaussa
        for (int k = 0; k < rozmiar - 1; k++) {
            for (int i = k + 1; i < rozmiar; i++) {
                double wspolczynnik = macierz[i][k] / macierz[k][k];
                for (int j = k; j <= rozmiar; j++) {
                    macierz[i][j] -= wspolczynnik * macierz[k][j];
                }
            }
        }


        for (int i = rozmiar - 1; i >= 0; i--) {
            wyniki[i] = macierz[i][rozmiar];
            for (int j = i + 1; j < rozmiar; j++) {
                wyniki[i] -= macierz[i][j] * wyniki[j];
            }
            wyniki[i] /= macierz[i][i];
        }

        System.out.println("Wyniki: a");
        for (int i =0;i<rozmiar;i++) {
            System.out.println("a"+(i)+" = "+wyniki[i]);
        }
        return 0;
    }
    public static double obliczamxX(int n, double a, double b, double[] x, double[] pomocx, int k, int l,double fx){


        for (int i=0;i<=n;i++){

            x[i]=a+(h1*(i));

        }
        for (int i=0;i<n;i++){

            pomocx[i]=(x[i]+x[i+1])/2;

            pomocx[i]=Math.pow(pomocx[i], k)*Math.pow(pomocx[i], l)*px;//wzor




        }h=(x[n]-x[n-1])/2;
        for (int i=0;i<=n;i++){
            x[i]=a+(h1*(i));

            x[i]=Math.pow( x[i],k)*Math.pow(x[i], l)*px;//wzor


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
        // System.out.println("h1: "+h1);
        // System.out.println("h2: "+h);
        // System.out.println("n: "+n);

        //System.out.println((h/3)*wynikfunkcji1);
        return (h/3)*wynikfunkcji1;

    }


    public static double obliczam_a(int n, double a, double b, double[] x, double[] pomocx, int k, int l,double fx){


        for (int i=0;i<=n;i++){

            x[i]=a+(h1*(i));

        }
        for (int i=0;i<n;i++){

            pomocx[i]=(x[i]+x[i+1])/2;

            pomocx[i]=Math.pow(pomocx[i], k)*Math.sqrt(2 + (5 * Math.pow(pomocx[i], 2)))*px;//wzor




        }h=(x[n]-x[n-1])/2;
        for (int i=0;i<=n;i++){
            x[i]=a+(h1*(i));

            x[i]=Math.pow(x[i], k)*Math.sqrt(2 + (5 * Math.pow(x[i], 2)))*px;//wzor


        }

        return 0;
    }
    public static double funkcja_a(int n, double a, double b, double[] x, double[]pomocx){


        double wynikfunkcji1=x[0]+x[n];



        for(int i=0;i<=n-1;i++){
            wynikfunkcji1+=4*pomocx[i];


        }
        for(int i=1;i<=n-1;i++){
            wynikfunkcji1+=2*x[i];


        }
        // System.out.println("h1: "+h1);
        // System.out.println("h2: "+h);
        // System.out.println("n: "+n);


        return (h/3)*wynikfunkcji1;
    }
    public static double obliczeniowa (int n, double a, double b, double[] x, double[]pomocx,double fx){
        for (int k=0;k<stopienFi; k++){
            for (int l=0;l<stopienFi+1; l++){
                double obliczamxx = obliczamxX(n, -1, 1, x,pomocx,k,l,fx);
                double wynikkk = funkcja1(n, -1, 1, x,pomocx);
                double obliczam_a = obliczam_a(n, -1, 1, x,pomocx,k,l,fx);
                double wynik_a = funkcja_a(n, -1, 1, x,pomocx);

                macierz[k][l] = wynikkk;

                macierz_a[k] = wynik_a;

                macierz[k][macierz.length-1] = wynik_a;
                if(l==stopienFi)
                {
                    //System.out.println("Macierz_a"+k+": "+macierz[k][l]);
                }else
                {
                    System.out.println("Macierz"+k+"|"+l+": "+macierz[k][l]);
                }




            }
            // System.out.println("Macierz A"+k+": "+macierz_a[k]);
        }
        return 0;
    }
    public static double WYNIK_INTERPOLACJI(double[] wyniki){

        double gauss= GAUSSS(wyniki);
        double interpolacja=0;
        for(int i=0;i<stopienFi;i++){
            if(i>0){
                interpolacja+=wyniki[i]*Math    .pow(x,i);
                //   System.out.println(interpolacja);
            }
            else interpolacja+=wyniki[i];
        }
        return interpolacja;
    }

    public static void main(String[] args) {
        double[] wyniki = new double[stopienFi];
            double fx = Math.sqrt(Math.pow(x,2)+3*x+7);
        int n = stopienFi;
        double[] pomocx = new double[n];
        double[] xx = new double[n + 1];
        double wynikh = h1(-1, 1, n);
        double wynikkk = obliczeniowa(n, -1, 1, xx,pomocx,fx);
        double APROKSYMACJA = WYNIK_INTERPOLACJI(wyniki);
        System.out.println("\nWynik APROKSYMACJA:\n"+"F("+x+"):"+APROKSYMACJA);

    }
}

