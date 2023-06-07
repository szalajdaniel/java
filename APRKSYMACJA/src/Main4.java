import java.sql.SQLOutput;

public class Main4 {
    //CZESC INTERAKTYWNA - TU WPROWADZAMY//////
    static int n = 4;
    static double x = -0.25;
    // static double x = 1;
    static double b = 1;
    static double a = -1;
    static double fx(double x){
        double funkcja_fx = Math.sqrt(Math.pow(x,2)+2*x+7);
// double funkcja_fx = Math.exp(x);
        return funkcja_fx;
    }
    static double px = 1;
    //CZESC LICZACA - KOD//////
    public static double LiczCalke(double x, int i, double px){
        if (i == 0){
            double f = px * Math.pow(1,2);

            return f;
        }
        if (i == 1){
            double f = px * Math.pow(x, 2);

            return f;
        }
        if (i == 2){
            double f = px * Math.pow(((1.0/2.0) * ((3 * Math.pow(x,2)) - 1)), 2);

            return f;
        }
        if (i == 3){
            double f = px * Math.pow(((1.0/2.0) * (5 * Math.pow(x,3) - 3*x)), 2);
            return f;
        }
        if (i == 4){
            double f = px * Math.pow(((1.0/8.0) * (35 * Math.pow(x,4) - 30 * Math.pow(x,2) + 3)),
                    2);
            return f;
        }
        if (i == 5){
            double f = px * Math.pow(((1.0/8.0) * (63 * Math.pow(x,5) - 70 * Math.pow(x,3) + 15 *
                    x)), 2);
            return f;
        }
        if (i == 6){
            double f = px * Math.pow(((1.0/16.0) * (231 * Math.pow(x,6) - 315 * Math.pow(x,4) +
                    105 * Math.pow(x,2) - 5)), 2);
            return f;
        }
        if (i == 7){
            double f = px * Math.pow(((1.0/16.0) * (429 * Math.pow(x,7) - 693 * Math.pow(x,5) +
                    315 * Math.pow(x,3) - 35 * x)), 2);
            return f;
        }
        if (i == 8){
            double f = px * Math.pow(((1.0/128.0) * (6435 * Math.pow(x,8) - 12012 *
                    Math.pow(x,6) + 6930 * Math.pow(x,4) - 1260 * Math.pow(x,2) + 35)), 2);
            return f;
        }
        if (i == 9){
            double f = px * Math.pow(((1.0/128.0) * (12155 * Math.pow(x,9) - 25740 *
                    Math.pow(x,7) + 18018 * Math.pow(x,5) - 4620 * Math.pow(x,3) + 315 * x)), 2);
            return f;
        }
        if (i == 10){
            double f = px * Math.pow(((1.0/256.0) * (46189 * Math.pow(x,10) - 109395 *
                    Math.pow(x,8) + 90090 * Math.pow(x,6) - 30030 * Math.pow(x,4) + 3465 * Math.pow(x,2) -
                    63)), 2);
            return f;
        }
        if (i == 11){
            double f = px * Math.pow(((1.0/256.0) * (88179 * Math.pow(x,11) - 230945 *
                    Math.pow(x,9) + 218790 * Math.pow(x,7) - 90090 * Math.pow(x,5) + 15015 * Math.pow(x,3) -
                    693 * x)), 2);

            return f;
        }
        else return 0;

    }
    public static double LiczCalke2(double x, int i, double px){
        if (i == 0){
            double f = px * 1 * fx(x);
            return f;
        }
        if (i == 1){
            double f = px * x * fx(x);
            return f;
        }
        if (i == 2){
            double f = px * ((1.0/2.0) * ((3 * Math.pow(x,2)) - 1)) * fx(x);
            return f;
        }
        if (i == 3){
            double f = px * ((1.0/2.0) * (5 * Math.pow(x,3) - 3*x)) * fx(x);
            return f;
        }
        if (i == 4){
            double f = px * ((1.0/8.0) * (35 * Math.pow(x,4) - 30 * Math.pow(x,2) + 3)) * fx(x);
            return f;
        }
        if (i == 5){
            double f = px * ((1.0/8.0) * (63 * Math.pow(x,5) - 70 * Math.pow(x,3) + 15 * x)) *
                    fx(x);
            return f;
        }
        if (i == 6){
            double f = px * ((1.0/16.0) * (231 * Math.pow(x,6) - 315 * Math.pow(x,4) + 105 *
                    Math.pow(x,2) - 5)) * fx(x);
            return f;
        }
        if (i == 7){
            double f = px * ((1.0/16.0) * (429 * Math.pow(x,7) - 693 * Math.pow(x,5) + 315 *
                    Math.pow(x,3) - 35 * x)) * fx(x);
            return f;
        }
        if (i == 8){
            double f = px * ((1.0/128.0) * (6435 * Math.pow(x,8) - 12012 * Math.pow(x,6) + 6930 *
                    Math.pow(x,4) - 1260 * Math.pow(x,2) + 35)) * fx(x);
            return f;
        }
        if (i == 9){
            double f = px * ((1.0/128.0) * (12155 * Math.pow(x,9) - 25740 * Math.pow(x,7) +
                    18018 * Math.pow(x,5) - 4620 * Math.pow(x,3) + 315 * x)) * fx(x);
            return f;
        }
        if (i == 10){
            double f = px * ((1.0/256.0) * (46189 * Math.pow(x,10) - 109395 * Math.pow(x,8) +
                    90090 * Math.pow(x,6) - 30030 * Math.pow(x,4) + 3465 * Math.pow(x,2) - 63)) * fx(x);
            return f;
        }
        if (i == 11){
            double f = px * ((1.0/256.0) * (88179 * Math.pow(x,11) - 230945 * Math.pow(x,9) +
                    218790 * Math.pow(x,7) - 90090 * Math.pow(x,5) + 15015 * Math.pow(x,3) - 693 * x)) * fx(x);
            return f;
        }
        else return 0;
    }
    public static void main(String[] args) {
        double[] Pw = new double[12];
        Pw[0] = 1;
        Pw[1] = x;
        Pw[2] = ((1.0/2.0) * ((3 * Math.pow(x,2)) - 1));
        Pw[3] = ((1.0/2.0) * (5 * Math.pow(x,3) - 3*x));
        Pw[4] = ((1.0/8.0) * (35 * Math.pow(x,4) - 30 * Math.pow(x,2) + 3));
        Pw[5] = ((1.0/8.0) * (63 * Math.pow(x,5) - 70 * Math.pow(x,3) + 15 * x));
        Pw[6] = ((1.0/16.0) * (231 * Math.pow(x,6) - 315 * Math.pow(x,4) + 105 * Math.pow(x,2)
                - 5));
        Pw[7] = ((1.0/16.0) * (429 * Math.pow(x,7) - 693 * Math.pow(x,5) + 315 * Math.pow(x,3)
                - 35 * x));
        Pw[8] = ((1.0/128.0) * (6435 * Math.pow(x,8) - 12012 * Math.pow(x,6) + 6930 *
                Math.pow(x,4) - 1260 * Math.pow(x,2) + 35));
        Pw[9] = ((1.0/128.0) * (12155 * Math.pow(x,9) - 25740 * Math.pow(x,7) + 18018 *
                Math.pow(x,5) - 4620 * Math.pow(x,3) + 315 * x));
        Pw[10] = ((1.0/256.0) * (46189 * Math.pow(x,10) - 109395 * Math.pow(x,8) + 90090 *
                Math.pow(x,6) - 30030 * Math.pow(x,4) + 3465 * Math.pow(x,2) - 63));
        Pw[11] = ((1.0/256.0) * (88179 * Math.pow(x,11) - 230945 * Math.pow(x,9) + 218790 *
                Math.pow(x,7) - 90090 * Math.pow(x,5) + 15015 * Math.pow(x,3) - 693 * x));
        double nC = 20;
        double[] A = new double[n+2];
        for ( int i = 0; i < n+2; i++){
            for ( int j = 0; j < nC; j ++){
                double x1 = a + ((j/nC) * (b-a));
                double x2 = a + (((j+1)/nC) * (b-a));
                double t = (x2 + x1) / 2;
                double h = (x2 - x1) / 2;
                A[i] = A[i] + ((h/3) * (LiczCalke(x1, i, px) + (4*(LiczCalke(t, i, px))) + LiczCalke(x2,
                        i, px)));
            }
        }

        double nC2 = 20;
        double[] C = new double[n+2];
        for ( int i = 0; i < n+2; i++){
            for ( int j = 0; j < nC2; j ++){
                double x1 = a + ((j/nC2) * (b-a));
                double x2 = a + (((j+1)/nC2) * (b-a));
                double t = (x2 + x1) / 2;
                double h = (x2 - x1) / 2;
                C[i] = (C[i] + ((h/3) * (LiczCalke2(x1, i, px) + (4*(LiczCalke2(t, i, px))) +
                        LiczCalke2(x2, i, px))));
                }
        }//System.out.println(C[0]);
        double[] Wspolczynniki = new double[n+1];
        for (int i = 0; i < n+1; i++ ){
            Wspolczynniki[i] = ((1/A[i]) * C[i]);
        }System.out.println(Wspolczynniki[0]);
        double Wynik = 0;
        for (int i = 0; i < n+1; i++){
            Wynik = Wynik + Wspolczynniki[i] * Pw[i];
        }
        System.out.println("Wynik: " + Wynik);
    }
}
