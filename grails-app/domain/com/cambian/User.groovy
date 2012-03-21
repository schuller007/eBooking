package com.cambian

class User {

	String login
	String password
	String firstName
	String lastName
	String title="Dr."
	String role="GP"

	static constraints = {
		login blank:false, email: true, unique:true
		password password:true, blank:false, matches:/[\S]+/
		firstName blank:false
		lastName  blank:false
		title	  blank:false
		role(inList:["GP", "Admin", "Surgeon"])
	}
	
	String toString() {
		title + " " + firstName + " " + lastName
	}
}
