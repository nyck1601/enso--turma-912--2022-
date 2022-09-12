package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/Divisão/{op}/{op2}")
public class divisão {
    
    @GET
    public double calcula(@PathParam("op") String opStr, String opStr2) {
        try {
            double op2 = Double.parseDouble(opStr2);
            double op = Double.parseDouble(opStr);
           var Math = op / op2;
            return Math;
         } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador invalido.");
        }
    }
}