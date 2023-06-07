public class Main4{
    static double fx(double x){
        double funkcja_fx = (Math.pow(x,2) + 4.1 * x - 6.36 );
        return funkcja_fx;
    }
    static double p1(double x){
        double funkcja_fx_p1 = (2*x + 4.1 );
        return funkcja_fx_p1;
    }
    static double p2(double x){
        double funkcja_fx_p2 = (2);
        return funkcja_fx_p2;
    }
    static double a = -10;
    static double b = -1;
    static double E = 0.05;
    public static void main(String[] args) {
        double[] X = new double[10000];
        if ( fx(a) * fx(b) < 0){
            if ( fx(a) * p2(a) > 0){
                X[0] = b;
                for (int n = 0; n >= 0; n++){
                    X[n+1] = X[n] - (fx(X[n]) / (fx(X[n]) - fx(a)) * ((X[n]) - a));
                    if (Math.abs(fx(X[n+1])) < E){
                        System.out.println("X: " + X[n+1]);
                        System.out.println("Ilość iteracji to: " + n);
                        System.out.println("Wartość funkcji wejściowej: " + fx(X[n+1]));
                        break;
                    }
                    if ((Math.abs(X[n+1] - X[n])) < E){
                        System.out.println("X: " + X[n+1]);
                        System.out.println("Ilość iteracji to: " + n);
                        System.out.println("Wartość absolutna Xn+1 − Xn: " + (Math.abs(X[n+1] - X[n])));
                        break;
                    }
                }
            } else if ( fx(b) * p2(b) > 0){
                X[0] = a;
                for (int n = 1; n >= 0; n++){
                    X[n] = X[n-1] - (fx(X[n-1]) / (fx(b) - fx(X[n-1])) * (b - X[n-1]) );
                    if (Math.abs(fx(X[n])) < E){
                        System.out.println("X: " + X[n]);
                        System.out.println("Ilość iteracji to: " + n);
                        System.out.println("Wartość funkcji wejściowej: " + fx(X[n]));
                        break;
                    }
                    if (Math.abs(X[n] - X[n-1]) < E){
                        System.out.println("X: " + X[n]);
                        System.out.println("Ilość iteracji to: " + n);
                        System.out.println("Wartość funkcji wejściowej: " + fx(X[n]));
                        break;
                    }
                }
            }
        } else {
            System.out.println("Warunek konieczny nie jest spełniony");
        }
    }
}