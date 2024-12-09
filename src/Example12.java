public class Example12 {
    public static void main(String[] args) {
        int number = -1;

        number = (number < 0) ? -number :number;

        if(number < 0)
        {
            number = -number;
        }
        Math.abs( number);
        System.out.println(number);
    }
}
