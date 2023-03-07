public class App {
    public static void main(String[] args) {
        
        // ~~~~~~~~~~     CONDICIONAL IF     ~~~~~~~~~~

        System.out.println("\n++++++++++   CONDICIONAL IF   ++++++++++\n");
        int numeroIf = -5;

        if (numeroIf < 0) {
            System.out.println("numeroIf equivale a: " + numeroIf + "\nnumeroIf es un número negativo");
        } else if (numeroIf == 0) {
            System.out.println("numeroIf equivale a: " + numeroIf + "\nnumeroIf es igual a 0");
        } else {
            System.out.println("numeroIf equivale a: " + numeroIf + "\nnumeroIf es un número positivo");
        }


        // ~~~~~~~~~~     BUCLE WHILE     ~~~~~~~~~~
        System.out.println("\n++++++++++   BUCLE WHILE   ++++++++++\n");
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println("Iteración de numeroWhile:" + numeroWhile);
            numeroWhile++;
        }


        // ~~~~~~~~~~     BUCLE DO WHILE     ~~~~~~~~~~
        System.out.println("\n++++++++++   BUCLE DO WHILE   ++++++++++\n");
        int numeroDoWhile = 0;

        do {
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
        
        System.out.print("Iteración final de numeroDoWhile: " + numeroDoWhile + "\n");


        // ~~~~~~~~~~     CICLO FOR     ~~~~~~~~~~
        System.out.println("\n++++++++++   CICLO FOR   ++++++++++\n");
        
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor: " + numeroFor);
        }


        // ~~~~~~~~~~     CONDICIONAL SWITCH     ~~~~~~~~~~
        System.out.println("\n++++++++++   CONDICIONAL SWITCH   ++++++++++\n");
        int estacion = 12;

        switch (estacion) {
            case 3,4,5:
                System.out.println("Ingresaste el mes: " + estacion + "\nEstamos en la estación Primavera");
                break;
            case 6,7,8:
                System.out.println("Ingresaste el mes: " + estacion + "\nEstamos en la estación Verano");
                break;
            case 9,10,11:
                System.out.println("Ingresaste el mes: " + estacion + "\nEstamos en la estación Otoño");
                break;
            case 12,1,2:
                System.out.println("Ingresaste el mes: " + estacion + "\nEstamos en la estación Invierno");
                break;
            default:
            System.out.println("Ingresaste el mes: " + estacion + "\nEstación incorrecta");
                break;
        }
    }
}
