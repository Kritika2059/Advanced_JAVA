class kritikaException extends Exception {

    public kritikaException(String message) {

        super(message);

    }

}

public class throw1 {

    public static void main(String[] args) {
        int i = 50;
        int j = 0;

        try{
            j = 18/i;

            if (j == 0 ){
                throw new kritikaException("I don't want to print Zero");
            }
        }

        catch(ArithmeticException e){
            j = 18/1;
            System.out.println(e);
        }

        catch(Exception e){
            j = 18/1;
            System.out.println(e);
        }

        System.out.println(j);
    }

}