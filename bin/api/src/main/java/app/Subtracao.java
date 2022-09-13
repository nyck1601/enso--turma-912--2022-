package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/subtracao/{sub1}/{sub2}")
public class Subtracao {
    
    @GET
    public double calcula(@PathParam("nf") String sub1Str, @PathParam("ns") String sub2Str) {
        try {

        //Criando variáveis
        double sub1 = Double.parseDouble(sub1Str);
        double sub2 = Double.parseDouble(sub2Str);

            double result = sub1 - sub2;
            return result;
            
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operação inválida, por favor tente novamente.");
        }
    }
}
//Jhennefer Monique