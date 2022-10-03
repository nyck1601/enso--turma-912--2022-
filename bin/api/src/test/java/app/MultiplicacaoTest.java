package app;
import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplicacaoTest {

    @Test
    public void verificaCasoBase() {
        Multiplicacao mult = new Multiplicacao();
        double resultado = mult.calcula("2","2");
        assertEquals(4.0, resultado);
    }

       
}
//by Jousiclacia Almeida