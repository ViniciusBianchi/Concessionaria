package Automoveis;

public class Motocicleta {
	
	private String chassi;
	private String montadora;
	private String modelo;
	private TipoDeMoto tipo;
	private Cor cor;
	private int cilindrada;
	private float capacidadeDoTanque;
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
	
	public TipoDeMoto getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoDeMoto tipo) {
		this.tipo = tipo;
	}
	
	public Cor getCor() {
		return cor;
	}
	
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public float getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}
	
	public void setCapacidadeDoTanque(float capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public Motocicleta(){		
	}
	
	public Motocicleta(String chassi, String montadora, String modelo, TipoDeMoto tipo, Cor cor, int cilindrada, float capacidadeDoTanque, float preco){
		setChassi(chassi);
		setMontadora(montadora);
		setTipo(tipo);
		setCor(cor);
		setCilindrada(cilindrada);
		setCapacidadeDoTanque(capacidadeDoTanque);
		setPreco(preco);
	}
	
	public boolean equals (Object obj){		
		
		if(obj instanceof Motocicleta){
			Motocicleta m = (Motocicleta) obj;
			return this.getChassi().equals(m.getChassi());
		}
		else{
			return false;
		}
	}
}
