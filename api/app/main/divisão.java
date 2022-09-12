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
            return Math.sqrt(op);
            return Math.sqrt(op2);
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador invalido.");
        }
    }
}