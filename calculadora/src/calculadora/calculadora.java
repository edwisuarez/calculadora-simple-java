package calculadora;

import java.util.Scanner;

public class calculadora{

    public static void main(String[] args)
    {

        math math = new math();

        System.out.println("Bienvenido a la calculadora");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numeroUno = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numeroDos = scanner.nextInt();

        System.out.println("Sus números son: " + numeroUno + " " + " " + numeroDos);

        System.out.println("La calculadora cuenta con la siguientes operaciones: ");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Division");
        System.out.println("4: Multiplicación");

        System.out.print("Digite una opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 1)
        {
            System.out.print("Ha elegido una suma, su resultado es: ");
            int res = math.sum(numeroUno, numeroDos);
            System.out.println(res);
        }
        else if (opcion == 2)
        {
            System.out.print("Ha elegido una resta, su resultado es: ");
            int res = math.rest(numeroUno, numeroDos);
            System.out.println(res);
        }
        else if (opcion == 3)
        {
            System.out.print("Ha elegido una division, su resultado es: ");
            int res = math.div(numeroUno, numeroDos);
            System.out.println(res);
        }
        else if (opcion == 4)
        {
            System.out.print("Ha elegido una multiplicación, su resultado es: ");
            int res = math.multiply(numeroUno, numeroDos);
            System.out.println(res);
        }


    }

}
