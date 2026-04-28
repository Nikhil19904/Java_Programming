public class Main {
    public static void main(String[] args) {
        String name = "NikhilSur";
        int count = name.length();

        if (count == 10) {
            System.out.println("valid");
        }

        else if (count > 10) {
            System.out.println("invalid");
        }

        else {
            System.out.println("Correct");
        }

    }
}
