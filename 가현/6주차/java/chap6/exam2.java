package chap6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class exam2 {
	class Fruit {}

	class Apple extends Fruit {
	    int count;

	    public Apple(int count) {
	        this.count = count;
	    }
	}
	class Banana extends Fruit {
	    int count;

	    public Banana(int count) {
	        this.count = count;
	    }
	}

	class Constructor {
	    public static Map<String, Function<Integer, Fruit>> map = new HashMap<>();

	    static {
	        map.put("apple", Apple::new);
	        map.put("banana", Banana::new);
	    }

	    public static Fruit makeFruit(String name, int count) {
	        if(map.containsKey(name)) {
	            return map.get(name.toLowerCase()).apply(count);
	        }
	        return null;
	    }
	}
}
