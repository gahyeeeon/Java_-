package chap2;

public class exam7 {
	class FruitBox {
	    public static void method(List<? super Fruit> item) {
	        // 안전하게 꺼내려면 Object 타입으로만 받아야한다
	        Object f1 = item.get(0);

	        Food f2 = (Food) item.get(0); // ! 잠재적 ERROR
	        Fruit f3 = (Fruit) item.get(0); // ! 잠재적 ERROR
	        Apple f4 = (Apple) item.get(0); // ! 잠재적 ERROR
	        Banana f5 = (Banana) item.get(0); // ! 잠재적 ERROR
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        List<Food> foods = new ArrayList<>(
	                Arrays.asList(new Food(), new Food(), new Food())
	        );
	        FruitBox.method(foods);
	    }
	}
}
