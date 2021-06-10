package batalla;

public class Coordenada {
	private int x;
	private int y;
	private boolean tocada = false;
	
	public Coordenada(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	

	public void setX(int x) {
		this.x = x;
	}
	

	public int getX() {
		return x;
	}

	

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	
	public boolean isTocada() {
		return tocada;
	}


	public void setTocada(boolean tocada) {
		this.tocada = tocada;
	}


	

}