package _collections;

import java.util.Objects;

public class Coche {

	private enum color{
		RO,NA,AM,VE,AZ,IN,VI;
	}
	
	private enum marca{
		WV,AM,BM,AU,PE;
	}
	
	private Marca marca;
	private Color color;
	
	
	public Coche(Marca marca, Color color) {
		super();
		this.marca = marca;
		this.color = color;
	}

	public Coche() {
		super();
		this.marca = Marca.aleatorio();
		this.color = Color.aleatorio();
	}

	public Marca getMarca() {
		return marca;
	}


	public Color getColor() {
		return color;
	}


	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca;
	}
	
	
	
}
