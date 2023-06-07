public class Main {
    public static double wynik;
    public static double h;


    public static double h(double a, double b,double n){
        h= (b-a)/n;
        return h;
    }
    public static double obliczamx(int n, double a, double b, double[] x){

        for (int i=0;i<=n;i++){
            x[i]=a+(h*(i));

            x[i]=(1.4*x[i]+0.3)/(2.3+Math.cos(0.4*Math.pow(x[i],2)+1));//wzor całki

        }
        return 0;
    }
    public static double funkcja1(int n, double a, double b, double[] x){
        double wynikfunkcji1=(x[0]/2)+(x[n]/2);

        for(int i=1;i<n;i++){

            wynikfunkcji1=wynikfunkcji1+x[i];


        }
       // System.out.println(wynikfunkcji1);
        System.out.println("h= "+h);
        System.out.println("n= "+n);
        return h*wynikfunkcji1;
    }


    public static void main(String[] args){
        int n=16;
        double[] x = new double[n+1];
        double wynikh = h(-0.4,1,n);
        //System.out.println(wynikh);
        double obliczamxx = obliczamx(n,-0.4,1,x);
        //System.out.println(obliczamxx);
        double wynikkk = funkcja1(n,-0.4,1,x);
        System.out.println(wynikkk);
        double h = h(-0.4,1,n);


    }
}