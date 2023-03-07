public class App {
    public static void main(String[] args) {
        Coche miCoche=new Coche();
        System.out.println("Número original de puertas:" + ' ' + miCoche.no_puertas);
        miCoche.incrementarPuertas();
        System.out.println("Número de puertas post incremento:" + ' ' + miCoche.no_puertas);

    }
}

// +++ Declaración de clase Coche +++ //
class Coche{

    public int no_puertas=4;

    public void incrementarPuertas(){
        this.no_puertas++;
    }
}
