package ejercicio_6_2;

public class AerolineaService {

    public boolean ticketsAvailable(String destination, int quantity) {
        return true;
    }

    public String getWeekday(int day, int month, int year) {
        return "miercoles";
    }

    public String bookFlight(String destination, int quantity, int day, int month, int year) {
        if (ticketsAvailable(destination, quantity)) {
            String weekday = getWeekday(day, month, year);
            String monthText = monthToText(month);
            return String.format("Confirmed: %d tickets to %s on %s, %d %s %d.", quantity, destination, weekday, day, monthText, year);
        } else {
            return String.format("Sorry, insufficient tickets to %s.", destination);
        }
    }

    private String monthToText(int month) {
        String[] months = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        return months[month - 1];
    }
}
