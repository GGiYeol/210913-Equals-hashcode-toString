package p11api.p03lecture.p03object.p01toString;

public class CarDTO {

	private String model;
	private String company;
	private int price;
	private long id;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public CarDTO() {
		super();
	}
	@Override
	public String toString() {
		return "CarDTO [model=" + model + ", company=" + company + ", price=" + price + ", id=" + id + "]";
	}
	
	//사람이 알아보기위해서는 toString을 ㅗ 만들어야한다
	//자주 재정의를 하니까 generate에 toString을 재정의하는것이 있다
	
	
}
