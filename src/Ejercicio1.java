public class Ejercicio1 {

    private static int[] vector = {-1, 0, 2, 3, 10, 12, -23, -14, -7};

    private static int sumaPositivos(int[] vector) {
        return sumaPositivosAux(vector, 0, vector.length - 1);
    }

    private static int sumaPositivosAux(int[] vector, int i0, int in) {

        if (i0 == in) {
            if (vector[i0] > 0) return vector[i0];
            else return 0;
        } else {
            int k = (i0 + in) / 2;
            int x = sumaPositivosAux(vector, i0, k);        //                              O(1) N=1
            int y = sumaPositivosAux(vector, k + 1, in); // la complejidad del algoritmo es 2T(N/2) + O(1) N>1
                                                            // O(N)
            return x + y;
        }
    }

    public static void mostrarEjercicio1() {
        System.out.println(vector.length);
        System.out.println(sumaPositivos(vector));
    }

}
