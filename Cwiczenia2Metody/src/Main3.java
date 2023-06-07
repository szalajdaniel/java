public class Main3 {



        public static double liczbyn (int n, double a, double b){

            double wzor2 = (b - a) / 2;
            double wzor3 = (b + a) / 2;
            double wynik=0;

            double[][] tablican = new double[2][n];
            if (n == 2) {
                tablican[0][0] = 1.0000000000000000;
                tablican[0][1] = 1.0000000000000000;

                tablican[1][0] = (-0.5773502691896257);
                tablican[1][1] = 0.5773502691896257;
            } else if (n == 4) {

                tablican[0][0] = 0.6521451548625461;
                tablican[0][1] = 0.6521451548625461;
                tablican[0][2] = 0.3478548451374538;
                tablican[0][3] = 0.3478548451374538;

                tablican[1][0] = (-0.3399810435848563);
                tablican[1][1] = 0.3399810435848563;
                tablican[1][2] = (-0.8611363115940526);
                tablican[1][3] = 0.8611363115940526;
            } else if (n == 6) {
                tablican[0][0] = 0.3607615730481386;
                tablican[0][1] = 0.3607615730481386;
                tablican[0][2] = 0.4679139345726910;
                tablican[0][3] = 0.4679139345726910;
                tablican[0][4] = 0.1713244923791704;
                tablican[0][5] = 0.1713244923791704;


                tablican[1][0] = (0.6612093864662645);
                tablican[1][1] = -0.6612093864662645;
                tablican[1][2] = (-0.2386191860831969);
                tablican[1][3] = 0.2386191860831969;
                tablican[1][4] = (-0.9324695142031521);
                tablican[1][5] = 0.9324695142031521;

            } else if (n == 8) {
                tablican[0][0] = 0.3626837833783620;
                tablican[0][1] = 0.3626837833783620;
                tablican[0][2] = 0.3137066458778873;
                tablican[0][3] = 0.3137066458778873;
                tablican[0][4] = 0.2223810344533745;
                tablican[0][5] = 0.2223810344533745;
                tablican[0][6] = 0.1012285362903763;
                tablican[0][7] = 0.1012285362903763;

                tablican[1][0] = (-0.1834346424956498);
                tablican[1][1] = 0.1834346424956498;
                tablican[1][2] = (-0.5255324099163290);
                tablican[1][3] = 0.5255324099163290;
                tablican[1][4] = (-0.7966664774136267);
                tablican[1][5] = 0.7966664774136267;
                tablican[1][6] = (-0.9602898564975363);
                tablican[1][7] = 0.9602898564975363;

            } else if (n == 10) {
                tablican[0][0] = 0.2955242247147529;
                tablican[0][1] = 0.2955242247147529;
                tablican[0][2] = 0.2692667193099963;
                tablican[0][3] = 0.2692667193099963;
                tablican[0][4] = 0.2190863625159820;
                tablican[0][5] = 0.2190863625159820;
                tablican[0][6] = 0.1494513491505806;
                tablican[0][7] = 0.1494513491505806;
                tablican[0][8] = 0.0666713443086881;
                tablican[0][9] = 0.0666713443086881;

                tablican[1][0] = (-0.1488743389816312);
                tablican[1][1] = 0.1488743389816312;
                tablican[1][2] = (-0.4333953941292472);
                tablican[1][3] = 0.4333953941292472;
                tablican[1][4] = (-0.6794095682990244);
                tablican[1][5] = 0.6794095682990244;
                tablican[1][6] = (-0.8650633666889845);
                tablican[1][7] = 0.8650633666889845;
                tablican[1][8] = (-0.9739065285171717);
                tablican[1][9] = 0.9739065285171717;
            } else if (n == 16) {
                tablican[0][0] = 0.1894506104550685;
                tablican[0][1] = 0.1894506104550685;
                tablican[0][2] = 0.1826034150449236;
                tablican[0][3] = 0.1826034150449236;
                tablican[0][4] = 0.1691565193950025;
                tablican[0][5] = 0.1691565193950025;
                tablican[0][6] = 0.1495959888165767;
                tablican[0][7] = 0.1495959888165767;
                tablican[0][8] = 0.1246289712555339;
                tablican[0][9] = 0.1246289712555339;
                tablican[0][10] = 0.0951585116824928;
                tablican[0][11] = 0.1494513491505806;
                tablican[0][12] = 0.0622535239386479;
                tablican[0][13] = 0.0622535239386479;
                tablican[0][14] = 0.0271524594117541;
                tablican[0][15] = 0.0271524594117541;

                tablican[1][0] = (-0.0950125098376374);
                tablican[1][1] = 0.0950125098376374;
                tablican[1][2] = (-0.2816035507792589);
                tablican[1][3] = 0.2816035507792589;
                tablican[1][4] = (-0.4580167776572274);
                tablican[1][5] = 0.4580167776572274;
                tablican[1][6] = (-0.6178762444026438);
                tablican[1][7] = 0.6178762444026438;
                tablican[1][8] = (-0.7554044083550030);
                tablican[1][9] = 0.7554044083550030;
                tablican[1][10] = -0.8656312023878318;
                tablican[1][11] = 0.8656312023878318;
                tablican[1][12] = -0.9445750230732326;
                tablican[1][13] = 0.9445750230732326;
                tablican[1][14] = -0.9894009349916499;
                tablican[1][15] = 0.9894009349916499;
            } else {

                System.out.println("Podaj inna wartosc n");
                return 0;

            }
            for (int j = 0; j < tablican[0].length; j++) {
              //  System.out.println("Numer: " + (j + 1) + ".");
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                    //    System.out.println("wi:");
                    } else if (i == 1) {

                      //  System.out.println("xi:");
                    }
                    //System.out.println(tablican[i][j]);
                }

            }



                for(int l=0 ; l<n; l++){
                    double x=(wzor2*(tablican[1][l])+wzor3);

                    double wzor =(1.4*x+0.3)/(2.3+Math.cos(0.4*Math.pow(x,2)+1));
                    wynik+=tablican[0][l]*wzor;




                }
                wynik=wzor2*wynik;

            System.out.println("n: "+n);
            return wynik;
    }




        public static void main(String[] args){
            int n = 16;
            double nki = liczbyn(n, -0.4, 1);
            System.out.println(nki);
        }
    }
