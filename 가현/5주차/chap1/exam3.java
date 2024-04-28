package chap1;
//ClassCastException 런타임 에러
public class exam3 {

	class Apple {}
	class Banana {}

	class FruitBox {
	    // 모든 클래스 타입을 받기 위해 최고 조상인 Object 타입으로 설정
	    private Object[] fruit;

	    public FruitBox(Object[] fruit) {
	        this.fruit = fruit;
	    }

	    public Object getFruit(int index) {
	        return fruit[index];
	    }
	}
	
	public static void main(String[] args) {
	    Apple[] arr = {
	            new Apple(),
	            new Apple()
	    };
	    FruitBox box = new FruitBox(arr);

	    Apple apple = (Apple) box.getFruit(0);
	    Banana banana = (Banana) box.getFruit(1);
	}
}
