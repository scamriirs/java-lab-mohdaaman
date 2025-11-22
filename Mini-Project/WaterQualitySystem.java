import java.util.ArrayList;
import java.util.Scanner;

// Class representing a single sensor reading
class WaterQualityData {
    double pH;
    double temperature;
    double turbidity;
    double dissolvedOxygen;

    public WaterQualityData(double pH, double temperature, double turbidity, double dissolvedOxygen) {
        this.pH = pH;
        this.temperature = temperature;
        this.turbidity = turbidity;
        this.dissolvedOxygen = dissolvedOxygen;
    }

    @Override
    public String toString() {
        return "pH: " + pH +
        ", Temp: " + temperature + "°C" +
        ", Turbidity: " + turbidity + " NTU" +
        ", DO: " + dissolvedOxygen + " mg/L";
    }
}

// Monitoring System Class
class WaterQualityMonitor {
    ArrayList<WaterQualityData> records = new ArrayList<>();

    // Safe Limit Ranges
    final double MIN_PH = 6.5;
    final double MAX_PH = 8.5;
    final double MAX_TURBIDITY = 5.0;
    final double MIN_DO = 6.0;
    final double MAX_TEMP = 32.0;

    public void addReading(WaterQualityData data) {
        records.add(data);
        checkSafety(data);
    }

    // Safety Check Method
    public void checkSafety(WaterQualityData d) {
        System.out.println("\n--- Checking Water Quality ---");

        if (d.pH < MIN_PH || d.pH > MAX_PH)
            System.out.println("⚠ ALERT: pH level unsafe!");

        if (d.temperature > MAX_TEMP)
            System.out.println("⚠ ALERT: High temperature!");

        if (d.turbidity > MAX_TURBIDITY)
            System.out.println("⚠ ALERT: Turbidity too high!");

        if (d.dissolvedOxygen < MIN_DO)
            System.out.println("⚠ ALERT: Low dissolved oxygen!");

        System.out.println("Check complete.\n");
    }

    // Display All Stored Readings
    public void displayAll() {
        if (records.isEmpty()) {
            System.out.println("No sensor data recorded yet.");
            return;
        }
        System.out.println("\n--- All Sensor Readings ---");
        for (WaterQualityData d : records) {
            System.out.println(d.toString());
        }
    }
}

public class WaterQualitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WaterQualityMonitor monitor = new WaterQualityMonitor();

        while (true) {
            System.out.println("\n--- Water Quality Monitoring System ---");
            System.out.println("1. Add Sensor Reading");
            System.out.println("2. View All Readings");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter pH: ");
                double pH = sc.nextDouble();

                System.out.print("Enter Temperature (°C): ");
                double temp = sc.nextDouble();

                System.out.print("Enter Turbidity (NTU): ");
                double turbidity = sc.nextDouble();

                System.out.print("Enter Dissolved Oxygen (mg/L): ");
                double DO = sc.nextDouble();

                WaterQualityData data = new WaterQualityData(pH, temp, turbidity, DO);
                monitor.addReading(data);
            }
            else if (choice == 2) {
                monitor.displayAll();
            }
            else if (choice == 3) {
                System.out.println("System Closed.");
                break;
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}
