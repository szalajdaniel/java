////
////
//public class Main {
//        public static double interpolacjaLagrange(double[] tablicax, double[] tablicay, double x) {
//            double wynik=0;
//            for (int i=0; i<tablicax.length; i++) {
//                double oblicz=tablicay[i];
//                for (int j=0; j<tablicax.length; j++) {
//                    if (i==j) {
//
//                    }
//                    else if(i!=j)
//                    {
//                    oblicz=oblicz*((x-tablicax[j])/(tablicax[i]-tablicax[j]));
//                    }
//                }
//                wynik=wynik+oblicz;
//            }
//            return wynik;
//        }
//    public static void main(String[] args) {
//        double[]tablicax={-4,-2,0,2,4};
//        double[]tablicay={837,41,-3,81,1205};
//        double x = 1;
//        double wyniczek=interpolacjaLagrange(tablicax,tablicay,x);
//        System.out.println("Metoda Lagrange");
//        System.out.println("f(" + x + ") = " +wyniczek);
//    }
//}
//public class Main {
//    public  static double interpolacja(double [] tablicax, double[] tablicay,int rzad, double x){
//        double[] wynik =  tablicax;
//        double[] wynik2 = tablicay;
//        double[] wynik3 = new double[rzad];
//
//        double parm_pomocniczy = 0;
//        int i,j,k,l,p;
//        k=4;
//        for(i=1;i<rzad;i++){
//
//            for(j=rzad-1;j>=i;j--){
//
//                wynik3[j] = (wynik[j+1] - wynik[j]) / (tablicay[j+i-3] - tablicay[j]);
//                System.out.println(wynik3[j]);
//                wynik[j]=wynik3[j];
//
//
//                if(i==4){
//                System.out.println("I rzad: "+wynik3[j]);}
//                if(i==3){
//                    System.out.println("II rzad: "+wynik3[j]);}
//                if(i==2){
//                       System.out.println("III rzad: "+wynik3[j]);}
//                if(i==1){
//                    System.out.println("IV rzad: "+wynik2[j]);}
//
//
//        } double wyniczekk = wynik3[rzad - 1];
//            for (i = rzad - 2; i >= 0; i--) {
//                wyniczekk = wyniczekk * (x - tablicax[i]) + wynik3[i];}}
//
//
//        return 0;
//
//
//
//    }
//
//    public static void main(String[] args) {
//        double[]tablicax = {1,3,2,5,7};
//        double[]tablicay = {0,2,3,4,6};
//        double wyniczek = interpolacja(tablicax,tablicay,4);
//        System.out.println(wyniczek);
//    }
//}

public class Main {

    public static double newton1( double[] tabelax, double[] fx, double x) {
        double[] pomocnicza = new double[tabelax.length];
        pomocnicza[0] = fx[0];
        for (int j =1; j<tabelax.length; j++)
        {
            for (int i = tabelax.length-1; i>=j; i--)
            {
                fx[i]=(fx[i]-fx[i-1])/(tabelax[i]-tabelax[i-j]);
            }
            pomocnicza[j] = fx[j];
        }
        double wynik=pomocnicza[tabelax.length-1];
        for (int i = tabelax.length-2; i>=0; i--)
        {
            wynik=wynik*(x-tabelax[i])+pomocnicza[i];
        }
        return wynik;
    }

    public static void main(String[] args) {
        double[] tabelax = {-4,-2,0,2,4};
        double[]fx = {837,41,-3,81,1205};
        double x = 1;
        double wyniczek = newton1(tabelax, fx, x);
        System.out.println("INTERPOLACJA Metoda Newtona z ilorazami różnicowymi");
        System.out.println("f(" + x + ") = " + wyniczek);
    }
}


//
//public class Main {
//    public static double tablicax[] = {-4,-2,0,2,4};
//    public static double rozmiar(double[] talicax)
//    {
//        return talicax.length+2;
//    }
//
//    public static double rozmiartabeli = rozmiar(tablicax);
//    public static double macierzglowna[][]= new double[(int)rozmiartabeli][(int)rozmiartabeli];
//            public static double pierwsza_macierz(double[] tablicax, double[]fx, double xi)
//            {
//
//            for (int i = 0; i < tablicax.length; i++)
//            {
//                for (int j = 0; j < (int)rozmiartabeli; j++ )
//                {
//                    macierzglowna[i][0] = 1;
//                    macierzglowna[i][1] = 1 * tablicax[i];
//                    macierzglowna[i][2] = 1 * Math.pow(tablicax[i],2);
//                    macierzglowna[i][3] = 1 * Math.pow(tablicax[i],3);
//                    if(i > 0 && j > 3 && j < 4 + i){
//                        macierzglowna[i][j] = Math.pow((tablicax[i] - tablicax[j - 3]), 3);
//                    }
//                }
//            }
//            return 0;
//            }
//
//    public static double druga_macierz(double[] tablicax, double[]fx, double xi){
//
//        for (int j = tablicax.length; j < rozmiartabeli; j++){
//            for (int i = 1; i < rozmiartabeli; i++)
//            {
//                if (j == tablicax.length) {
//                    macierzglowna[j][1] = 1;
//                    macierzglowna[j][2] = 2 * tablicax[0];
//                    macierzglowna[j][3] = 3 * Math.pow(tablicax[0], 2);
//                }
//                if (j == tablicax.length + 1)
//                {
//                    macierzglowna[j][1] = 1;
//                    macierzglowna[j][2] = 2 * tablicax[tablicax.length-1];
//                    macierzglowna[j][3] = 3 * Math.pow(tablicax[tablicax.length-1], 2);
//                    if (i > 3 && i < 4 + j){
//                        macierzglowna[j][i] = 3 * Math.pow((tablicax[tablicax.length-1] - tablicax[i-3]), 2);
//                    }
//                }
//            }
//        }
//        return 0;}
//
//            public static double[] obliczenia = new double[(int)rozmiartabeli];
//            public static double liczenie(double[] tablicax, double[]fx, double x, double wart_pierpoch, double wart_ostrpoch)
//            {
//                for (int i = 0; i < rozmiartabeli - 2; i++) {
//                    obliczenia[i] = fx[i];
//                }
//                obliczenia[(int) rozmiartabeli - 2] = wart_pierpoch;
//                obliczenia[(int) rozmiartabeli - 1] = wart_ostrpoch;
//                double[] L = new double[obliczenia.length];
//                double[][] Rozw = new double[macierzglowna.length][macierzglowna.length];
//                for (int i = 0; i < macierzglowna.length; i++) {
//                    Rozw[0][i] = macierzglowna[0][i];
//                }
//                L[0] = obliczenia[0];
//                for (int i = 0; i < macierzglowna.length; i++) {
//                    for (int k = i + 1; k < macierzglowna.length; k++)
//                    {
//                        L[k] = obliczenia[k] - (obliczenia[i] * (macierzglowna[k][i] / macierzglowna[i][i]));
//                        for (int j = i + 1; j < macierzglowna.length; j++)
//                        {
//                            Rozw[j][k] = macierzglowna[j][k] - (macierzglowna[j][i] / macierzglowna[i][i]) * macierzglowna[i][k];
//                        }
//                    }
//                    for (int t = 0; t < Rozw.length; t++)
//                    {
//                        for (int r = 0; r < Rozw[t].length; r++)
//                        {
//                            macierzglowna[t][r] = Rozw[t][r];
//                        }
//                        obliczenia[t] = L[t];
//                    }
//                }
//                L[obliczenia.length - 1] = L[L.length - 1] / macierzglowna[macierzglowna.length - 1][macierzglowna.length - 1];
//                for (int i = obliczenia.length - 2; i > -1; i--)
//                {
//                    for (int j = i + 1; j < obliczenia.length; j++)
//                    {
//                        L[i] = L[i] - macierzglowna[i][j] * L[j];
//                    }
//                    L[i] = L[i] / macierzglowna[i][i];
//                }
//                double w = L[0] + L[1] * x + L[2] * x * x + L[3] * x * x * x;
//                for (int i = 1; i < tablicax.length; i++)
//                {
//                    if (x > tablicax[i])
//                    {
//                        w = w + L[i + 3] * Math.pow((x - tablicax[i]), 3);
//                    }
//                }
//
//            return w;}
//
//    public static void main(String[] args) {
//        double x = 1;
//        double tablicax[] = {-4, -2, 0, 2, 4};
//        double fx[] = {837,41,-3,81,1205};
//        double wart_pierpoch = -882;
//        double wart_ostpoch = 1166;
//        double rozmiar = rozmiar(tablicax);
//        double m1=pierwsza_macierz(tablicax,fx,x);
//        double m2=druga_macierz(tablicax,fx,x);
//        double wyniczek = liczenie(tablicax,fx,x,wart_pierpoch,wart_ostpoch);
//        System.out.println("INTERPOLACJA Funkcje sklejane.");
//        System.out.println("f(" + x + ") = " +wyniczek);
//    }
//}
//public class Main {
//    public static int getFactorial(int f) {
//        int silnia = 1;
//        for (int i = 1; i <= f; i++) {
//            silnia = silnia * i;
//        }
//        return silnia;
//    }
//    public  static double newton2(int [] x, int[] fx, double xi){
//        double[] tablica = new double[fx.length];
//        int pomocnicza;
//        int[] pomocnicza2 = new int[fx.length];
//        double wzor1 = 1;
//        double wzor2;
//        int h= 0;
//
//        for(int l =0;l<x.length-1;l++){
//            int h_pomoc = x[1]-x[0];
//            h= x[l+1]-x[l];
//            if(h_pomoc==h){
//                //System.out.println("h jest prawidlowe = "+h);
//            }
//            else{
//                System.out.println("Bład h");
//            }
//
//        }
//
//
//        for(int j=1;j<fx.length+1;j++){
//            tablica[j-1] = fx[0];
//            //System.out.println(tablica[j-1]);
//            for(int i=0;i<fx.length-j;i++) {
//                pomocnicza = fx[i + 1] - fx[i];
//               // System.out.println(fx[i + 1] + "+" + fx[i] + "=" + pomocnicza);
//
//                pomocnicza2[i] = fx[i];
//                fx[i] = pomocnicza;
//              //  System.out.println(pomocnicza);
//            }
//            //System.out.println("---------------------");
//        }
//        double wynik = tablica[0];
//
//        for(int k=2;k<fx.length+1;k++){
//            wzor2 = tablica[k-1]/(getFactorial(k-1)*Math.pow(h,k-1));
//          //  System.out.println(tablica[k-1]+"/"+(getFactorial(k-1)+"*"+Math.pow(1,k-1)));
//            wzor1 = (xi-(x[k-2]))*wzor1;
//            //System.out.println("("+xi+"-"+(x[k-2])+")*"+wzor1);
//          System.out.println(wzor1*wzor2);
//            wynik += wzor1*wzor2;
//
//            //System.out.println(wynik);
//
//        }
//
//        return wynik;
//    }
//    public static void main(String[] args) {
//    int[] x = {-4,-2,0,2,4};
//    int[] fx = {837,41,-3,81,1205};
//    double xi = 1;
//    double wyniczek = newton2(x,fx,xi);
//        System.out.println("INTERPOLACJA Metoda Newtona (różnice progresywne)");
//        System.out.println("f(" + xi + ") = " + wyniczek);
//    }}










//public class Main {
//    public static void main(String[] args) {
////CZESC INTERAKTYWNA - TU WPROWADZAMY
//        double X = 3;
//        double x[] = {-4, -2, 0, 2, 4};
//        double fx[] = {396, 30, 0, -30, -12};
//        double wart_pierwszej_poch = -371;
//        double wart_ostatniej_poch = 77;
////CZESC OBLICZENIOWA - KOD LICZĄCY
//        int rozmiar_tab = x.length + 2 ;
//        double S3x[][]= new double[x.length + 2][x.length + 2];
//        for (int a = 0; a < x.length; a++) {
//            for (int b = 0; b < (int)rozmiar_tab; b++ ){
//                S3x[a][0] = 1;
//                S3x[a][1] = 1 * x[a];
//                S3x[a][2] = 1 * Math.pow(x[a],2);
//                S3x[a][3] = 1 * Math.pow(x[a],3);
//                if(a > 0 && b > 3 && b < 4 + a){
//                    S3x[a][b] = Math.pow((x[a] - x[b - 3]), 3);
//                }
//            }
//        }
//        for (int j = x.length; j < rozmiar_tab; j++){
//            for (int c = 1; c < rozmiar_tab; c++){
//                if (j == x.length) {
//                    S3x[j][1] = 1;
//                    S3x[j][2] = 2 * x[0];
//                    S3x[j][3] = 3 * Math.pow(x[0], 2);
//                }
//                if (j == x.length + 1){
//                    S3x[j][1] = 1;
//                    S3x[j][2] = 2 * x[x.length-1];
//                    S3x[j][3] = 3 * Math.pow(x[x.length-1], 2);
//                    if (c > 3 && c < 4 + j){
//                        S3x[j][c] = 3 * Math.pow((x[x.length-1] - x[c-3]), 2);
//                    }
//                }
//            }
//        }
//        double[] Wyniki = new double[(int)rozmiar_tab];
//        for (int i = 0; i < (int)rozmiar_tab-2; i++){
//            Wyniki[i] = fx[i];
//        }
//        Wyniki[(int)rozmiar_tab - 2] = wart_pierwszej_poch;
//        Wyniki[(int)rozmiar_tab - 1] = wart_ostatniej_poch;
//        double[] Liczby = new double[Wyniki.length];
//        double[][] Rozwiazanie = new double[S3x.length][S3x.length];
//        for (int i = 0; i < S3x.length; i++) {
//            Rozwiazanie[0][i] = S3x[0][i];
//        }
//        Liczby[0] = Wyniki[0];
//        for (int i = 0; i < S3x.length; i++) {
//            for (int k = i + 1; k < S3x.length; k++) {
//                Liczby[k] = Wyniki[k] - (Wyniki[i] * (S3x[k][i] / S3x[i][i]));
//                for (int j = i + 1; j < S3x.length; j++) {
//                    Rozwiazanie[j][k] = S3x[j][k] - (S3x[j][i] / S3x[i][i]) * S3x[i][k];
//                }
//            }
//            for (int iii = 0; iii < Rozwiazanie.length; iii++) {
//                for (int jjj = 0; jjj < Rozwiazanie[iii].length; jjj++) {
//                    S3x[iii][jjj] = Rozwiazanie[iii][jjj];
//                }
//                Wyniki[iii] = Liczby[iii];
//            }
//        }
//        Liczby[Wyniki.length-1] = Liczby[Liczby.length-1] / S3x[S3x.length-1][S3x.length-1] ;
//        for ( int i = Wyniki.length-2; i > -1; i--){
//            for ( int j = i + 1; j < Wyniki.length; j++){
//                Liczby[i] = Liczby[i] - S3x[i][j] * Liczby[j];
//            }
//            Liczby[i] = Liczby[i] / S3x[i][i];
//        }
//        double WynikKoncowy = Liczby[0] + Liczby[1]*X + Liczby[2]*X*X + Liczby[3]*X*X*X;
//        for (int i = 1; i < x.length; i++){
//            if (X > x[i]){
//                WynikKoncowy = WynikKoncowy + Liczby[i+3] * Math.pow((X - x[i]), 3);
//            }
//        }
//        System.out.println("Wynik: " + WynikKoncowy);
//    }
//}