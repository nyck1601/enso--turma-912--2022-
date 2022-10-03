package app;
import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class somaTest {

    @Test
    public void verificaCasoBase() {
        Soma soma = new Soma();
        double resultado = soma.calcula("4","2");
        assertEquals(6.0, resultado);
    }

    @Test
    public void verificarCasoBase() {
        Soma soma = new Soma();
        double resultado = soma.calcula("5","8");
        assertEquals(13.0, resultado);
    }
}
    


//by Camila Pinheiro



