package e.ui;

public class Bus{
	
	public static int totalId = 0;
	
	private int number;
	private int id;
	private String color;
	private String company;
	private int price;

	
	public void print() {
		System.out.println("Bus: (number- "+ number + "color- "+ color + "company- "+ company+ "price- "+ price + " id- " + id + ")" );
		
	}
	
	
	
	@Override
	public String toString() {
		return "Bus [number=" + number + ", color=" + color + ", company=" + company + ", price=" + price + ", id=" + id+"]";
	}



	public Bus() {
		totalId++;
		this.id=totalId;
		
	}

	public Bus(int number, String color, String company, int price) {
		totalId++;
		this.id=totalId;
setNumber(number);
setColor(color);
setCompany(company);
setPrice(price);

	}
	
	public Bus(Bus b) {
		totalId++;
		this.id=totalId;
setNumber(number);
setColor(color);
setCompany(company);
setPrice(price);

	}
	


	public void setNumber(int number) {
		if (number >= 0) {
			this.number = number;
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumber() {
		return number;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
