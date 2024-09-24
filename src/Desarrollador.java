public class Desarrollador extends Emleado {
    private String lenguaje;

    public Desarrollador() {
    }
    public Desarrollador(String cc, String nombre, double salario, String lenguaje) {
        super(cc, nombre, salario);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "lenguaje='" + lenguaje + '\'' +
                '}';
    }

    public void mostarDetalles(){
        System.out.println("Cedula: "+cc+" Nombre: "+nombre+" Salario: "+salario);
    }
    public double calcularBonificacion(){

        return salario*0.1;
    }
}
