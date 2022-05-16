
@FunctionalInterface
interface MyReverseInterface {

    public String reverse(String rev);
}


public class Reverse {
    public static void main(String[] args) {
        MyReverseInterface reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);

            }
            return result;
        };
        System.out.println("Lambda reversed : " + reverse.reverse("Megha Sharma"));
    }

}
