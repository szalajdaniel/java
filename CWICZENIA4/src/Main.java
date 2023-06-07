public class Main {
    public static double a=1;
    public static double b=8;
    public static double epsilon=0.01;
    public static double xsr;
    public static double fx=0;
    public static double fx(double xsr){
        double fxx;
        fxx=6*(Math.pow(xsr,2)+xsr-6);
        return fxx;

    }

    public static boolean warunekkonieczny(){

        double fa=6*(Math.pow(a,2)+a-6);
        double fb=6*(Math.pow(b,2)+b-6);
        if(fa*fb<0){
            System.out.println("Metoda bisekcji:");
            System.out.println("WARUNEK SPEŁNIONY");
            return true;

        }else {
            System.out.println("Metoda bisekcji:");
            System.out.println("WARUNEK NIESPEŁNIONY");
            return false;
        }}
    public static double obliczamxsr(boolean warunekkonieczny){
        if(warunekkonieczny==true){
            int pomocnicza=0;

                for(int i=0;i<=pomocnicza;i++) {
                xsr = (a+b) / 2;
                fx = fx(xsr);
                    System.out.println(xsr);
                    System.out.println(fx*fx(a));
                if(fx*fx(a)<0){
                    b=xsr;
                }
                else {a=xsr;}

                pomocnicza++;
                if(Math.abs(fx(xsr))<epsilon){
                    pomocnicza=i;
                }

            }
                pomocnicza+=1;

            System.out.println("Rozwiązaniem dla epsilon = "+epsilon+" jest xsr = "+xsr+" dla i = "+pomocnicza);
            System.out.println("F("+xsr+") = "+fx(xsr));
        }




        return 0;
    }
    public static void main(String[] args) {
        boolean warunekkonieczny = warunekkonieczny();
        double obliczamxsr = obliczamxsr(warunekkonieczny);



    }
}