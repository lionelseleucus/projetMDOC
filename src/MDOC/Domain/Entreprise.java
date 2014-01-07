package MDOC.Domain;

public class Entreprise extends Contact{

	private int numSiret;

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numSiret
	 */
	public int getNumSiret() {
		return numSiret;
	}

	/**
	 * @param numSiret the numSiret to set
	 */
	public void setNumSiret(int numSiret) {
		this.numSiret = numSiret;
	}
}
