import javafx.util.Pair;

import java.io.IOException;
import java.nio.file.Path;


public interface IPhoneBook {
    boolean addPair(Pair pair);
    boolean removePair(Pair pair);
    boolean removePairByName(String name);
//    int increaseInCallOfPair(Pair pair);
//    int increaseOutCallOfPair(Pair pair);
    Pair getPairByName(String name);
    String getPhoneByName(String name);
    String printAllPairsSortedByName();

}
