package com.sunbeam.tester;

import com.sunbeam.invoice.Invoice;

public class InvoiceTester {

	public static void main(String[] args) {
		Invoice in= new Invoice();
		System.out.println("earlier quant : "+in.getQuant());
		in.setQuant(4);
		System.out.println("new quant : "+in.getQuant());
		
		System.out.println("earlier price : "+in.getPrice());
		in.setPrice(350);
		System.out.println("new price : "+in.getPrice());
		
		in.calculateInvoice();
		System.out.println("invoice is "+in.calculateInvoice());
	}

}
