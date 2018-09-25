import java.util.Scanner;
class jogador
{
  String nick;
  int pontuacao;
  void ver_pontuacao()
  {
    //return nick;
    System.out.println(nick);
  }
}
class partida
{
    	Scanner reader = new Scanner(System.in);
    	int quantidade_jogadores = 0;
	int[] valores_perguntas  = {"1","2","3","4","5"};
	//String[] Perguntas = {"Questao 1", "Questao 2"};
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
        //for(int i = 0; i <players.length;i++)players[i].ver_pontuacao();
	//Atribuindo valores para as variaveis 
	for(int i = 0; i<valores_perguntas.length;i++)
	{
		if(valores_perguntas[i] == null) continue;
		
	}
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
