package p11api.p03lecture.p03object.p01toString;

public class Ex04 {

	public static void main(String[] args) {
		
		CarDTO dto1 = new CarDTO();
		
		dto1.setId(1);
		dto1.setModel("model13");
		dto1.setCompany("testla");
		dto1.setPrice(300000);
		
		System.out.println(dto1);
	}
}
