import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		
		try {  
            contar(parametroUm, parametroDois);
            
        }  
        catch (Exception e) {   
            System.out.print(e.getMessage()); 
        }  
       
    }        
		
	static void contar(int parametroUm, int parametroDois ){
        if (parametroUm > parametroDois) {
           
            int contagem = parametroUm - parametroDois;

        for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo número : " + (i+1));
            }
        }
        else {
            throw new RuntimeException("O parâmetro 2 tem que ser menor que o parâmetro 1");
	    }

    }
}
