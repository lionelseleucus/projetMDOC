package MDOC.Domain;

import java.util.ArrayList;

public class ContactGroup {

	private int groupId;
	private String groupName;
	private ArrayList<ContactGroup> books;
	private int version;

	/**
	 * @return the groupId
	 */
	public int getGroupId() {
		return groupId;
	}
	/**
	 * @return the books of contacts
	 */
	public ArrayList<ContactGroup> getBooks() {
		return books;
	}
	/**
	 * @param books the books of contacts to set
	 */
	public void setBooks(ArrayList<ContactGroup> books) {
		this.books = books;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
}
