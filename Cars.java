package cars1;

import java.util.List;



public class Cars {
	static List <Cars> cars;
	
	private int price;
	private String country;
	private String brand;
	private String name;
	
	public Cars(int price, String country, String brand, String name) {
		this.setPrice(price);
		this.setCountry(country);
		this.setBrand(brand);
		this.setName(name);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	}

