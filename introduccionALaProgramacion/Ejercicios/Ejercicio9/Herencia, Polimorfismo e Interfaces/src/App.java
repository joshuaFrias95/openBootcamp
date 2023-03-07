public class App {
    public static void main(String[] args) {

        
        Cliente cliente = new Cliente();
        cliente.setNombre("Joaquin");
        cliente.setEdad(35);
        cliente.setTelefono(1122334455);
        cliente.setCredito(3500);

        System.out.println("\n+++ Datos cliente +++\n" + 
        "Nombre: " + cliente.getNombre() 
        + "\nEdad: " + cliente.getEdad() 
        + "\nTeléfono: " + cliente.getTelefono()
        + "\nCrédito: $" + cliente.getCredito());


        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Laura");
        trabajador.setEdad(27);
        trabajador.setTelefono(554433221);
        trabajador.setSalario(12500);

        System.out.println("\n\n+++ Datos trabajador +++\n" + 
        "Nombre: " + trabajador.getNombre() 
        + "\nEdad: " + trabajador.getEdad() 
        + "\nTeléfono: " + trabajador.getTelefono()
        + "\nSalario: $" + trabajador.getSalario());
    }  
}


// Declaramos clase padre persona
class Persona {
    private String nombre;
    private int edad, telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}

//Declaramos clase cliente
class Cliente extends Persona {
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

// Declaramos clase trabajador
class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
