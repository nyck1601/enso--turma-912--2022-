package app;
import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PotenciacaoTest {

    @Test
    public void verificaCaso1() {
        Potenciacao div = new Potenciacao();
        double resultado = div.calcula("3","3");
        assertEquals(27.0, resultado);
    }

        @Test
        public void verificaCaso2() {
        Potenciacao div = new Potenciacao();
        double resultado = div.calcula("5","3");
        assertEquals(125.0, resultado);
    }
}
//BY ANDINHO
