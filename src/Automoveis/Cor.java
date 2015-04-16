package Automoveis;

public enum Cor {
	
	VERMELHO("Vermelho"),
	AMARELO("Amarelo"),
	VERDE("Verde"),
	AZUL("Azul"),
	PRETO("Preto"),
	PRATA("Prata");
	
	private final String cor;
     
    private Cor(String cor){
    	this.cor = cor;
    }	     

    public String nomeDaCor(){         
        return cor;
    }
};
