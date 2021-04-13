package mc322.lab03;

public class AquarioLombriga {
	int aquarioDireita;
	int aquarioEsquerda;
	int lombriga;
	String sentido;
	
	AquarioLombriga(int aquario, int lombriga, int posicao){
		// default direita
		sentido = "direita";
		if(lombriga > aquario){
			aquario = lombriga;
		}
		this.lombriga = lombriga;
		aquarioDireita = aquario - (lombriga + posicao - 1);
		if(aquarioDireita < 0){
			posicao = 1;
			aquarioDireita = aquario - (lombriga + posicao - 1);
		}
		aquarioEsquerda = posicao - 1;
	}
	
	void crescer(){
		switch(sentido) {
		case "direita":
			if(aquarioEsquerda > 0){
				aquarioEsquerda -= 1;
				lombriga += 1;
			} break;
		case "esquerda":
			if(aquarioDireita > 0) {
				aquarioDireita -= 1;
				lombriga += 1;
			} break;
		}
	}
	
	void mover(){
		switch(sentido){
		case "direita":
			if(aquarioDireita > 0){
				aquarioDireita -= 1;
				aquarioEsquerda += 1;
			}
			else{
				virar();
			}
			break;
		case "esquerda":
			if(aquarioEsquerda > 0) {
				aquarioEsquerda -= 1;
				aquarioDireita += 1;
			}
			else{
				virar();
			}
			break;
		}
	}
	
	void virar(){
		if(sentido.equals("direita")){
			sentido = "esquerda";
		}
		else{
			sentido = "direita";
		}
	}
	
	String apresenta(){
		String estado = "";
		estado = estado + "#".repeat(aquarioEsquerda);
		if(sentido.equals("direita")){
			estado = estado + "@".repeat(lombriga-1);
			estado = estado + "O";
		}
		else{
			estado = estado + "O";
			estado = estado + "@".repeat(lombriga-1);
		}
		estado = estado + "#".repeat(aquarioDireita);
		return estado;
	}
}
