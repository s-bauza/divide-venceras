public class Examen2021 {


    private static int[] vetor={0,1,2,3,4,6,7,8,9}; //0,1,2,3,4,6,7,8,9 || 0,1,2,4,5,6,7,8,9 || 0,1,2,3,4,5,6,7,8


 private static    int parImpar(int[] vector){
    return parImparAux(vector,0,vector.length-1);
    }

  private static   int parImparAux(int[] vector,int i0,int in){
        if (i0==in)
            if ((vector[i0]+i0)%2==1)
                return i0;
            else return -1;
        else {
            int k=(i0+in)/2;

            if ((vector[k]+k)%2==1)
                return parImparAux(vector,0,k);
            else
                return parImparAux(vector,k+1,in);
        }
    }


 public static   void mostrarExamen2021(){
        System.out.println(parImpar(vetor));
    }



}
