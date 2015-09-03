package com;

public class Order {
	private String date;
	private String status;
	
	private NewCustomer customer = new NewCustomer();
	private int payment;
	private OrderDetail orderdetail = new OrderDetail();
	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public NewCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(NewCustomer customer) {
		this.customer = customer;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public OrderDetail getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(OrderDetail orderdetail) {
		this.orderdetail = orderdetail;
	}
`	public void calcTax(){
	}
	public void calcTotal(){
	}
	public void calctotalWeight(){
	}
	
	

}
