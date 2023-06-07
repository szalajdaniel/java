public class Main2{
    public static double a=1;
    public static double b=8;
    public static double epsilon=0.000001;
    public static double fx(double x){
        double fxx;
        fxx=6*(Math.pow(x,2)+x-6);
        return fxx;

    }
    public static double pochodnafx(double x){
        double fxxx;
        fxxx=12*x+6;
        return fxxx;

    }
    public static double pochodna2fx(){
        double fxx;
        fxx=12;
        return fxx;

    }

    public static boolean warunekkonieczny(){

        double fa=fx(a);
        double fb=fx(b);
        if(fa*fb<0){System.out.println("Metoda stycznych:");
            System.out.println("WARUNEK KONIECZNY SPEŁNIONY");
            return true;
        }else {System.out.println("Metoda stycznych:");
            System.out.println("WARUNEK KONIECZNY NIESPEŁNIONY");
            return false;
        }}
    public static boolean warunekzbieznosci(){
        double fa=pochodnafx(a);
        double fb=pochodnafx(b);
        double faa=pochodna2fx();
        double fbb=pochodna2fx();
        if(fa*fb<=0 || faa*fbb>=0){
            System.out.println("WARUNEK ZBIEŻNOSCI SPEŁNIONY");
            return true;
        }else {
            System.out.println("WARUNEK ZBIEŻNOSCI NIESPEŁNIONY");
            return false;
        }}


    public static double obliczamxsr(boolean warunekkonieczny, boolean warunekzbieznosci){
        double x=0;

        if((fx(b)>0 && pochodna2fx()>0) || (fx(b)<0 && pochodna2fx()<0)){
            x=b;
    } else if ((fx(a)>0 && pochodna2fx()>0) || (fx(a)<0 && pochodna2fx()<0)) {
            x=a;
        }

        double fx;
        double[] tablicax = new double[3];
        double pomocnicza2;
        double pochodna;
        if(warunekkonieczny==true){
            int pomocnicza=0;
            if(warunekzbieznosci==true){

                for(int i=0;i<=pomocnicza;i++) {
                    pomocnicza2=x;
                    x=x-(fx(x)/pochodnafx(x));
                    fx=fx(x);
                    pochodna=pochodnafx(x);
                    pomocnicza++;
                   // System.out.println(x);
                    if(Math.abs(fx)<epsilon || Math.abs(x-pomocnicza2)<epsilon){
                        pomocnicza=i;
                    }

                }pomocnicza+=1;

            }System.out.println("Rozwiązaniem dla epsilon = "+epsilon+" jest x = "+x+" dla i = "+pomocnicza);
            System.out.println("F("+x+") = "+fx(x));
        }




        return 0;
    }
    public static void main(String[] args) {
        boolean warunekkonieczny = warunekkonieczny();
        boolean warunekzbieznosci = warunekzbieznosci();
        double obliczamxsr = obliczamxsr(warunekkonieczny,warunekzbieznosci);


    }

}
