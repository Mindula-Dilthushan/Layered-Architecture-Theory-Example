package DipendancyInjection.SetterMethodInjection;

public class B {
    SuperA superA; //Property

    public void setInjection(A superA){
        this.superA = superA;
    }
    public void aSetterMethodInjection(){
        this.superA.SetterMethodInjection();
    }

    public static void main(String[] args) {
        A superA = new A();
        B b = new B();
        b.setInjection(superA);
        b.aSetterMethodInjection();
    }

}

