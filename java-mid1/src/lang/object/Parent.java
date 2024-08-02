package lang.object;

// 부모 클래스를 아무것도 상속받지 않으면, 자바에서는 묵시적으로 Object 클래스를 상속받게 된다.
// extends Object 와 동일한 코드이다.
// 자바에서 모든 객체의 최종 부모는 Object 이다.
public class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
