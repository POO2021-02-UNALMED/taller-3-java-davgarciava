package taller3.televisores;

public class TV {
	private static int numTV = 0;
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		TV.numTV++;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getNumTV() {
		return TV.numTV;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if(this.estado == true && this.canal < 120) {
			this.canal++;
		}
	}
	
	public void canalDown() {
		if(this.estado == true && this.canal > 1) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if(this.estado == true && this.volumen < 7) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if(this.estado == true && this.volumen > 0) {
			this.volumen--;
		}
	}
}
