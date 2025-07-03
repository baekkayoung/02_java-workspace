package com.kh.chap01_ploy.part02_electronic.model.vo;

public class NoteBook extends Electrionic{
	
	private int usbPort;
	
	public NoteBook() {}
	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort=usbPort;
	}
	
	public int setUsbPort() {
		return usbPort;
	}
	
	public void getUsbPort(int usbPort) {
		this.usbPort= usbPort;
	}
	
	public String toString() {
		return super.toString() + ","+ usbPort ;
	}
	
	
}
