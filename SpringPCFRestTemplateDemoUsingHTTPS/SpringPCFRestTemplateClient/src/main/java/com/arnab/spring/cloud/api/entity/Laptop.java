package com.arnab.spring.cloud.api.entity;

public class Laptop {

	private String brand;
	private String model;
	private String serialNo;
	private double price;
	private String cpu;
	private String ram;
	private String hdd;

	public Laptop() {
		super();
	}

	public Laptop(String brand, String model, String serialNo, double price, String cpu, String ram, String hdd) {
		super();
		this.brand = brand;
		this.model = model;
		this.serialNo = serialNo;
		this.price = price;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

}
