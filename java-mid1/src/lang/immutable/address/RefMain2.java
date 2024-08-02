package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조 값 대입을 막을 수 있는 방법이 없다. 자바 문법상 가능하기 때문.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
