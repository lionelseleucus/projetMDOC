package MDOC.Domain;
import java.util.Set;

public class Contact {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Address adresse;
	private Set<ContactGroup> books;
	private Set<PhoneNumber> Numbers;
	private int version;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the add
	 */
	public Address getAdd() {
		return adresse;
		 
	}
	/**
	 * @param add the add to set
	 */
	public void setAdd(Address add) {
		adresse = add;
	}
	/**
	 * @return the books
	 */
	public Set<ContactGroup> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(Set<ContactGroup> books) {
		this.books = books; 
	}
	/**
	 * @return the Numbers
	 */
	public Set<PhoneNumber> getNumbers() {
		return Numbers;
	}
	/**
	 * @param Numbers the Numbers to set
	 */
	public void setNumbers(Set<PhoneNumber> Numbers) {

	}
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", adresse=" + adresse
				+ ", Numbers=" + Numbers + "]";
	}	
	
}
