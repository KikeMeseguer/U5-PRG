import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] array1; //Declaración
        array1 = new int[5];   //Instanciación

        char[] array2 = new char[4]; //Declaración e Instanciación

        int[] array3 = {1, 4, 5, 20}; //Inicialización

        System.out.print("Escribe 5 enteros: ");
        for (int i=0; i<array1.length; i++)  //Escribir array
            array1[i] = sc.nextInt();

        for (int i=0; i<array1.length; i++)  //Leer array
            System.out.print(array1[i] + "\t");
        System.out.println("\n");

        for (int i: array3)  //foreach (solo leer)
            System.out.print(i + "\t");
        System.out.println("\n");

        System.out.print("Escribe hasta 4 caracteres: ");
        sc.nextLine();
        array2 = sc.nextLine().toCharArray();   //Escribir array de char

        System.out.println(array2);   //Leer array de char

        String string1 = new String(array2); //Pasar array de char a string
        System.out.println(string1);

        String string2 = new String(string1 + " " + new String(array2));    //Concatenar Strings
        System.out.println(string2);

        System.out.print("Escribe nombre y edad 3 veces: ");
        Clase[] persona = new Clase[3];
        for (int i=0; i<persona.length; i++) {
            persona[i] = new Clase(sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }

        for (int i=0; i<persona.length; i++)
            System.out.println("nombre: " + persona[i].nombre + "\tEdad: " + persona[i].edad);

        sc.close();
    }
}
