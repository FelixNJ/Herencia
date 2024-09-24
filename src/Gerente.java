public class Gerente extends Emleado{
    private String departamento;

    public Gerente() {
    }

    public Gerente(String cc, String nombre, double salario, String departamento) {
        super(cc, nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}';
    }

    public void mostarDetalles(){
        System.out.println("Cedula: "+cc+" Nombre: "+nombre+" Salario: "+salario);
    }
    public double calcularBonificacion(){

        return salario*0.2;
    }
}
