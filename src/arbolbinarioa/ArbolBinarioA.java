package arbolbinarioa;

import java.util.Scanner;

class ArbolBinarioA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arbol A = new Arbol();
        System.out.println("cuantos numeros desea ingresar en el arbol");
        int num2 = sc.nextInt();
        for (int i = 0; i < num2; i++) {
            System.out.println("dijite un numero en el arbol");
            int num = sc.nextInt();
            A.InsertaNodo(num);
        }

        
//        System.out.print("El recorrido en Preorden es: ");
//        A.Preorden(A.getRaiz());
//        System.out.println();
//        System.out.print("El recorrido en Inorden es: ");
//        A.Inorden(A.getRaiz());
//        System.out.println();
//        System.out.print("El recorrido en Postorden es: ");
//        A.PostOrden(A.getRaiz());
//        System.out.println();
        System.out.println("La altura del arbol es: " + A.Altura(A.getRaiz()));
        A.Anchura(A.getRaiz());
    }
    
}
