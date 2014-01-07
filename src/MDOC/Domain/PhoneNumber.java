package MDOC.Domain;

public class PhoneNumber {

	private int id;
	private String phoneKind;
	private String phoneNumber;
	private Contact contact;
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
	 * @return the phoneKind
	 */
	public String getPhoneKind() {
		return phoneKind;
	}
	/**
	 * @param phoneKind the phoneKind to set
	 */
	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
