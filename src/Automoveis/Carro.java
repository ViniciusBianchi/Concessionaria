package Automoveis;

public class Carro {
	
	private String chassi;
	private String montadora;
	private String modelo;
	private TipoDeCarro tipo;
	private Cor cor;
	private float motorizacao;
	private Cambio cambio;
	private float preco;
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public String getMontadora() {
		return montadora;
	}
	
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public TipoDeCarro getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoDeCarro tipo) {
		this.tipo = tipo;
	}
	
	public Cor getCor() {
		return cor;
	}
	
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public float getMotorizacao() {
		return motorizacao;
	}
	
	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}
	
	public Cambio getCambio() {
		return cambio;
	}
	
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public Carro(){		
	}
	
	public Carro(String chassi, String montadora, String modelo, TipoDeCarro tipo, Cor cor, float motorizacao, Cambio cambio, float preco){
		setChassi(chassi);
		setMontadora(montadora);
		setTipo(tipo);
		setCor(cor);
		setMotorizacao(motorizacao);
		setCambio(cambio);
		setPreco(preco);
	}
	
	public boolean equals (Object obj){
		
		if(obj instanceof Carro){
			Carro c = (Carro) obj;
			return this.getChassi().equals(c.getChassi());
		}
		else{
			return false;
		}
	}	
}
