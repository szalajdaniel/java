public class Main2 {
    public static int n =1;
    public static double x = -0.25;
    public static int m = 2;

    public static double[][] macierzpierwsza = new double[n][n+1];
    public static double[][] macierzdruga = new double[n][n-1];
    public static double[] tablicapomocnicza = new double[n+n];
    public static double[][] macierzwynikowa = new double[m+1][m+2];
    public static double[] tablicax = new double[]{-1, -0.5,0,0.5};

    public static double[] tablicay = new double[tablicax.length];



    public static double wyznacztablicey(double[] tablicax){

        for(int i=0;i<tablicax.length;i++){
            tablicay[i] = Math.sqrt(Math.pow(tablicax[i],2)+3*tablicax[i]+7);
            //tablicay[i] = Math.sqrt((8*tablicax[i])*(8*tablicax[i])+3);
          //  System.out.println(tablicay[i]);

        }
        return 0;
    }
    public static double wyznaczpunkty(int n, int m){

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                 macierzpierwsza[i][j]=Math.pow(tablicax[j],i);
                tablicapomocnicza[i]+=macierzpierwsza[i][j];


                // System.out.println(macierzpierwsza[i][j]);
                for(int k=0;k<=m;k++) {

                   macierzdruga[k][j] = Math.pow(tablicax[j], i) * tablicay[j];



                }if(i<3){
                    for(int k=0;k<=m;k++) {

                        macierzdruga[k][j] = Math.pow(tablicax[j], i) * tablicay[j];
                    }
                    //System.out.println(macierzdruga[i][j]);
                    tablicapomocnicza[i+n]+=macierzdruga[i][j];

                }
            }
           // System.out.println(tablicapomocnicza[7]);
        }
//        for(int i=0;i<8;i++){
//            System.out.println(tablicapomocnicza[i]);     //sprawdzanie sum z tablic
//        }
        return 0;
    }

    public static double wyznaczmacierz(){
        for(int i=0;i<m+1;i++){
            for(int j=0;j<m+1;j++){
                if(j<=m+1){
                    macierzwynikowa[0][j]=tablicapomocnicza[j];

                }
                if(j==m){
                    macierzwynikowa[i][j]=tablicapomocnicza[m+i];


                }
                if(i==j && i!=2){

                    macierzwynikowa[i][j]=tablicapomocnicza[m];

                }
            }
        }
        for(int i=0;i<m+1;i++){
            for(int j=0;j<m+1;j++){
                if(macierzwynikowa[i][j]!=0){
                    macierzwynikowa[j][i] = macierzwynikowa[i][j];
                }if(macierzwynikowa[j][i]!=0){
                    macierzwynikowa[i][j] = macierzwynikowa[j][i];
                }
                //System.out.println(macierzwynikowa[i][j]);

            }}
        for(int i=0;i<=m;i++){
            macierzwynikowa[i][m+1] = tablicapomocnicza[n+i];
            //System.out.println(macierzwynikowa[i][m+1]);

        }



        return 0;

    }
    public static double GAUSSS(double[] wyniki){
        int rozmiar = m+1;


        // Eliminacja Gaussa
        for (int k = 0; k < rozmiar - 1; k++) {
            for (int i = k + 1; i < rozmiar; i++) {
                double wspolczynnik = macierzwynikowa[i][k] / macierzwynikowa[k][k];
                for (int j = k; j <= rozmiar; j++) {
                    macierzwynikowa[i][j] -= wspolczynnik * macierzwynikowa[k][j];
                }
            }
        }


        for (int i = rozmiar - 1; i >= 0; i--) {
            wyniki[i] = macierzwynikowa[i][rozmiar];
            for (int j = i + 1; j < rozmiar; j++) {
                wyniki[i] -= macierzwynikowa[i][j] * wyniki[j];
            }
            wyniki[i] /= macierzwynikowa[i][i];
        }

        System.out.println("Wyniki: a");
        for (int i =0;i<rozmiar;i++) {
            System.out.println("a"+(i)+" = "+wyniki[i]);
        }
        return 0;
    }
    public static double WYNIK_INTERPOLACJI(double[] wyniki){

        double gauss= GAUSSS(wyniki);
        double interpolacja=0;
        for(int i=0;i<m+1;i++){
            if(i>0){
                interpolacja+=wyniki[i]*Math.pow(x,i);
                //   System.out.println(interpolacja);
            }
            else interpolacja+=wyniki[i];
        }
        return interpolacja;
    }

    public static void main(String[] args) {
      double wyniktablicy = wyznacztablicey(tablicax);
        double[] wyniki = new double[n];
        double macierz = wyznaczpunkty(n,m);
        double macierzwynikowa = wyznaczmacierz();
        double APROKSYMACJA = WYNIK_INTERPOLACJI(wyniki);
        System.out.println("\nWynik APROKSYMACJA:\n"+"F("+x+"):"+APROKSYMACJA);
    }
}