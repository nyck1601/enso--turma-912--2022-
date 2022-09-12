//#1 Adição

//Esta funcionalidade da calculadora tem como objetivo fazer a soma 4 números. 
//Entre os comandos da adição, pode-se listar:
//- Adição de números inteiros
//- Adição de números decimais


//CODIGO IMPLEMENTADO EM JAVA:

import java.util.Scanner;

public class adicao {

    public static void main(String[] args) {    
        System.out.println("CALCULADORA");
        System.out.println("\nADIÇÃO\n");
        System.out.println("ATENÇÃO! Esta operação só calcula 4 números por cálculo.");
        
        Scanner leitura = new Scanner (System.in);
        
        int a, b, c, d ;
        double a2, b2, c2, d2 ;
        int soma;
        double soma2;
        int cont = 0, choose, i ;
        
       
        while(cont != 4){
            System.out.println("***************MENU****************");
            System.out.println("|1| Soma de números inteiros");
            System.out.println("|2| Soma de números decimais");
            System.out.println("|3| Sair");
            System.out.println("ATENÇÃO! Digite o número pelo qual ativa a funcionalidade que você deseja na adição.");
            System.out.println("***********************************");

            choose = leitura .nextInt();
            
            if (choose == 1){
                System.out.println("Quantas operações vc deseja realizar com a opção escolhida ?");
                int quantN = leitura.nextInt();
                
                for(i=0 ;i < quantN; i++){
                    
                    System.out.println("\nDigite o primeiro número: ");
                    a = leitura.nextInt();
                    
                    System.out.println("\nDigite o segundo número:");
                    b = leitura.nextInt();
                    
                    System.out.println("\nDigite o terceiro número: ");
                    c = leitura.nextInt();
                    
                    System.out.println("\nDigite o quarto número:");
                    d = leitura.nextInt();
                    
                    soma = (a+b+c+d);
                    
                   System.out.println("A soma dos números apresentados é: "+soma+"\n");
                
        }
        
            
        }
            if (choose == 2){
                System.out.println("Quantas operações vc deseja realizar com a opção escolhida ?");
                int quantN2 = leitura.nextInt();
                
                for(i=0 ;i < quantN2; i++){
                    
                    System.out.println("\nDigite o primeiro número: ");
                    a2 = leitura.nextDouble();
                    
                    System.out.println("\nDgite o segundo número:");
                    b2 = leitura.nextDouble();
                    
                    System.out.println("\nDigite o terceiro número: ");
                    c2 = leitura.nextDouble();
                    
                    System.out.println("\nDgite o quarto número:");
                    d2 = leitura.nextDouble();
                    
                    soma2 = (a2+b2+c2+d2);
                    
                   System.out.println("A soma dos números apresentados é: "+soma2+"\n");
                
                }
        
            
            }
            
            if (choose == 3){
                break;
            }
        
        }
        
    }
}


