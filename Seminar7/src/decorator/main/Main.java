package decorator.main;

import decorator.clase.Decorator;
import decorator.clase.DecoratorAbstract;
import decorator.clase.IImprimanta;
import decorator.clase.ImprimantaDeBilete;

public class Main {
    public static void main(String[] args) {
        IImprimanta imprimanta= new ImprimantaDeBilete(5);
        imprimanta.printeaza();
        DecoratorAbstract decorator= new Decorator("pastem fericiti", imprimanta);
        decorator.printeaza();
        decorator.printeazaVerso();
    }
}
