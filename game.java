import java.util.Scanner;
import java.util.Random;
class jogador
{
  String nick;
  int pontuacao;
  void ver_pontuacao()
  {
    //return nick;
    System.out.println(nick + " - Pontos: " + pontuacao);
  }
}
class partida
{
    	Scanner reader = new Scanner(System.in);
        Random objeto = new Random();
    	int quantidade_jogadores = 0;
        int resposta_jogador = 0;
	    String[] valores_perguntas  = {"1","2","3","4","5"};
        int quantidade_perguntas_nulas = 0;
	public partida(int valor)
	{
	    this.quantidade_jogadores = valor;
		System.out.println(this.quantidade_jogadores);
	}
    void iniciar()
    {
        //BASEADO NA QUANTIDADE DE JOGADORES IREMOS DECLARAR UMA LISTA DE OBJETOS 
        jogador[] players = new jogador[quantidade_jogadores]; 

        //PARA CADA ITEM DA LISTA TEREMOS UM NOVO OBJETO
        for(int i = 0; i < players.length ; i++)players[i] = new jogador();
    
        //PARA CADA OBJETO  DA LISTA PEDIREMOS UM NICK
        //CONTANDO DE 1 ATE QUATRO
        for(int i = 1; i <= players.length; i++)
        {
            //APRESENTAREMOS O OBJETO ATUAL
            System.out.println("Player " + i + " nick:" ); 

            //PEDIREMOS UM NICK E ARMAZENAREMOS EM SEU INDEX QUE SEMPRE SERÁ i-1, SE i = 0 ENTAO O INDEX DO PRIMEIRO ITEM É 0 (1-1)
            players[i-1].nick = reader.next();
        }/*FOR*/
        
        //ENQUANTO HOUVER PERGUNTAS
        int i =0;
        while(quantidade_perguntas_nulas!=5)
        {
            
            //ENQUANTO O CONTADOR FOR MENOR QUE O VALOR QUE É REFERENCIA À QUANTIDADE DE OBJETOS JOGADORES 
	        while(i < players.length)
	        {
                //SE TODAS AS PERGUNTAS FOREM NULAS SAIR DO WHILE ATUAL 
	            if(quantidade_perguntas_nulas == 5)
                {
                    break;
                    
                }
                
                //VAIRAVEIS PARA GUARDAR O VALOR ALEATORIO DO OBJETO RANDOM 
                int valor_aleatorio = 0;
            
                //APRESENTAÇÃO DO JOGADOR ATUAL                
                System.out.println("Vez do " + players[i].nick + "!");
                
                //ENQUANTO A PERGUNTA FOR NULA, OU SEJA, ENQUANTO O VALOR ALEATORIO RESULTAR NUMA PERGUNTA JÁ ESCOLHIDA
                while(true)
                {
                    //SORTEAR UM VALOR ENTRE O INTERVALO DE PERGUNTAS POSSIVEIS
                    valor_aleatorio = objeto.nextInt(valores_perguntas.length);

                    //ESCOLHER UMA PERGUNTA BASEADA NO VALOR ALEATORIO
                    String pergunta = valores_perguntas[valor_aleatorio];

                    //SE A PERGUNTA FOR NULLA, SIGNIFICA QUE JA FOI ESCOLHIDA
                    if(pergunta == null)
                    {
                        
                        //SE A QUANTIDADE DE VALORES NULOS FOR IGUAL AO TAMANHO DA LISTA DE PERGUNTAS SIGNIFICA QUE TODAS AS PERGUNTAS JA FORAM ESCOLHIDAS E NÃO HÁ MAIS NENHUMA DISPONIVEL
                        if(quantidade_perguntas_nulas == 5) break;
                        continue;
                    }
                    //SE A PERGUNTA NÃO FOR NULA, PARAR O LOOPING E IR PARA A PROXIMA INSTRUÇÃO
                    else
                    {
                        break;
                    }
                }//While 

                //A PERGUNTA ATUAL PASSA A SER NULA PORQUE ACABA DE TER SIDO ESCOLHIDA 
                valores_perguntas[valor_aleatorio] = null;

                //SOMANDO MAIS 1 À QUANTIDADE DE VALORES NULOS
                quantidade_perguntas_nulas++;

                //APRESENTAR A PERGUNTA
                switch(valor_aleatorio)
                    {
                    
                        case 1:
                            System.out.println("Pergunta 1");
                            //PEDIR UMA RESPOSTA
                            resposta_jogador = reader.nextInt();
                            //SE A RESPOSTA FOR IGUAL A CORRETA CONTAR PONTO
                            if(resposta_jogador == 1) players[i].pontuacao +=1;
                            //SE O JOGADOR ATUAL FOR O ULTIMO
                            if(i+1 == players.length) i =0;
                            break;
                        case 2:
                            System.out.println("Pergunta 2");
                            resposta_jogador = reader.nextInt();
                            if(resposta_jogador == 2) players[i].pontuacao +=1;
                            if(i+1 == players.length) i =0;
                            break;
                        case 3:
                            System.out.println("Pergunta 3");
                            resposta_jogador = reader.nextInt();
                            if(resposta_jogador == 3) players[i].pontuacao +=1;
                            if(i+1 == players.length) i =0;
                            break;
                        case 4:
                            System.out.println("Pergunta 4");
                            resposta_jogador = reader.nextInt();
                            if(resposta_jogador == 4) players[i].pontuacao +=1;
                            if(i+1 == players.length) i =0;
                            break;
                        case 5:
                            System.out.println("Pergunta 5");
                            resposta_jogador = reader.nextInt();
                            if(resposta_jogador == 5) players[i].pontuacao +=1;
                            if(i+1 == players.length) i =0;
                            break;
                    }//SWITCH
                       i++;        
                }//FOR
                
            }//WHILE INFINITO

            //APRESENTAÇÃO DA PONTUAÇÃO DE CADA JOGADOR
            for(int a = 0; a <players.length;a++)players[a].ver_pontuacao();
		
	    
    }/*VOID*/

}  
public class game
{
  public static void main (String args[])
  {	Scanner leitor = new Scanner(System.in);
	int quantidade_inicial = 0;
	while(true)
	{
		System.out.println("Digite a quantiade de jogadores");
		quantidade_inicial = leitor.nextInt();
		if(quantidade_inicial != 1 && quantidade_inicial <=4)
		{
			partida rodada = new partida(quantidade_inicial);
			rodada.iniciar();
			break;
		}
		else
		{
			System.out.println("A quantidade de jogadores sao pelo menos 2 e no maximo 4");
			continue;
		}
	}
  	
  } //VOID 
} //CLASS
