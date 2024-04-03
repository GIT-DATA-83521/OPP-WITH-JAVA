package com.sunbeam.invoice;

public class Invoice {

	private String partno;
	private String partdesc;
	private int quant;
	private double price;

	public Invoice() {
		System.out.println("Inside parameterless constr");
	}

	public Invoice(String partno, String partdesc, int quant, double price) {
		super();
		this.partno = partno;
		this.partdesc = partdesc;
		this.quant = quant;
		this.price = price;
	}

	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getPartdesc() {
		return partdesc;
	}

	public void setPartdesc(String partdesc) {
		this.partdesc = partdesc;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		if(quant<0)
		{
			quant=0;
		}
		this.quant = quant;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price <0)
		{
			price=0.0;
		}
		this.price = price;
	}
	
	public double calculateInvoice() {
		return price*quant;
	}
	

	
	
}
