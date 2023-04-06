import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private final String emailRegex = "^(.+)@(.+).com$";
    private final Pattern pattern = Pattern.compile(emailRegex);

    public Customer(String firstName, String lastName, String email) {
        if(!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
