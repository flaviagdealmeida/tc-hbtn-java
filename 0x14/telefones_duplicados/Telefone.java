import java.util.Objects;

public class Telefone {

	private String codigoArea;
	private String numero;

	public Telefone() {

	}

	public Telefone(String codigoArea, String numero) {
		super();
		this.codigoArea = codigoArea;
		this.numero = numero;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "(" + codigoArea + ") " + numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoArea, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(codigoArea, other.codigoArea) && Objects.equals(numero, other.numero);
	}
}

