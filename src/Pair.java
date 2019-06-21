public class Pair implements Comparable<Pair> {
    private PhoneNumber phonenumber;
    private String name;
    private int inCallsCount;
    private int outCallsCount;


    public Pair(PhoneNumber phonenumber, String name) {
        this.phonenumber = phonenumber;
        this.name = name;
        this.inCallsCount = 0;
        this.outCallsCount = 0;

    }
    public int increaseInCalls(){
        return ++inCallsCount;
    }
    public int increaseOutCalls(){
        return ++outCallsCount;
    }

    public PhoneNumber getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(PhoneNumber phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pair o) {
        return this.getName().compareTo(o.getName());
    }
}
