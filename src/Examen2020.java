public class Examen2020 {
    private static int[] vector = { 9, 3};


    private static int maxArrayColina(int[] vector) {
        return maxArrayColinaAux(vector, 0, vector.length - 1);
    }

    private static int maxArrayColinaAux(int[] vector, int i0, int in) {
        if (i0 == in) {
            return vector[i0];
        }
        else if (i0+1==in) {
            return Math.max(vector[i0],vector[in] );
        }
        else {
            int k = (i0 + in) / 2;
            if (vector[k] < vector[k + 1])
                return maxArrayColinaAux(vector, k + 1, in);
            else if (vector[k - 1] < vector[k])
                return vector[k];
            else
                return maxArrayColinaAux(vector, i0, k);
        }
    }

    public static void mostrarExamen2020() {
        System.out.println(maxArrayColina(vector));
    }
}

/*if (i0 == in) {
            return vector[i0];
        } else if (in == i0 + 1)
            return Math.max(vector[i0], vector[in]);
        else {
            int k = (i0 + in) / 2;
            if (vector[k] < vector[k + 1])
                return maxArrayColinaAux(vector, k + 1, in);
            else if (vector[k - 1] < vector[k])
                return vector[k];
            else
                return maxArrayColinaAux(vector, i0, k);
        }*/