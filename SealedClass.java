//if we want that only certain class can inherit class A then there is a Sealed Class
sealed class As permits Bs,Cs {

}
//the permitted class should be sealed, non-sealed or final class
non-sealed class Bs extends As { //sealed, non-sealed or final

}

final class Cs extends As {

}

class Ds { //D cannot extend class A

}


public class SealedClass {
    public static void main(String[] args) {}

}