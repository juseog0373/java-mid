package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address addr1 = new Address("서울");
        Address addr2 = addr1;

        System.out.println("addr1 = " + addr1);
        System.out.println("addr2 = " + addr2);

        addr1.setValue("부산");

        System.out.println("addr1 = " + addr1);
        System.out.println("addr2 = " + addr2);
    }
}
