package mc322.lab03;

public class AppLab03 {

	public static void main(String[] args) {
		Animacao sequencia = new Animacao("080403MCMVM");
		
		do System.out.println(sequencia.apresenta()); while(sequencia.passo());
	}
}
