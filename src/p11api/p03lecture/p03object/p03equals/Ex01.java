package p11api.p03lecture.p03object.p03equals;

public class Ex01 {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		 
		//equals는 boolean이다.
		//
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		//재정의하지않은 참조값을 알려줌
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}
}
