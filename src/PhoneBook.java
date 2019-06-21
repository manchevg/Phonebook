
import javafx.util.Pair;

import java.util.TreeSet;


public class PhoneBook implements IPhoneBook {


    private TreeSet<Pair> allPairs;


    private boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^(\\+359|00359|0)(87|88|89)[2-9][0-9]{6}")) {
            return true;
        } else {
            return false;
        }
    }

    private String normalizePhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("00359")) {
            String[] splits = phoneNumber.split("00359");
            phoneNumber = "0" + splits[1];
        }
        if (phoneNumber.startsWith("+359")) {
            String[] splits = phoneNumber.split("\\+359");
            phoneNumber = "0" + splits[1];
        }
        return phoneNumber;
    }

    @Override
    public boolean addPair(Pair pair) {
        if (!allPairs.contains(pair)) {
            allPairs.add(pair);
            return true;
        }
        return false;
    }

    @Override
    public boolean removePair(Pair pair) {
        if (allPairs.contains(pair)) {
            allPairs.remove(pair);
            return true;
        }
        return false;

    }


    @Override
    public boolean removePairByName(String name) {
      return false;
    }

    @Override
    public Pair getPairByName(String name) {
        return null;
    }

    @Override
    public String getPhoneByName(String name) {
        return null;
    }

    @Override
    public String printAllPairsSortedByName() {
        return null;
    }



//    @Override
//    public int increaseInCallOfPair(Pair pair) {
//        return pair.increaseInCalls();
//    }
//
//    @Override
//    public int increaseOutCallOfPair(Pair pair) {
//        return pair.increaseOutCalls();
//    }




    public TreeSet<Pair> getAllPairs() {
        return allPairs;
    }

    public void setAllPairs(TreeSet<Pair> allPairs) {
        if (allPairs == null) {
            this.allPairs = new TreeSet<>();
        } else
            this.allPairs = allPairs;
    }

}
