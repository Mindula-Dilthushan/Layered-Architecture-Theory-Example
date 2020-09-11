package DipendancyInjection.PropertyInjection;

public class B {
    static SuperA superA = new A();

    public static void main(String[] args) {
        superA.PropertyInjection();
    }
}
