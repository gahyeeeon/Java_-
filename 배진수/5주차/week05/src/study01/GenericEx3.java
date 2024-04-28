package study01;

class FruitBox2<T> {
    private T[] fruit;

    public FruitBox2(T[] fruit) {
        this.fruit = fruit;
    }

    public T getFruit(int index) {
        return fruit[index];
    }
}
public class GenericEx3 {
    public static void main(String[] args) {
        // 1. 컴파일 타임에 타입 검사를 통해 예외 방지
        Apple[] arr = {
                new Apple(),
                new Apple()
        };
        FruitBox2<Apple> box = new FruitBox2<>(arr);

        Apple apple = (Apple) box.getFruit(0);
        //Banana banana = (Banana) box.getFruit(1);

        // 2. 불필요한 캐스팅을 없애 성능 향상
//        Apple[] arr1 = { new Apple(), new Apple(), new Apple() };
//        FruitBox2 box1 = new FruitBox2(arr1);
//
//        // 가져온 타입이 Object 타입이기 때문에 일일히 다운캐스팅을 해야함 - 쓸데없는 성능 낭비
//        Apple apple1 = (Apple) box1.getFruit(0);
//        Apple apple2 = (Apple) box1.getFruit(1);
//        Apple apple3 = (Apple) box1.getFruit(2);

        // 미리 제네릭 타입 파라미터를 통해 형(type)을 지정해놓았기 때문에 별도의 형변환은 필요없다.
        FruitBox2<Apple> box1 = new FruitBox2<>(arr);

        Apple apple1 = box1.getFruit(0);
        Apple apple2 = box1.getFruit(1);
        Apple apple3 = box1.getFruit(2);
        // 미리 제네릭 타입 파라미터를 통해 형(type)을 지정해놓았기 때문에 별도의 형변환은 필요없다.

    }
}
