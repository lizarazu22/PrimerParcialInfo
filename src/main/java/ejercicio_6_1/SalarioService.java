package ejercicio_6_1;

public class SalarioService {
    private static final int SALARIO_BASICO = 2000;
    private static final double DESCUENTO_BASICO = 0.0;
    private static final double DESCUENTO_MEDIO = 5.0;
    private static final double DESCUENTO_ALTO = 15.0;

    public double calcularDescuento(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salario no válido");
        }

        if (salario <= SALARIO_BASICO) {
            return DESCUENTO_BASICO;
        } else if (salario <= 2 * SALARIO_BASICO) {
            return DESCUENTO_MEDIO;
        } else {
            return DESCUENTO_ALTO;
        }
    }
}
