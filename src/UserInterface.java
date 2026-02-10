/**
 * User Interface
 *
 * @author Aayush
 *
 * @version 6.0
 */

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        VesselUtil vesselUtil = new VesselUtil();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Vessel Id to check speed");
        String vesselId = scanner.nextLine();

        Vessel vessel = vesselUtil.getVesselById(vesselId);

        if (vessel != null) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel Id " + vesselId + " not found");
        }

        System.out.println("High performance vessels are");
        List<Vessel> highPerformanceVessels = vesselUtil.getHighPerformanceVessels();

        for (Vessel v : highPerformanceVessels) {
            System.out.println(
                    v.getVesselId() + " | " +
                            v.getVesselName() + " | " +
                            v.getVesselType() + " | " +
                            v.getAverageSpeed() + " knots"
            );
        }

        scanner.close();
    }
}