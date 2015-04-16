package Automoveis;

public enum Cambio {
	
	AUTOMATICO("Automatico"),
	SEMIAUTOMATICO("Semi-Automático"),
	MANUAL("Manual");
	
	private final String cambio;
     
    private Cambio(String cambio){
    	this.cambio = cambio;
    }	     

    public String tipoDeCambio(){         
        return cambio;
    }
}
