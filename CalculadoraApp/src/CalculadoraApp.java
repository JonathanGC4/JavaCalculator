import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {

            System.out.println("**** Aplicacion Calculadora ****");

            MostrarMenu();
            try {

                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las operaciones seleccionadas
                if (operacion >= 1 && operacion <= 4) {

                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opcion Erronea: " + operacion);
                }
                System.out.println();
            }//Fin Try
            catch (Exception e){
                System.out.println("Ocurrio un error: "+ e.getMessage());
            }
        }//Fin While
    }//Fin main

    private  static  void MostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Operacion a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.println("Proporciona valor operando1: ");

        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        //var resultado = operando1 + operando2;
        Double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicacion: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado Division: " + resultado);
            }
            default -> System.out.println("Opcion Erronea: " + operacion);

        }

    }
}//Fin clase
