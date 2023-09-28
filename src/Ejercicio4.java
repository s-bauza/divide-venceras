import java.util.Arrays;

public class Ejercicio4 {

    private static int[] vectorA = {-5, -2, -9, -4, 1, 5, 7, 0, -3};
    private static int[] vectorB = {8, -1, 2, 4, 2, -2, 1, 0, 1};

    private static boolean check2pos(int[] vectorA, int[] vectorB, int v) {
        int i = 0;
        boolean stop = false, aux = false;
        Arrays.sort(vectorB);
        while (!stop) {
            aux = check2posAux(vectorA[i], vectorB, v, 0, vectorA.length - 1);
            if (i == vectorA.length - 1 || aux)
                stop = true;
        }
        return aux;
    }

    private static boolean check2posAux(int vA, int[] vectorB, int v, int i0, int in) {
        if (i0 == in)
            return vA + vectorB[i0] == v;
        else {
            int k = (i0 + in) / 2;
            if (vA + vectorB[k] > k)
                return check2posAux(vA, vectorB, v, i0, k);
            else if (vA + vectorB[k] == v)
                return true;
            else return check2posAux(vA, vectorB, v, k + 1, in);
        }
    }
    /*public static void mergeSort(int[] vectorB){
        mergeSortAux(vectorB,0, vectorB.length-1);
    }*/
 /*   public static void mergeSortAux(int[] vectorB,int i0, int in) {
            if(i0>=in)
                return;
                else{
                    int k =(i0+in)/2;
                    mergeSortAux(vectorB,i0,k);
                    mergeSortAux(vectorB,k+1,in);
                    //merge(); //faltaria implememtarla
        }
    }*/

    public static void mostrarEjercicio4() {
        System.out.println(check2pos(vectorA, vectorB, -1));
    }
}
