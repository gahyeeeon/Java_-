package chap2;

public class exam6 {
	class FruitBox {
	    public static void method(List<? extends Fruit> item) {
	        // 안전하게 꺼내려면 Fruit 타입으로만 받아야한다
	        Fruit f1 = item.get(0);

	        Apple f2 = (Apple) item.get(0); // ! 잠재적 ERROR
	        Banana f3 = (Banana) item.get(0); // ! 잠재적 ERROR
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        List<Banana> bananas = new ArrayList<>(
	                Arrays.asList(new Banana(), new Banana(), new Banana())
	        );
	        FruitBox.method(bananas);
	    }
	}
}
