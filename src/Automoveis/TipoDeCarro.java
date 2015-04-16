package Automoveis;

public enum TipoDeCarro {
	
	SEDAN("Sedan"),
	HATCH("Hatch"),
	PICAPE("Picape"),
	CONVERSIVEL("Conversivel"),
	COMERCIAL("Comercial");
	
	private final String tipo;
     
    private TipoDeCarro(String tipo){
    	this.tipo = tipo;
    }	     

    public String tipo(){         
        return tipo;
    }
};
