package ex36;

import java.io.*;

// 역직렬화가 허용되는 클래스
class SuccessDeserializer implements Serializable {
}

// 역직렬화가 비 허용 되는 클래스
class NegativeDeserializer implements Serializable {
}

public class DeserializationFilters {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SuccessDeserializer successObj = new SuccessDeserializer();
        NegativeDeserializer nagativeObj = new NegativeDeserializer();

        String filename = "filter.ser";

        // 직렬화 -------------------
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)));
        out.writeObject(successObj);
        out.writeObject(nagativeObj);
        out.close();

        // 역직렬화 -------------------
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)));

        // 1. 역직렬화 필터 만들기
        ObjectInputFilter filter = (filterInfo) -> {
            Class<?> classObj = filterInfo.serialClass();
            // 화이트 리스트
            if (classObj.getSimpleName().equals("SuccessDeserializer")) {
                System.out.println("Allow :" + classObj.getSimpleName());
                return ObjectInputFilter.Status.ALLOWED; // SuccessDeserializer 클래스일 경우 허용
            }

            System.out.println("Rejected :" + classObj.getSimpleName());
            return ObjectInputFilter.Status.REJECTED; // 그 이외에는 거절
        };

        // 2. 역직렬화 필터 등록
        in.setObjectInputFilter(filter);

        // 3. 필터 적용된 채로 역직렬화
        Object obj1 = in.readObject();
        Object obj2 = in.readObject();

        System.out.println("Class Name: " + obj1.getClass().getSimpleName());
        System.out.println("Class Name: " + obj2.getClass().getSimpleName());

        in.close();
    }
}
