package chapt02;

public class User {
    /**
     * personal user's code
     */

    private int numericCode;
    /**
     * user's password
     */

    private String password;
    /**
     * see also chapter #3 "Classes"
     */

    public User() {
        password = "default";
    }
    /**
     * @return the numericCode
     * return the numericCode
     */
    public int getNumericCode(){
        return numericCode;
    }
    /**
     * @param numericCode the numericCode to set
     *                    paramentr numericCode to set
     */
    public void setNumericCode(int numericCode){
        this.numericCode = numericCode;
    }
    /**
     * @return the password
     * return the password
     */

    public String getPassword(){
        return password;
    }

    /**
     * @param password the password to set parameter password to set
     */

    public void setPassword(String password){
        this.password = password;
    }
}
