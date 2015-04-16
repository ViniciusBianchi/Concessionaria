package Automoveis;

public enum TipoDeMoto {
	
	SCOOTER("Scooter"),
	ESPORTIVA("Esportiva"),
	CHOPPER("Chopper"),
	OFFROAD("Off-Road"),
	SIDECAR("Side Car");
	
	private final String tipo;
     
    private TipoDeMoto(String tipo){
    	this.tipo = tipo;
    }	     

    public String tipo(){         
        return tipo;
    }
}
