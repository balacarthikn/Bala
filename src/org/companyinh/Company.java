package org.companyinh;

import org.client.Client;

public class Company extends Client {
	public void companyName() {
		// TODO Auto-generated method stub
       System.out.println("Company name is Arabian");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.companyName();
		c.clientName();
	}

}
