package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/multiplicacao/{mult1Str}/{mult2Str}")
public class Multiplicacao {
    
    @GET
    public double calcula(@PathParam String mult1Str, @PathParam String mult2Str) {
        try {

        //Criando variáveis
        double mult1 = Double.parseDouble(mult1Str);
        double mult2 = Double.parseDouble(mult2Str);

            double result = mult1 * mult2;
            return result;
            
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operação inválida, por favor tente novamente.");
        }
    }
}