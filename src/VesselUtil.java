/**
 * Utility class for managing Vessel data.
 *
 * @author Aayush
 *
 * @version 6.0
 */

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList;

    public VesselUtil() {
        vesselList = new ArrayList<>();
        vesselList.add(new Vessel("V001", "Sea King", 25.5, "Cargo"));
        vesselList.add(new Vessel("V002", "Ocean Star", 18.0, "Tanker"));
        vesselList.add(new Vessel("V003", "Wave Rider", 22.3, "Cruise"));
    }

    public Vessel getVesselById(String vesselId) {
        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> result = new ArrayList<>();
        double maxSpeed = 0;

        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                result.add(vessel);
            }
        }

        return result;
    }
}