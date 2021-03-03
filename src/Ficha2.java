
import java.util.Arrays;

public class Ficha2 {

    //Pergunta 1
    //a)
    public int minimo(int[] a){
        int min = a[0];
        for(int i = 0 ; i <a.length ; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return  min;
    }

    //b)
    public int[] valoresEntre(int []a,int i, int f){
        if(i>f || f > a.length){
            return null;
        }
        int size = f-i+1;
        int [] res = new int[size];
        System.arraycopy(a,i,res,0,size);
        return res;
    }

    //c)
    public int[] comuns(int [] a, int [] b) {
        int [] res = new int [a.length];
        int ind=0;
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                if (a[i] == b[j]) {
                    boolean found = false; //para entrar no ciclo
                    for (int k=0; k<ind && !found; k++) {
                        if (res[k] == a[i]) found = true;
                    }
                    if (!found) {
                        res[ind] = a[i];
                        ind++;
                    }
                }
            }
        }
        int [] resultado = new int[ind];
        System.arraycopy (res, 0, resultado, 0, ind);
        return resultado;
    }

    //Pergunta 2
    //b)
    public int notasUC (int n, int pauta[][]){
        int total = 0;
        for (int i = 0 ; i< 5 ; i++){
            total += pauta[i][n];
        }
        return total;
    }

    //c)
    public  int mediaAluno (int n , int pauta[][]){
        int aveg = 0;
        for (int i = 0; i<5;i++){
            aveg += pauta[n][i];
        }
        return (aveg/5);
    }

    //d
    public  int mediaUC (int n , int pauta[][]){
        int avegUC = 0;
        for (int i = 0; i<5;i++){
            avegUC += pauta[i][n];
        }
        return (avegUC/5);
    }

    //e
    public int maxgrade (int pauta[][]){
        int max = pauta[0][0];
        for (int i = 0 ;i<5;i++){
            for (int j = 0 ; j<5;j++){
                if (pauta[i][j] > max){
                    max = pauta[i][j];
                }
            }
        }
        return max;
    }

    //f
    public int mingrade (int pauta[][]){
        int min = pauta[0][0];
        for (int i = 0 ;i<5;i++){
            for (int j = 0 ; j<5;j++){
                if (pauta[i][j] < min){
                    min = pauta[i][j];
                }
            }
        }
        return min;
    }

    //g
    public String filter (int n , int pauta[][]){
        int[] highscores = new int [25];
        int buffer = 0;
        for (int i = 0 ;i<5;i++){
            for (int j = 0 ; j<5;j++){
                if (pauta[i][j] > n ){
                    highscores[buffer] = pauta[i][j];
                    buffer++;
                }
            }
        }
        int[] res = new int[buffer];
        System.arraycopy(highscores,0,res,0,buffer);
        return (Arrays.toString(res));
    }

    //i)
     public int bestUC (int[][]pauta){
        double max,rand;
        int index;
        max = mediaUC(0,pauta);
        index = 0;
        for (int i = 1 ; i < 5; i++){
            rand = mediaUC(i,pauta);
            if (rand > max){
                max = rand;
                index = i;
            }
        }
        return index;
   }
}
