public class Examen2019 {

    private static int[] vector = {1, 2, 2, 3, 3, 4, 0, 0, 1};

    private static int elementoEspecial(int[] vector) {
        return elementoEspecialAux(vector, 0, vector.length - 1);
    }

    private static int elementoEspecialAux(int[] vector, int i0, int in) {
        if (i0 == in)
            return vector[i0];
        if (vector[i0]==vector[in])
                return elementoEspecialAux(vector,i0+1,in-1);
        else {
                int k = (i0+in)/2;
                if (vector[k]==vector[k-1]){
                    if ((k-1-i0)%2==0)
                        return elementoEspecialAux(vector,k+1,in);
                    else
                        return elementoEspecialAux(vector,i0,k-2);
                }else if(vector[k]==vector[k+1]){
                    if ((k-i0)%2==0)
                        return elementoEspecialAux(vector,k+2,in);
                    else
                        return elementoEspecialAux(vector,i0,k-1);
                }else
                    return vector[k];
            }
    }


    public static void mostrarExamen2019() {
        System.out.println(elementoEspecial(vector));
    }
}
    /*int i0Aux = i0, inAux = in;
            if (vector[i0] == vector[in]) {
                    i0Aux = i0 + 1;
                    inAux = in - 1;
                    } else {
                    i0Aux = i0 + 1;
                    inAux = in - 1;
                    }
                    int k = (i0 + in) / 2;
                    if (vector[k] == vector[k + 1]) {
                    if ((k - 1 - i0Aux + 1) % 2 == 1)
                    return elementoEspecialAux(vector, i0Aux, k - 1);
                    else
                    return elementoEspecialAux(vector, k + 2, inAux);
                    } else if (vector[k - 1] == vector[k]) {
                    if ((k - 2 - i0Aux + 1) % 2 == 1)
                    return elementoEspecialAux(vector, i0Aux, k - 2);
                    else
                    return elementoEspecialAux(vector, k + 1, inAux);
                    } else
                    return vector[k];*/