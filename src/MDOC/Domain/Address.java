package MDOC.Domain;

public class Address {
	private int 	id;
	private String Street;
	private String City;
	private String zip;
	private String Country;
	private int version;

	public Address() {
		super();
	}

	public Address(int id, String street, String city, String zip, String country) {
		super();
		this.id = id;
		Street = street;
		City = city;
		this.zip = zip;
		Country = country;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return Street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		Street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", Street=" + Street + ", City=" + City
				+ ", zip=" + zip + ", Country=" + Country + "]";
	}
	
}
