package truco;

import java.util.Arrays;

public class Envido {
    public int cero;
    public int uno;
    public int dos;
    public int tres;
    public int cuatro;
    public int cinco;
    public int seis;
    public int siete;
    public int veinte;
    public int veinti1;
    public int veinti2;
    public int veinti3;
    public int veinti4;
    public int veinti5;
    public int veinti6;
    public int veinti7;
    public int veinti8;
    public int veinti9;
    public int treinta;
    public int treintaY1;
    public int treintaY2;
    public int treintaY3;

    public int totalCombinaciones;

    // Para hacer los cálculos voy a hacer suma de casos disjuntos.
    // Todas la operaciones suman 4 en lugar de 1 para evitar repetir código; elegir 3 palos de 4 es lo mismo que descartar 1, y solo hay 4 formas de hacerlo.
    public Envido() {
        cero = 0;
        uno = 0;
        dos = 0;
        tres = 0;
        cuatro = 0;
        cinco = 0;
        seis = 0;
        siete = 0;
        veinte = 0;
        veinti1 = 0;
        veinti2 = 0;
        veinti3 = 0;
        veinti4 = 0;
        veinti5 = 0;
        veinti6 = 0;
        veinti7 = 0;
        veinti8 = 0;
        veinti9 = 0;
        treinta = 0;
        treintaY1 = 0;
        treintaY2 = 0;
        treintaY3 = 0;

        // Total esperado: Formas de elegir 3 cartas de 40
        // (40 3) = 9800
        totalCombinaciones = 0;

        int[] valores = { 7, 6, 5, 4, 3, 2, 1, 0, 0, 0 };

        // Todas las cartas distinto palo
        // Elegir 1 carta de 10, 1 carta de 10, y 1 carta de 20. Hacerlo dos veces, una con excluyendo un palo y la otra incluyéndolo
        // (10 1)*(10 1)*(20 1)*2 = 4000
        for (int p1 = 0; p1 < 10; p1++) {
            for (int p2 = 0; p2 < 10; p2++) {
                for (int p3 = 0; p3 < 10; p3++) {
                    int carta1 = valores[p1];
                    int carta2 = valores[p2];
                    int carta3 = valores[p3];
                    int[] puntos = { carta1, carta2, carta3 };
                    Arrays.sort(puntos);
                    if (puntos[2] == 7) {
                        siete += 4;
                    } else if (puntos[2] == 6) {
                        seis += 4;
                    } else if (puntos[2] == 5) {
                        cinco += 4;
                    } else if (puntos[2] == 4) {
                        cuatro += 4;
                    } else if (puntos[2] == 3) {
                        tres += 4;
                    } else if (puntos[2] == 2) {
                        dos += 4;
                    } else if (puntos[2] == 1) {
                        uno += 4;
                    } else if (puntos[2] == 0) {
                        cero += 4;
                    }
                }
            }
        }

        // Todas las cartas del mismo palo:
        // Elegir 3 cartas de 10. Hacerlo con los 4 palos
        // (10 3)*4 = 480
        for (int p = 0; p < 8; p++) {
            for (int q = p+1; q < 9; q++) {
                for (int r = q+1; r < 10; r++) {
                    int suma = valores[p] + valores[q];
                    if (suma == 13) {
                        treintaY3 += 4;
                    } else if (suma == 12) {
                        treintaY2 += 4;
                    } else if (suma == 11) {
                        treintaY1 += 4;
                    } else if (suma == 10) {
                        treinta += 4;
                    } else if (suma == 9) {
                        veinti9 += 4;
                    } else if (suma == 8) {
                        veinti8 += 4;
                    } else if (suma == 7) {
                        veinti7 += 4;
                    } else if (suma == 6) {
                        veinti6 += 4;
                    } else if (suma == 5) {
                        veinti5 += 4;
                    } else if (suma == 4) {
                        veinti4 += 4;
                    } else if (suma == 3) {
                        veinti3 += 4;
                    } else if (suma == 2) {
                        veinti2 += 4;
                    } else if (suma == 1) {
                        veinti1 += 4;
                    } else if (suma == 0) {
                        veinte += 4;
                    }
                }
            }
        }

        // Dos cartas de un palo y otra de otro. Hacerlo con los 4 palos:
        // (10 2)*(30 1)*4 = 5400
        for (int p = 0; p < 9; p++) {
            for (int q = p+1; q < 10; q++) {
                int suma = valores[p] + valores[q];
                if (suma == 13) {
                    treintaY3 += 120;
                } else if (suma == 12) {
                    treintaY2 += 120;
                } else if (suma == 11) {
                    treintaY1 += 120;
                } else if (suma == 10) {
                    treinta += 120;
                } else if (suma == 9) {
                    veinti9 += 120;
                } else if (suma == 8) {
                    veinti8 += 120;
                } else if (suma == 7) {
                    veinti7 += 120;
                } else if (suma == 6) {
                    veinti6 += 120;
                } else if (suma == 5) {
                    veinti5 += 120;
                } else if (suma == 4) {
                    veinti4 += 120;
                } else if (suma == 3) {
                    veinti3 += 120;
                } else if (suma == 2) {
                    veinti2 += 120;
                } else if (suma == 1) {
                    veinti1 += 120;
                } else if (suma == 0) {
                    veinte += 120;
                }
            }
        }

        totalCombinaciones = cero+uno+dos+tres+cuatro+cinco+seis+siete+veinte+veinti1+veinti2+veinti3+veinti4+veinti5+veinti6+veinti7+veinti8+veinti9+treinta+treintaY1+treintaY2+treintaY3;


    }

    public String ordenPorTanto() {
        String ret = "";
        ret += "0: " + cero + "\n";
        ret += "1: " + uno + "\n";
        ret += "2: " + dos + "\n";
        ret += "3: " + tres + "\n";
        ret += "4: " + cuatro + "\n";
        ret += "5: " + cinco + "\n";
        ret += "6: " + seis + "\n";
        ret += "7: " + siete + "\n";
        ret += "20: " + veinte + "\n";
        ret += "21: " + veinti1 + "\n";
        ret += "22: " + veinti2 + "\n";
        ret += "23: " + veinti3 + "\n";
        ret += "24: " + veinti4 + "\n";
        ret += "25: " + veinti5 + "\n";
        ret += "26: " + veinti6 + "\n";
        ret += "27: " + veinti7 + "\n";
        ret += "28: " + veinti8 + "\n";
        ret += "29: " + veinti9 + "\n";
        ret += "30: " + treinta + "\n";
        ret += "31: " + treintaY1 + "\n";
        ret += "32: " + treintaY2 + "\n";
        ret += "33: " + treintaY3 + "\n";
        ret += "Combinaciones totales: " + totalCombinaciones;
        return ret;
    }

    public String ordenPorFrecuencia() {
        String ret = "";
        ret += "7: " + siete + " (" + (float) siete*100/totalCombinaciones + "%)\n";
        ret += "6: " + seis +" (" + (float) seis*100/totalCombinaciones + "%)\n";
        ret += "27: " + veinti7 + " (" + (float) veinti7*100/totalCombinaciones + "%)\n";
        ret += "5: " + cinco + " (" + (float) cinco*100/totalCombinaciones + "%)\n";
        ret += "26: " + veinti6 + " (" + (float) veinti6*100/totalCombinaciones + "%)\n";
        ret += "25: " + veinti5 +" (" + (float) veinti5*100/totalCombinaciones + "%)\n";
        ret += "4: " + cuatro + " (" + (float) cuatro*100/totalCombinaciones + "%)\n";
        ret += "24: " + veinti4 + " (" + (float) veinti4*100/totalCombinaciones + "%)\n";
        ret += "23: " + veinti3 + " (" + (float) veinti3*100/totalCombinaciones + "%)\n";
        ret += "29: " + veinti9 + " (" + (float) veinti9*100/totalCombinaciones + "%)\n";
        ret += "28: " + veinti8 + " (" + (float) veinti8*100/totalCombinaciones + "%)\n";
        ret += "22: " + veinti2 +" (" + (float) veinti2*100/totalCombinaciones + "%)\n";
        ret += "21: " + veinti1 + " (" + (float) veinti1*100/totalCombinaciones + "%)\n";
        ret += "3: " + tres + " (" + (float) tres*100/totalCombinaciones + "%)\n";
        ret += "20: " + veinte + " (" + (float) veinte*100/totalCombinaciones + "%)\n";
        ret += "31: " + treintaY1 + " (" + (float) treintaY1*100/totalCombinaciones + "%)\n";
        ret += "30: " + treinta + " (" + (float) treinta*100/totalCombinaciones + "%)\n";
        ret += "2: " + dos +" (" + (float) dos*100/totalCombinaciones + "%)\n";
        ret += "33: " + treintaY3 + " (" + (float) treintaY3*100/totalCombinaciones + "%)\n";
        ret += "32: " + treintaY2 + " (" + (float) treintaY2*100/totalCombinaciones + "%)\n";
        ret += "1: " + uno +" (" + (float) uno*100/totalCombinaciones + "%)\n";
        ret += "0: " + cero + " (" + (float) cero*100/totalCombinaciones + "%)\n";
        ret += "Combinaciones totales: " + totalCombinaciones;
        return ret;
    }
}
