//#4 Divisão

//Esta funcionalidade da calculadora tem como objetivo fazer a soma 4 números. 
//Entre os comandos da Divisão, pode-se listar:
//- Divisão de números inteiros
//- Divisão de números decimais


//CODIGO IMPLEMENTADO EM JAVA:

import java.util.Scanner;

public class divisao {

    public static void main(String[] args) {    
        System.out.println("CALCULADORA");
        System.out.println("\DIVISÃO\n");
        System.out.println("ATENÇÃO!\n Esta operação só calcula 4 números por cálculo.");
        
        Scanner leitura = new Scanner (System.in);
        
        int a, b;
        double a2, b2, c2, d2 ;
        int div;
        double div2;
        int cont = 0, escolha, i ;
        
       
        while(cont != 4){
            System.out.println("***************MENU****************");
            System.out.println("|1| Divisão de números inteiros");
            System.out.println("|2| Divisão de números decimais");
            System.out.println("|3| Sair");
            System.out.println("ATENÇÃO! Digite o número pelo qual ativa a funcionalidade que você deseja na Divisão.");
            System.out.println("***********************************");

            escolha = leitura .nextInt();
            
            if (escolha == 1){
                System.out.println("Quantas operações vc deseja realizar com a opção escolhida ?");
                int quantN = leitura.nextInt();
                
                for(i=0 ;i < quantN; i++){
                    
                    System.out.println("\nDigite o número que será dividido: ");
                    a = leitura.nextInt();
                    
                    System.out.println("\nDigite o número que irá dividir:");
                    b = leitura.nextInt();
                    
                    div = (a/b);
                    
                   System.out.println("A divisão dos números apresentados é: "+div+"\n");
                
        }
        
            
        }
            if (choose == 2){
                System.out.println("Quantas operações vc deseja realizar com a opção escolhida ?");
                int quantN2 = leitura.nextInt();
                
                for(i=0 ;i < quantN2; i++){
                    
                    System.out.println("\nDigite o número que será dividido: ");
                    a2 = leitura.nextDouble();
                    
                    System.out.println("\nDigite o número que irá dividir:");
                    b2 = leitura.nextDouble();
                    
                    div2 = (a2/b2);
                    
                   System.out.println("A divisão dos números apresentados é: "+div2+"\n");
                
                }
        
            
            }
            
            if (choose == 3){
                break;
            }
        
        }
        
    }
}
