import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz1;  //Declaración
        matriz1 = new int[5][3];   //Instanciación

        char[][] matriz2 = new char[2][]; //Declaración e Instanciación con número de elementos de cada fila variable

        int[][] matriz3 = {{1, 3, 5}, {2, 4, 6}};   //Inicialización
/*
        for (int f=0; f<matriz1.length; f++)    //Escribir matriz
            for (int c=0; c<matriz1[f].length; c++)
                matriz1[f][c] = sc.nextInt();

        for (int f=0; f<matriz1.length; f++) {  //Leer matriz
            for (int c = 0; c < matriz1[f].length; c++)
                System.out.print(matriz1[f][c] + "\t");
            System.out.print("\n");
        }
*/
        for (int f=0; f<matriz3.length; f++) {  //Escribir matriz
            for (int c = 0; c < matriz3[f].length; c++)
                System.out.print(matriz3[f][c] + "\t");
            System.out.print("\n");
        }

        sc.close();
    }
}