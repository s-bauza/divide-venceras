public class Examen2018 {

    private static int[] vector={1,2,3,4,7,10,15,23,32};//{10,15,23,32,1,2,3,4,7}

    private static int minArrayRotado(int[] vector){
        return minArrayRotadoAux(vector,0,vector.length-1);
    }
    private static int minArrayRotadoAux(int[] vector, int i0, int in){
        if (i0==in)
            return vector[i0];
        else{
            int k=(i0+in)/2;
            if ((vector[i0]<=vector[k])&&(vector[k]<vector[in]))
                return vector[i0];
            else if(vector[i0]>vector[k])
                return minArrayRotadoAux(vector, i0, k);
            else
                return minArrayRotadoAux(vector, k+1, in);
        }
    }

    public static void mostrarExamen2018(){
        System.out.println(minArrayRotado(vector));
    }
}
/**/