import java.util.Arrays;
import java.util.Scanner;

public class TestePrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ficha2 f = new Ficha2();//Don't need to change


        //Pergunta 1
/*        //a)
        System.out.println("Quantos valores a ler?");
        int ler  = sc.nextInt();
        int [] a = new int[ler];
        System.out.println("introduza " + ler + " inteiros");
        for (int i = 0;i < a.length ; i++) {
            a[i] = sc.nextInt();
        }
        int min = f.minimo(a);
        System.out.println("o minimo é: " + min);
*/
/*       //b)
        System.out.println("Quantos valores a ler?");
        int ler = sc.nextInt();
        int [] a = new int[ler];
        System.out.println("introduza " + ler + " inteiros");
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("introduza os 2 indices");
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int [] b = f.valoresEntre(a, inicio, fim);

        System.out.println("o array resultante é : " + Arrays.toString(b));
*/
/*
        //c)
        System.out.println("Quantos valores a ler for the first array?");
        int ler1 = sc.nextInt();
        int [] a = new int[ler1];
        System.out.println("introduza " + ler1 + " inteiros");
        for (int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Quantos valores a ler for the second array");
        int ler2 = sc.nextInt();
        int [] b = new int[ler2];
        System.out.println("introduz " + ler2 + " inteiros");
        for (int i = 0; i< b.length; i++) {
            b[i] = sc.nextInt();
        }
        int [] c = f.comuns(a,b);
        System.out.println(Arrays.toString(c));
*/

        //Pergunta 2 (Para correr a alinea que queres retirar o comentario)
        //a)
        int [][] c;
        c = new int[5][5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Please insert the grades of student number" + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.println("Grade of the UC number " + (j + 1) + ":");
                int value = sc.nextInt();
                c[i][j] = value;
            }
        }


        //b)
        /*
        System.out.println("Enter the UC Index: ");
        int index = sc.nextInt();
        int sum_das_notas = f.notasUC(index,c);
        System.out.println("Se somar as notas a UC: " + index + " o resultado é: " + sum_das_notas);

         */

        /*
        //c)
        System.out.println("Enter Student Index:");
        int index = sc.nextInt();
        int media = f.mediaAluno(index,c);
        System.out.println("A media do aluno com Index é: " + media);

         */

        //d)
        /*
        System.out.println("Enter UC Index:");
        int index = sc.nextInt();
        int media = f.mediaUC(index,c);
        System.out.println("A media das notas na UC com Index é: " + media);
        */

        //e)
        /*
        int higher_grade = f.maxgrade(c);
        System.out.println("Melhor nota: " + higher_grade);

         */

        //f)
        /*
        int lower_grade = f.mingrade(c);
        System.out.println("Pior nota: " + lower_grade);

         */

        //g)
        /*
        System.out.println("Introduza o valor a partir do qual deseja obter as notas: ");
        int nota = sc.nextInt();
        String filter_grades = f.filter(nota,c);
        System.out.println("Grandes bigger than " + nota + ":" + filter_grades);
        */

        //h  System.out.println(Arrays.deepToString(c));

        //i)
        /*
        int betterUC = f.bestUC(c);
        System.out.println("THE BETTER UC IS :" + betterUC);

         */

    }
}