public class PhoneNumber {
    private String phonenumber;
    private static String isPhoneValidRegexBG = "^(\\+359|00359|0)(87|88|89)[2-9][0-9]{6}";

    public PhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }



}
