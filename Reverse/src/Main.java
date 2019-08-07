public class Main {

    public String main (String input) {

        StringBuilder builder = new StringBuilder(input);

        String reverse = builder.reverse().toString();


        return reverse += input;
    }
}
