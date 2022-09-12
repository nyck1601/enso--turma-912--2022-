package app;
import io.jooby.Jooby;

public class app extends Jooby {

  {  mvc(new Index());
     mvc(new Divisão());
     mvc(new Adição());
     mvc(new Multiplicação()); }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }
}