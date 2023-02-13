package codingedu.Data_and_operation;

// 각 데이터 타입에 맞는 연산자를 가지고 있다.

public class Datatype {
    public static void main(String[] args) {
        System.out.println(6); // Number
        System.out.println("six"); // String

        System.out.println("6"); // String 6

        System.out.println(6 + 6); // 12
        System.out.println("6" + "6");// 66 결합연산자 => 문자열

        System.out.println(6 * 6); // 36
        // System.out.println("6" * "6");
        System.out.println("1111".length());
        // System.out.println(1111.length()); // 숫자열은 길이 측정 연산자 없음
    }
}