package com.blessing.qa.RequestPojo;

public class CreateBooking {
private String firstname;
private String lastname;
private String totalprice;
private Boolean depositpaid;
private String additionalneeds;
private BookingDates bookingdates;
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
public String getTotalprice() {
	return totalprice;
}
public void setTotalprice(String totalprice) {
	this.totalprice = totalprice;
}
public Boolean getDepositpaid() {
	return depositpaid;
}
public void setDepositpaid(Boolean depositpaid) {
	this.depositpaid = depositpaid;
}
public String getAdditionalneeds() {
	return additionalneeds;
}
public void setAdditionalneeds(String additionalneeds) {
	this.additionalneeds = additionalneeds;
}
public BookingDates getBookingdates() {
	return bookingdates;
}
public void setBookingdates(BookingDates b) {
	this.bookingdates = b;
}



}
