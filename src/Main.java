import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");

        Gerente g1 = new Gerente("123456","Pepe",2800000,"TI");
        Desarrollador d1 = new Desarrollador("234567","Andres",1500000,"Java");

        g1.mostarDetalles();
        System.out.println(df.format(g1.calcularBonificacion()));

        d1.mostarDetalles();
        System.out.println(df.format(d1.calcularBonificacion()));
    }
}