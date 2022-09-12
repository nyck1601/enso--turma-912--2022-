package app;
import io.jooby.Jooby;

public class appjavaatatakae extends Jooby {

  {  mvc(new Index());
     mvc(new Divisão()); }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }
}