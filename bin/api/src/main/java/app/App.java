package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    mvc(new Main());
    mvc(new Soma());
    mvc(new Multiplicacao());
    mvc(new Index());
    mvc(new Divisao());

  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
