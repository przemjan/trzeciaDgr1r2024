public class StringiDemo {
    public static void main(String[] args) {

        String name = "Zdzisiek";
        int dlugosc = name.length();

        char inicjal = name.charAt(3);
        System.out.println(inicjal);
        String duze, male;

        duze = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name);
    }

}
