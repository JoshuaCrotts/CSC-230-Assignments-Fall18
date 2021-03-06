package assignment3_q1;

/**
 * This class is for Question 1 of the third assignment regarding objects. A
 * class with 3 fields, accessor/mutator methods and an overriden toString()
 * method are implemented.
 *
 * @author Joshua Crotts September 24, 2018
 */
public class Author {

    private String name;
    private String email;
    private char gender;

    /**
     * Creates an Author object
     *
     * @param name - name of author
     * @param email - email of author
     * @param gender - char of author, M or F
     */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    /**
     * @return the name of the Author
     */
    public String getName() {
        return name;
    }

    /**
     * @return the email of the Author
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @return the gender of the author
     */
    public char getGender() {
        return gender;
    }

    /**
     * Sets the email of the author
     * @param email string parameter to be email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Overrides the toString method in Object to print out instance vars of Author
     * @return 
     */
    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", email=" + email + ", gender=" + gender + '}';
    }

    public static void main(String[] args) {
        Author sipser = new Author("Michael Sipser", "msipser@mit.edu", 'm');

        System.out.println(sipser);
    }
}
