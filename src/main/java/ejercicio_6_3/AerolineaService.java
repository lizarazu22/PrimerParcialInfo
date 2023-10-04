package ejercicio_6_3;

public class AerolineaService {

    public String reservaVuelo(String destino, int cantidad, int dia, int mes, int gestion) {
        if (AerolineaServiceUtils.existenPasajes(destino, cantidad)) {
            String diaSemana = AerolineaServiceUtils.getDay(dia, mes, gestion);
            String mesTexto = convertirMesATexto(mes);
            return String.format("Confirmación: %d pasajes disponibles para %s el %s %d %s %d.", cantidad, destino, diaSemana, dia, mesTexto, gestion);
        } else {
            return String.format("Alerta: Pasajes insuficientes para %s.", destino);
        }
    }

    private String convertirMesATexto(int mes) {
        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        return meses[mes - 1];
    }
}
