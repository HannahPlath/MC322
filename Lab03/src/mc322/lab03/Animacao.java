package mc322.lab03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Animacao {
	int aquario;
	int lombriga;
	int posicao;
	String sequencia;
	AquarioLombriga estado;
	
	Animacao(String sequencia) {
		
		Pattern pattern = Pattern.compile("([0-9][0-9])([0-9][0-9])([0-9][0-9])([^0-9]*)");
		Matcher matcher = pattern.matcher(sequencia);
		if (matcher.find()) {
		   aquario = Integer.parseInt(matcher.group(1));
		   lombriga = Integer.parseInt(matcher.group(2));
		   posicao = Integer.parseInt(matcher.group(3));
		   this.sequencia = matcher.group(4);
		}
		estado = new AquarioLombriga(aquario, lombriga, posicao);
	}
	
	String apresenta() {
		String figura = estado.apresenta();
		return figura;
	}
	boolean passo() {
		Pattern pattern = Pattern.compile("([^0-9])([^0-9]*)");
		Matcher matcher = pattern.matcher(sequencia);
		if (matcher.find()) {
		    switch(matcher.group(1)) {
		    case "C": estado.crescer(); break;
		    case "M": estado.mover(); break;
		    case "V": estado.virar(); break;
		    }
		    sequencia = matcher.group(2);
		    return true;
		}
		else {
			return false;
		}
	}

}
