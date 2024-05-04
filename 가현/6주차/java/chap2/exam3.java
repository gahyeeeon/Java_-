package chap2;

public class exam3 {
	class Person {
	    private Phone phone;
	    private String name; // 생성자에서 초기화를 함

	    Person(String name) {
	        this.name = name;
	    }

	    public Phone getPhone() {
	        return this.phone;
	    }
	}

	class Phone {
	    private OS os; // 생성자에서 초기화를 안함

	    public OS getOS() {
	        return this.os;
	    }
	}

	class OS {
	    public String printOS() {
	        return "Android";
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Person p = new Person("홍길동");
	        
	        p.getPhone().getOS().printOS(); // person의 Phone을 얻고 그 Phone의 OS를 얻고 OS명을 출력하는 함수 체이닝
	    }
	}
}
