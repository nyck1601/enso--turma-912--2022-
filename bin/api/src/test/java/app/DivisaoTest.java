package app;
import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DivisaoTest {

    @Test
    public void verificaCasoBase() {
        Divisao div = new Divisao();
        double resultado = div.calcula("2","2");
        assertEquals(1.0, resultado);
    }

        @Test
        public void VerificaCaso2() {
        Divisao div = new Divisao();
        double resultado = div.calcula("2","4");
        assertEquals(2.0, resultado);
    }
}