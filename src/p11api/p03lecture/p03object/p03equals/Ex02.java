package p11api.p03lecture.p03object.p03equals;

public class Ex02 {
	public static void main(String[] args) {
	
		Book b1 = new Book("자바다", "신");
		Book b2 = new Book("python", "son");
	}
}

class Book{
	private String title;
	private String writer;
	
	Book(String title, String writer){
		this.title = title;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + "]";
	}
	
	
}