import java.util.Scanner;
public class adicao {
  public static void main(String[] args){
    Scanner leitura= new Scanner(System.in);
    System.out.println("|ADIÇÃO|");

    int n1, n2, ad;

    for(;;){
      System.out.println("Informe o primeiro valor:");
      n1= leitura.nextInt();
      System.out.println("Informe o segundo valor:");
      n2= leitura.nextInt();
      ad=n1+n2;
      System.out.printf("\n Resultado: "+ad);

      System.out.println("\n \n Deseja continuar? 1-sim ou 2-não");
      int a= leitura.nextInt();
      if(a==2)
        break;
    }
  }
}
