package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/div/{div1Str}/{div2Str}")
public class Divisao {
    
    @GET
    public double calcula(@PathParam String div1Str, @PathParam String div2Str) {
        try {

        //Criando variáveis
        double div1 = Double.parseDouble(div1Str);
        double div2 = Double.parseDouble(div2Str);

            double result = div1 / div2;
            return result;
            
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}
