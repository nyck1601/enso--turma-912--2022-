package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {
funcao-soma
    mvc(new Main());
    mvc(new Soma());


    mvc(new Index());
    mvc(new divisão());
 main
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
