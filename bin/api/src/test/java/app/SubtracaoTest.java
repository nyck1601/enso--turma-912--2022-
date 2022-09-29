package app;
import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SubtracaoTest {

    @Test
    public void verifiqueCasoBase() {
        Subtracao subtracao = new Subtracao();
        double resultado = subtracao.calcula("4","2");
        assertEquals(2.0, resultado);
    }

    

    
    }

//by Jhennefer Monique