package DipendancyInjection.InterfaceThroughInjection;

public class B implements ITI{
    SuperA superA;

    @Override
    public void inject(A a) {
        this.superA = a;
    }
    public  void bInterfaceThroughInjection(){
        this.superA.InterfaceThroughInjection();
    }

    public static void main(String[] args) {
        A superA = new A();
        B b = new B();
        b.inject(superA);
        b.bInterfaceThroughInjection();
    }
}
