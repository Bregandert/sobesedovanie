package HW2;

public class Test2  {
    static final int AMOUNT_OF_ELEMENTS = 10;
    static final int MIN_NUMBER = 0;
    static final int MAX_NUMBER = 10;

    public static void main(String[] args) {

        ArrayList array = new ArrayList(AMOUNT_OF_ELEMENTS);
        for (int i = 0; i < AMOUNT_OF_ELEMENTS; i++) {
            int randomNumber = MIN_NUMBER + (int) (Math.random() * MAX_NUMBER);
            array.add(randomNumber);
        }
        array.display();
    }
}
