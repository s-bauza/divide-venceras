public class Ejercicio3 {

    private static int[] vector = {-10, -2, 0, 3, 7, 9, 19, 28, 30, 42, 55};

    private static int elementoEspecial(int[] vector) {
        return elementoEspecialAux(vector, 0, vector.length - 1);
    }

    private static int elementoEspecialAux(int[] vector, int i0, int in) {

        if (i0 == in) {
            if (vector[i0] == i0)
                return vector[i0];
            else return -1;
        } else {
            int k = (i0 + in) / 2;
            if (vector[k] == k)
                return vector[k];
            else  if (vector[k] > k) {
                return elementoEspecialAux(vector, i0, k);
            }
            else return elementoEspecialAux(vector, k + 1, in);
        }
    }

    public static void mostrarEjercicio3() {
        System.out.println(elementoEspecial(vector));
    }

}
