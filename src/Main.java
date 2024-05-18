import java.util.Scanner;


class Ejercicio1 {
    public void verificarEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}

class Ejercicio2 {
    public void encontrarMayor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("El primer número es mayor.");
        } else if (num2 > num1) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}

class Ejercicio3 {
    public void verificarParImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
class FactorialCalculator_while {
    public long calculateFactorial(int number) {
        long factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }

        return factorial;
    }
}

class FactorialCalculator_for {


    public long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}

class NumerosImparesFor {
    public void mostrarImpares(int limite) {
        System.out.println("Números impares desde 1 hasta " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class NumerosImparesWhile {
    public void mostrarImpares(int limite) {
        System.out.println("Números impares desde 1 hasta " + limite + ":");
        int i = 1;
        while (i <= limite) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}


class Day {

    public String getDayName(int dayNumber) {
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Lunes";
                break;
            case 2:
                dayName = "Martes";
                break;
            case 3:
                dayName = "Miércoles";
                break;
            case 4:
                dayName = "Jueves";
                break;
            case 5:
                dayName = "Viernes";
                break;
            default:
                dayName = "Número inválido. Por favor, ingrese un número del 1 al 5.";
                break;
        }

        return dayName;
    }
}


public class Main {
    public static void main(String[] args) {
        ////
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.verificarEdad();


        ////
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.encontrarMayor();

        ////
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.verificarParImpar();

        ///
        Scanner Bucle_for = new Scanner(System.in);
        System.out.print("Ingresa un número mayor a 10 y menor que 30: ");

        int limite_for = Bucle_for.nextInt();

        if (limite_for > 10 && limite_for < 30) {
            NumerosImparesFor finder = new NumerosImparesFor();
            finder.mostrarImpares(limite_for);
        } else {
            System.out.println("El número ingresado no cumple con los requisitos.");
        }


        ////
        Scanner Bucle_wihile = new Scanner(System.in);
        System.out.print("Ingresa un número mayor a 10 y menor que 30: ");
        int limite_while = Bucle_wihile.nextInt();

        if (limite_while > 10 && limite_while < 30) {
            NumerosImparesWhile finder = new NumerosImparesWhile();
            finder.mostrarImpares(limite_while);
        } else {
            System.out.println("El número ingresado no cumple con los requisitos.");
        }

        ///
        Scanner scanner_factorial_for = new Scanner(System.in);
        System.out.print("Por favor, ingrese un número: ");
        int number_for = scanner_factorial_for.nextInt();
        FactorialCalculator_for calculator_for = new FactorialCalculator_for();
        long result_for = calculator_for.calculateFactorial(number_for);
        System.out.println("El factorial de " + number_for + " es: " + result_for);


        ///
        Scanner scanner_factorial_while = new Scanner(System.in);
        System.out.print("Por favor, ingrese un número: ");
        int number = scanner_factorial_for.nextInt();
        FactorialCalculator_for calculator_while = new FactorialCalculator_for();
        long result = calculator_while.calculateFactorial(number);
        System.out.println("El factorial de " + number + " es: " + result);

        Scanner scanner = new Scanner(System.in);

        //
        System.out.print("Por favor, ingrese un número del 1 al 5: ");
        int number_semana = scanner.nextInt();

        //
        Day Dia_semana = new Day();

        //
        String dayName = Dia_semana.getDayName(number_semana);

        //
        System.out.println("El día correspondiente es: " + dayName);

    }
}
