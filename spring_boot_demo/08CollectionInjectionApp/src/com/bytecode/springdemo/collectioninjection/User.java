package com.bytecode.springdemo.collectioninjection;

import java.util.Set;

public class User {
    private Set<String>  phones;

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
}
