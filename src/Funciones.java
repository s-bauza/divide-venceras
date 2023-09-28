public class Funciones {
    //    Actividad 5.1. Implementa un algoritmo que compruebe si hay un
//    elemento en un array ordenado.
    public static boolean buscarElemnto(int[] vector, int e) {
        boolean encontrado = false, mayor = false;
        int i = 0;
        while (!encontrado && !mayor && i < vector.length) {
            if (vector[i] == e)
                encontrado = true;
            else if (vector[i] > e)
                mayor = true;
            i++;
        }
        return encontrado;
    }

    //Algoritmo basado en Divide y Vencerás: Implementación 5.3
    public static boolean contieneAux(int[] vector, int i, int n, int elemento) { //5.3
        if (i == n) {
            return (elemento == vector[i]);
        } else {
            int k = (i + n) / 2;
            if (elemento < vector[k])
                return contieneAux(vector, 0, k, elemento);
            else if (elemento == vector[k])
                return true;
            else
                return contieneAux(vector, k + 1, n, elemento);
        }
    }

    public static boolean contiene(int[] vector, int elemento) { //5.3
        return contieneAux(vector, 0, vector.length - 1, elemento);
    }

//    Actividad 5.4. Diseña e implementa un algoritmo que calcule el
//    máximo subarray de un array.

    public static int maxSubarray(int[] vector) {
        int max = Integer.MIN_VALUE, iMax = 0, nMax = 0;
        for (int i = 0; i < vector.length; i++) {
            int suma = 0;
            for (int n = i; n < vector.length; n++) {
                suma += vector[n];
                if (suma > max) {
                    max = suma;
                    iMax = i;
                    nMax = n;
                }
            }
        }
        return max;
    }

//    Actividad 5.6. Diseña e implementa un algoritmo que calcule el
//    máximo subarray que incluye el pivote.


    public static int maxSubarrayCruzada(int[] vector, int i0, int k, int in) {
        int max = Integer.MIN_VALUE, suma = 0;
        for (int i = k; i >= i0; i--) {
            suma += vector[i];
            if (suma > max) {
                max = suma;
            }
        }
        for (int j = k + 1; j <= in; j++) {
            suma += vector[j];
            if (suma > max) {
                max = suma;
            }
        }
        return max;
    }


//    Actividad 5.8. Implementa el algoritmo basado en Divide y
//    Vencerás.

    public static int maxSubarray2(int[] vector) {
        return maxSubarray2Aux(vector, 0, vector.length - 1);
    }

    public static int maxSubarray2Aux(int[] vector, int i, int n) {
        if (i == n)
            return vector[0];
        else {
            int k = (i + n) / 2;
            int m1 = maxSubarray2Aux(vector, i, k);
            int m2 = maxSubarray2Aux(vector, k + 1, n);
            int m3 = maxSubarrayCruzada(vector, i, k, n);
            return Math.max(m1, Math.max(m2, m3));
        }
    }

//    Actividad 5.10. Diseña e implementa un algoritmo que calcule el
//    máximo de un vector

    public static int max(int[] vector) {
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > m) m = vector[i];
        }
        return m;
    }
//    Actividad 5.12. Implementa el algoritmo basado en Divide y
//    Vencerás

    public static int max2(int[] vector) {
        return max2Aux(vector, 0, vector.length - 1);
    }

    public static int max2Aux(int[] vector, int i, int n) {
        if (i == n)
            return vector[i];
        else {
            int k = (i + n) / 2;
            int m1 = max2Aux(vector, i, k);
            int m2 = max2Aux(vector, k + 1, n);
            return Math.max(m1, m2);
        }
    }

    //    Actividad 5.15. Diseña e implementa un algoritmo que transponga
    //    una matriz
   public static void transponer(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++)
            for (int c = 0; c < f; c++) {
                int aux = matriz[f][c];
                matriz[f][c] = matriz[c][f];
                matriz[c][f] = aux;
            }
    }

//    Actividad 5.17. Diseña e implementa el algoritmo basado en divide y
//    vencerás para matrices cuadradas de dimensión 2k.

    public static void trasponer2(int[][] matriz){
        transponer2Aux(matriz,0,matriz.length-1,0,matriz[0].length-1);
    }
    public static void transponer2Aux(int[][] matriz, int f0, int fn, int c0, int cn){
        if (f0>=fn||c0>=cn)
            return;
        else {
            int fk=(f0+fn)/2; int ck=(c0+cn)/2;
            transponer2Aux(matriz,f0,fk,c0,ck);
            transponer2Aux(matriz,f0,fk,ck+1,cn);
            transponer2Aux(matriz,fk+1,fn,c0,cn);
            transponer2Aux(matriz,fk+1,fn,ck+1,cn);
            for (int f=0; f<fk-f0+1; f++)
                for (int c=0; c<ck-c0+1; c++){
                    int a=matriz[f+fk+1][c+c0];
                    matriz[f+fk+1][c+c0]=matriz[f+f0][c+ck+1];
                    matriz[f+f0][c+ck+1] = a;
                }
        }
    }
}
