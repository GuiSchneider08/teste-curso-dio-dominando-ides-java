package variaveis;

/* EXCERCICIO DE EXEMPLO DA AULA 1 DE VARIAVEIS */

public class Variaveis {
	
	public static void main(String[] args) {
		
		int i; //correta
		//int i;
		int I; //correta
		//int 1a;
		int _1a; //forma não usual
		int $ag; //forma não usual 
		
		i = 5;
		I= 10;
		_1a = 20;
		$ag = 7;

					
		final int j = 10; //correta
		//int l = 15 incorreta pois o valor final ja foi declarado 
		int asrn24678md; //correta
		//int asrn24	78md;
		int a$rn24678_md = 10; //forma não usual
		//int asrn2$46%78_md = 10;
		
		asrn24678md = 100;
				
		int quantidadeProduto = 50; //correta
		//int QuantidadeProduto;
		final int NUMERO_TENTATIVAS = 5; //correta
	    //final int numeroTentarivas = 5; //Quando tem final, não usa-se notação camelo 
	    int NUMERO_OPCOES = 25;
	    //int qtdProd; // forma indevida pois não fica claro o que significa a Variável
	    
	    
	    
	    System.out.println(i);
	    System.out.println(I);
	    System.out.println(_1a);
	    System.out.println($ag);
	    
	    System.out.println(j);
	    System.out.println(asrn24678md);
	    System.out.println(a$rn24678_md);
	    	    
	    System.out.println(quantidadeProduto);
	    System.out.println(NUMERO_TENTATIVAS);
	    System.out.println(NUMERO_OPCOES);
	    	
		
	}
}