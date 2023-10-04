package test_ejercicos_6_3;

import ejercicio_6_3;
import ejercicio_6_3.AerolineaService;
import ejercicio_6_3.AerolineaServiceUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;


public class AerolineaServiceTest {
    @Test
    public void
    testReservaVueloConPasaJesDisponibles()
    {
        try
            testReservaVueloConPasaJesDisponibles();
    }
    try
            (MockedStatic<AerolineaServiceUtils>utilities = Mockito.mockStatic(AerolineaServiceUtils.class)){

    }
    utilities.when(()->AerolineaServiceUtils.existenPasajes("La paz",2)).thenReturn(true);
    AerolineaServiceUtils.getDay(29,5,2023).thenReturn("Lunes"):

    AerolineaService
    aerolineaService= new AerolineaService();
    String respuesta = aerolineaService.reservaVuelo("la paz ",2,29,5,2023);

    Assertions.assertEquals("Confirmacion ;2 pasajes disponibles ", respuesta );

}
}
@Test
public void
testReservaVueloSinPasajeDisponible()
        {
            try
        (MockedStatic<AerolineaServiceUtills>utilities= Mockito.mockStatic(AerolineaService))
        }



