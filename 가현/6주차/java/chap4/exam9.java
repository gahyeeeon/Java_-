package chap4;

import java.util.function.Function;

public class exam9 {
	class Member {
	    private String name;
	    private Address address; // Address 객체를 합성(composition)

	    public Member(String name, Address address) {
	        this.name = name;
	        this.address = address;
	    }

	    public String getName() { return name; }

	    public Address getAddress() { return address; }
	}

	class Address {
	    private String country;
	    private String city;

	    public Address(String country, String city) {
	        this.country = country;
	        this.city = city;
	    }

	    public String getCountry() { return country; }

	    public String getCity() { return city; }
	}
	
	public static void main(String[] args) {

	    Member member = new Member("홍길동", new Address("조선", "한양"));

	    // Member 매개타입과 Address 리턴타입
	    Function<Member, Address> f = x -> x.getAddress(); // Address 객체를 얻기

	    // Address 매개타입과 String 리턴타입
	    Function<Address, String> g = x -> x.getCity(); // city 문자열 얻기

	    // f(g(x))
	    Function<Member, String> fg = f.andThen(g);
	    String city = fg.apply(member); // Address 객체를 얻고(f 실행), Address 객체에서 city 필드값을 얻기(g 실행)
	    System.out.println("거주 도시 : " + city);

	    fg = g.compose(f);
	    city = fg.apply(member);
	    System.out.println("거주 도시 : " + city);
	}
}
