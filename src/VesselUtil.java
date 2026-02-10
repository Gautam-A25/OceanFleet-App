import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for managing Vessel data.
 *
 * @author Aayush
 *
 * @version 2.0
 */
public class VesselUtil {

    public static List<Vessel> getVesselList() {

        List<Vessel> vessels = new ArrayList<>();

        vessels.add(new Vessel("V001", "Atlantic Explorer", 28.5, "Cargo"));
        vessels.add(new Vessel("V002", "Pacific Guardian", 32.0, "Military"));
        vessels.add(new Vessel("V003", "Ocean Breeze", 22.8, "Passenger"));
        vessels.add(new Vessel("V004", "Arctic Voyager", 26.4, "Research"));

        return vessels;
    }
}