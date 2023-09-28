public class Ejercicio2 {

    private static int[] vector = {1,1,2,2, 4,5,5,6,6}; // {1, 1, 4, 5, 5, 7, 7, 8, 8, 9, 9}

    private static int elementoSolitario(int[] vector) {
        return elementoSolitarioAux(vector, 0, vector.length - 1);
    }

    private static int elementoSolitarioAux(int[] vector, int i0, int in) {

        if (i0 == in)
            return vector[i0];
        else {
            int k = (i0 + in) / 2;
            if (vector[k] == vector[k - 1])
                if ((k-1-i0) % 2 == 0)
                    return elementoSolitarioAux(vector, k + 1, in);
                else
                    return elementoSolitarioAux(vector, i0, k - 2);
            else if (vector[k] == vector[k + 1])
                if ((k - i0) % 2 == 0)
                    return elementoSolitarioAux(vector, k + 2, in);
                else
                    return elementoSolitarioAux(vector, i0, k - 1);

            else return vector[k];

        }

    }

    public static void mostrarEjercicio2() {
        System.out.println(elementoSolitario(vector));
    }

}
