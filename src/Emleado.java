public class Emleado {
    protected String cc; //en protected, los atributos pueden usarse en las clases hijas
    protected String nombre;
    protected double salario;

    public Emleado() {
    }

    public Emleado(String cc, String nombre, double salario) {
        this.cc = cc;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Emleado{" +
                "cc='" + cc + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
    public void mostarDetalles(){
        System.out.println("Cedula: "+cc+" Nombre: "+nombre+" Salario: "+salario);
    }
    public double calcularBonificacion(){

    return salario*0.1;
    }
}
