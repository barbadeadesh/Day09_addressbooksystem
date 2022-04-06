package com.bridgelab.addressbook09;

public class ContactsDetails {
	private String firstname, lastname, address, city, state, email;
	private int zip;
	private int phonenumber;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String toString() {
		return "Contact details:" + "\n" + "FirstName=" + firstname + "\n" + "LastName=" + lastname + "\n" + "City="
				+ city + "\n" + "State=" + state + "\n" + "Zip=" + zip + "\n" + "Address=" + address + "\n"
				+ "PhoneNumber=" + phonenumber + "\n" + "Email=" + email;

	}

}
