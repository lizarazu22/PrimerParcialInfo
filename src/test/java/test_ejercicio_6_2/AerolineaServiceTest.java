package test_ejercicio_6_2;

import ejercicio_6_2.AerolineaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AerolineaServiceTest {

    @Test
    public void whenTicketsAvailable_thenReserve() {
        AerolineaService service = Mockito.spy(new AerolineaService());

        Mockito.doReturn(true).when(service).ticketsAvailable("La Paz", 2);
        Mockito.doReturn("miercoles").when(service).getWeekday(29, 5, 2023);

        String response = service.bookFlight("La Paz", 2, 29, 5, 2023);
        Assertions.assertEquals("Confirmed: 2 tickets to La Paz on Lunes, 29 Mayo 2023.", response);
    }

    @Test
    public void whenTicketsNotAvailable_thenInform() {
        AerolineaService service = Mockito.spy(new AerolineaService());

        Mockito.doReturn(false).when(service).ticketsAvailable("La Paz", 3);
        String response = service.bookFlight("La Paz", 3, 15, 6, 2023);
        Assertions.assertEquals("Sorry, insufficient tickets to La Paz.", response);
    }

    @Test
    public void whenDifferentDestination_thenReserve() {
        AerolineaService service = Mockito.spy(new AerolineaService());

        Mockito.doReturn(true).when(service).ticketsAvailable("Santa Cruz", 2);
        Mockito.doReturn("Martes").when(service).getWeekday(1, 1, 2023);

        String response = service.bookFlight("Santa Cruz", 2, 1, 1, 2023);
        Assertions.assertEquals("Confirmed: 2 tickets to Santa Cruz on Martes, 1 Enero 2023.", response);
    }

    @Test
    public void whenMonthConversionCorrect_thenReserve() {
        AerolineaService service = Mockito.spy(new AerolineaService());

        Mockito.doReturn(true).when(service).ticketsAvailable("Oruro", 2);
        Mockito.doReturn("lunes").when(service).getWeekday(20, 4, 2023);

        String response = service.bookFlight("Oruro", 2, 20, 4, 2023);
        Assertions.assertEquals("Confirmed: 2 tickets to Oruro on lunes, 20 Abril 2023.", response);
    }
}
