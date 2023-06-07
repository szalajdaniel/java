public class Main3 extends Main2{
    public class EliminacjaGaussa {
        public static void main(String[] args) {
            int rozmiar = stopienFi;
            // Inicjalizowanie tablicy dwuwymiarowej
            double[][] macierz = new double[rozmiar][rozmiar + 1];
            // Eliminacja Gaussa
            for (int k = 0; k < rozmiar - 1; k++) {
                for (int i = k + 1; i < rozmiar; i++) {
                    double wspolczynnik = macierz[i][k] / macierz[k][k];
                    for (int j = k; j <= rozmiar; j++) {
                        macierz[i][j] -= wspolczynnik * macierz[k][j];
                    }
                }
            }

            System.out.println("Macierz po eliminacji Gaussa:");


            double[] wyniki = new double[rozmiar];
            for (int i = rozmiar - 1; i >= 0; i--) {
                wyniki[i] = macierz[i][rozmiar];
                for (int j = i + 1; j < rozmiar; j++) {
                    wyniki[i] -= macierz[i][j] * wyniki[j];
                }
                wyniki[i] /= macierz[i][i];
            }

            // Wyświetlanie wyników
            System.out.println("Wyniki:");
            for (int i = 0; i < rozmiar; i++) {
                System.out.println("x" + (i + 1) + " = " + wyniki[i]);
            }
        }

}}