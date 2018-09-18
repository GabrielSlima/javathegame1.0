import java.util.Scanner;
class jogador
{
  String nick;
  int pontuacao;
  int ver_pontuacao()
  {
    return pontuacao;
  }
}
class partida
{	
	//for(int i = 0; )
	String jogadores, perguntas, respostas;
	int vencedor;
	void apresentar(int qnt)
	{
		int quantidade = qnt;
		System.out.println(qnt + " eh a quantidade de jogadores!");
	}

}
public class game
{
  public static void main (String args[])
  {
    Scanner reader = new Scanner(System.in);
    int quantidade_jogadores = 0;

    //ENQUANTO FOR VERDADE 
    while(true)
    {
      //PEDIR A QUANTIDADE DE JOGADORES
      System.out.println("Qual a quantidade de jogadores ?");
      quantidade_jogadores = reader.nextInt();

      //SE A QUANTIDADE DE JOGADORES FOR DIFERENTE DE 0 E MENOR OU IGUAL A 4 SAIR DO LOOPING "INFINITO"
      if(quantidade_jogadores != 0 && quantidade_jogadores <=4 && quantidade_jogadores >=2) break;
      
      //SE A QUANTIDADE DE JOGADORES FOR MAIOR QUE 4 CONTINUAR
      if(quantidade_jogadores > 4)System.out.println("A quantidade maxima de jogadores eh 4!");continue;
    }

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
    }
	System.out.println(players.getClass().getName());
	//partida part = new partida();
	//part.apresentar(players);

  } //VOID 
} //CLASS
