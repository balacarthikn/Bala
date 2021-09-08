package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("CompanyName is greens");
	}
	public void companyId() {
		System.out.println("companyId is 7");
	}
	public void companyAddress() {
		System.out.println("CompanyAddress is chennai");
	}
	public static void main(String[] arrgs) {
		//ClassName objectName = new ClassName();
		CompanyInfo greens = new CompanyInfo();
		CompanyInfo no = new CompanyInfo();
		CompanyInfo chennai = new CompanyInfo();
		//objectName.MethodName
		greens.companyName();
		no.companyId();
		chennai.companyAddress();
	}

}
