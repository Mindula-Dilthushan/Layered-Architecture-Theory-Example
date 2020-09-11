package DipendancyInjection.ConstructorInjection;

public class B {
    SuperA superA; //Property

    public B(A superA){
        this.superA = superA;
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.ConstructorInjection();
    }

}
