package app;

import io.jooby.annotations.*;

@Path("/")
public class Main {

  @GET
  public String sayHi() {
    return "Seja bem-vindo ao Jooby!";
  }
}
