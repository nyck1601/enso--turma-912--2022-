package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/soma/{som1Str}/{som2Str}")
public class Soma {
    
    @GET
    public double calcula(@PathParam String som1Str, @PathParam String som2Str) {
        try {

        //Criando variáveis
        double som1 = Double.parseDouble(som1Str);
        double som2 = Double.parseDouble(som2Str);

            double result = som1 + som2;
            return result;
            
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operação inválida, por favor tente novamente.");
        }
    }
}