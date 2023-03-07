public class App {
    public static void main(String[] args)  {
        
        Persona persona = new Persona();

        persona.setNombre("Carlos");
        persona.setEdad(29);
        persona.setTelefono(330044758);
        System.out.println(" +++ Datos persona +++\n");
        System.out.println("Nombre:" + persona.getNombre());
        System.out.println("Edad:" + persona.getEdad());
        System.out.println("Teléfono:" + persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad, telefono;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    } 

    public int getTelefono() {
        return telefono;
    }
}
