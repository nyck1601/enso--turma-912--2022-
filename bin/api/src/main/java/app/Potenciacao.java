
package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/potenciação/{div1}/{div2}")
public class Potenciacao {
    
    @GET
    public double calcula(@PathParam("nf") String div1Str, @PathParam("ns") String div2Str) {
        try {

       
        double div1 = Double.parseDouble(div1Str);
        double div2 = Double.parseDouble(div2Str);

            double result = (float)Math.pow(div1, div2);
            return result;
            
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}


