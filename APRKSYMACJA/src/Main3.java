public class Main3 {

    public static double wynikoncowy;
    public static double h1;
    public static double h;
    public static int n;
    public static int px = 1;
    public static double xx = (-0.25);

    public static double[] fi =new double[n+1];
    static double fx(double x){
        double funkcja_fx = Math.sqrt(Math.pow(x,2)+2*x+7);;
        return funkcja_fx;
    }


    public static double liczymyfi(int n){
        for(int i=0;i<fi.length-1;i++){
            fi[0]=1;
            fi[1]=xx;
            fi[2]=(1.0/2)*(3*Math.pow(xx,2)-1);
            if(i>=2){
                fi[i + 1] = (1.0/(i + 1.0)) * (2.0 * i + 1.0) * xx * fi[i] - ((i) / (i + 1.0))*fi[i-1];
            }
        }
        return 0;
    }
    public static double liczymygx(){
        double gx = 0;
        for(int i=0;i<fi.length;i++){
            gx += fi[i];
            //System.out.println(gx);

        }
        return gx;
    }
        public static double h1(double a, double b,double n){
            h1= (b-a)/n;
            return h1;
        }

    public static double obliczamxX(int n, double a, double b, double[] x, double[] pomocx, int k){


        for (int i=0;i<=n;i++){

            x[i]=a+(h1*(i));

        }
        for (int i=0;i<n;i++){

            pomocx[i]=(x[i]+x[i+1])/2;

            if(k==0) {
                pomocx[i] = Math.pow((Math.pow(pomocx[i], k)), 2) * px;
            }else if(k==1) {
                pomocx[i] = Math.pow((Math.pow(pomocx[i], k)), 2) * px;}
            else if(k==2) {
                pomocx[i] = Math.pow((1.0/2)*(3*Math.pow(pomocx[i],k)-1), 2) * px;}
            else if(k==3) {
                x[i] = Math.pow((1.0/8)*(5*Math.pow(pomocx[i],k)-3.0*x[i]), 2) * px;}
            else if(k==4) {
                x[i] = Math.pow((1.0/8)*(35*Math.pow(pomocx[i],k)-30*Math.pow(pomocx[i],k-1)+3), 2) * px;}
        }
        h=(x[n]-x[n-1])/2;

        for (int i=0;i<=n;i++){
            x[i]=a+(h1*(i));

            if(k==0) {
                x[i] = Math.pow((Math.pow(x[i], k)), 2) * px;
            }else if(k==1) {
                x[i] = Math.pow((Math.pow(x[i], k)), 2) * px;}
            else if(k==2) {
                x[i] = Math.pow((1.0/2)*(3*Math.pow(x[i],k)-1), 2) * px;}
            else if(k==3) {
                x[i] = Math.pow((1.0/8)*(5*Math.pow(x[i],k)-3.0*x[i]), 2) * px;}
            else if(k==4) {
                x[i] = Math.pow((1.0/8)*(35*Math.pow(x[i],k)-30*Math.pow(x[i],k-1)+3), 2) * px;}
            else if(k==5) {
                x[i] = Math.pow((1.0/8)*(63*Math.pow(x[i],k)-70*Math.pow(x[i],k-2)+15*Math.pow(x[i],k-4)), 2) * px;}
            else if(k==6) {
                x[i] = Math.pow((1.0/16)*(231*Math.pow(x[i],k)-315*Math.pow(x[i],k-2)+105*Math.pow(x[i],k-4)-5), 2) * px;}
            else if(k==7) {
                x[i] = Math.pow((1.0/16)*(429*Math.pow(x[i],k)-693*Math.pow(x[i],k-2)+315*Math.pow(x[i],k-4)-35*Math.pow(x[i],k-6)), 2) * px;}
            else if(k==8) {
                x[i] = Math.pow((1.0/128)*(6435*Math.pow(x[i],k)-12012*Math.pow(x[i],k-2)+6930*Math.pow(x[i],k-4)-1260*Math.pow(x[i],k-6)+35), 2) * px;}
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
    public static double obliczam_C(int n, double a, double b, double[] x, double[] pomocx, int k){
        double ex = (2.718-0.367);

        for (int i=0;i<=n;i++){

            x[i]=a+(h1*(i));

        }
        for (int i=0;i<n;i++){

            pomocx[i]=(x[i]+x[i+1])/2;

            if(k==0) {
                pomocx[i] = px * 1 * fx(pomocx[i]);
            }else if(k==1) {
                pomocx[i] = px * pomocx[i] * fx(pomocx[i]);}
            else if(k==2) {
                pomocx[i] = px * ((1.0/2.0) * ((3 * Math.pow(pomocx[i],2)) - 1)) * fx(pomocx[i]);}
            else if(k==3) {
                pomocx[i] = px * ((1.0/2.0) * (5 * Math.pow(pomocx[i],3) - 3*pomocx[i])) * fx(pomocx[i]);}
            else if(k==4) {
                pomocx[i] = px * ((1.0/8.0) * (35 * Math.pow(pomocx[i],4) - 30 * Math.pow(pomocx[i],2) + 3)) * fx(pomocx[i]);}
            else if(k==5) {
                pomocx[i] = px * ((1.0/8.0) * (63 * Math.pow(pomocx[i],5) - 70 * Math.pow(pomocx[i],3) + 15 * pomocx[i])) * fx(pomocx[i]);}
            else if(k==6) {
                pomocx[i] = px * ((1.0/16.0) * (231 * Math.pow(pomocx[i],6) - 315 * Math.pow(pomocx[i],4) + 105 * Math.pow(pomocx[i],2) - 5)) * fx(pomocx[i]);}
            else if(k==7) {
                pomocx[i] = px * ((1.0/16.0) * (429 * Math.pow(pomocx[i],7) - 693 * Math.pow(pomocx[i],5) + 315 * Math.pow(pomocx[i],3) - 35 * pomocx[i])) * fx(pomocx[i]);}
            else if(k==8) {
                pomocx[i] = px * ((1.0/128.0) * (6435 * Math.pow(pomocx[i],8) - 12012 * Math.pow(pomocx[i],6) + 6930 * Math.pow(pomocx[i],4) - 1260 * Math.pow(pomocx[i],2) + 35)) * fx(pomocx[i]);}
        }
        h=(x[n]-x[n-1])/2;

        for (int i=0;i<=n;i++){
            x[i]=a+(h1*(i));

            if(k==0) {
                x[i] = px * 1 * fx(x[i]);
            }else if(k==1) {
                x[i] = px * x[i] * fx(x[i]);}
            else if(k==2) {
                x[i] = px * ((1.0/2.0) * ((3 * Math.pow(x[i],2)) - 1)) * fx(x[i]);}
            else if(k==3) {
                x[i] = px * ((1.0/2.0) * (5 * Math.pow(x[i],3) - 3*x[i])) * fx(x[i]);}
            else if(k==4) {
                x[i] = px * ((1.0/8.0) * (35 * Math.pow(x[i],4) - 30 * Math.pow(x[i],2) + 3)) * fx(x[i]);}
            else if(k==5) {
                x[i] = px * ((1.0/8.0) * (63 * Math.pow(x[i],5) - 70 * Math.pow(x[i],3) + 15 * x[i])) * fx(x[i]);}
            else if(k==6) {
                x[i] = px * ((1.0/16.0) * (231 * Math.pow(x[i],6) - 315 * Math.pow(x[i],4) + 105 * Math.pow(x[i],2) - 5)) * fx(x[i]);}
            else if(k==7) {
                x[i] = px * ((1.0/16.0) * (429 * Math.pow(x[i],7) - 693 * Math.pow(x[i],5) + 315 * Math.pow(x[i],3) - 35 * x[i])) * fx(x[i]);}
            else if(k==8) {
                x[i] = px * ((1.0/128.0) * (6435 * Math.pow(x[i],8) - 12012 * Math.pow(x[i],6) + 6930 * Math.pow(x[i],4) - 1260 * Math.pow(x[i],2) + 35)) * fx(x[i]);}
        }

        return 0;
    }
    public static double funkcja_C(int n, double a, double b, double[] x, double[]pomocx){


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

    public static double liczymyYI (int n, double a, double b, double[] x, double[]pomocx, double[]YI){
        for (int k=0;k<=n; k++){

                double obliczamxx = obliczamxX(n, -1, 1, x,pomocx,k);
                double wynikkk = funkcja1(n, -1, 1, x,pomocx);
                YI[k] = wynikkk;
                System.out.println("Y"+k+":"+YI[k]);








            // System.out.println("Macierz A"+k+": "+macierz_a[k]);
        }
        return 0;
    }

    public static double liczymyC (int n, double a, double b, double[] x, double[]pomocx, double[]C,double[]YI){
        System.out.println("\n");

        for (int k=0;k<=n; k++){
            double obliczamxxk = obliczam_C(n, -1, 1, x,pomocx,k);
            double wynikkkk = funkcja_C(n, -1, 1, x,pomocx);
            C[k] =1/YI[k]*(wynikkkk);


            System.out.println("C"+k+":"+C[k]);









            // System.out.println("Macierz A"+k+": "+macierz_a[k]);
        }
        return 0;
    }








    public static void main(String[] args){

        double[] TABLICAWZOROW = new double[9];
        TABLICAWZOROW[0] = 1;
        TABLICAWZOROW[1] = xx;
        TABLICAWZOROW[2] = ((1.0/2.0) * ((3 * Math.pow(xx,2)) - 1));
        TABLICAWZOROW[3] = ((1.0/2.0) * (5 * Math.pow(xx,3) - 3*xx));
        TABLICAWZOROW[4] = ((1.0/8.0) * (35 * Math.pow(xx,4) - 30 * Math.pow(xx,2) + 3));
        TABLICAWZOROW[5] = ((1.0/8.0) * (63 * Math.pow(xx,5) - 70 * Math.pow(xx,3) + 15 * xx));
        TABLICAWZOROW[6] = ((1.0/16.0) * (231 * Math.pow(xx,6) - 315 * Math.pow(xx,4) + 105 * Math.pow(xx,2)
                - 5));
        TABLICAWZOROW[7] = ((1.0/16.0) * (429 * Math.pow(xx,7) - 693 * Math.pow(xx,5) + 315 * Math.pow(xx,3)
                - 35 * xx));
        TABLICAWZOROW[8] = ((1.0/128.0) * (6435 * Math.pow(xx,8) - 12012 * Math.pow(xx,6) + 6930 *
                Math.pow(xx,4) - 1260 * Math.pow(xx,2) + 35));
        int n = 5;
        double koncowywynik=0;
        double xx = (-0.25);
        double[] YI =new double[n+1];
        double[] C =new double[n+1];
        double[] pomocx = new double[n];
        double[] x = new double[n + 3];
        double wynikh = h1(-1, 1, n);
        //System.out.println(wynikh);


        double liczmyYI = liczymyYI(n,-1, 1,x,pomocx,YI);
        double liczmyC = liczymyC(n,-1, 1,x,pomocx,C,YI);
        double wynikfi = liczymyfi(n);
        double wynikgx = liczymygx();
        for (int i = 0; i < n+1; i++){
            koncowywynik += + C[i] * TABLICAWZOROW[i];
        }

        System.out.println("F("+xx+")="+koncowywynik);



    }
}