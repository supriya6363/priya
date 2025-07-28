public class Hospital {

    
    public static final String HOSPITAL_NAME = "City General Hospital"; 
    public static String HOSPITAL_ADDRESS = "123 Main Street, Anytown";
    public static int TOTAL_BED_CAPACITY = 500; 
    private static int occupiedBeds = 0; 
    protected static double dailyRevenueTarget = 100000.00; 

    
    public static String getHospitalName() {
        return HOSPITAL_NAME; 
    }

    public static void updateHospitalAddress(String newAddress) {
        HOSPITAL_ADDRESS = newAddress; 
        System.out.println("Hospital address updated to: " + HOSPITAL_ADDRESS);
    }

    public static int getAvailableBeds() {
        return TOTAL_BED_CAPACITY - occupiedBeds; 
    }

    public static void admitPatient() {
        if (occupiedBeds < TOTAL_BED_CAPACITY) { 
            occupiedBeds++;
            System.out.println("Patient admitted. Occupied beds: " + occupiedBeds);
        } else {
            System.out.println("Hospital is at full capacity. Cannot admit more patients.");
        }
    }

    public static void dischargePatient() {
        if (occupiedBeds > 0) {
            occupiedBeds--;
            System.out.println("Patient discharged. Occupied beds: " + occupiedBeds);
        } else {
            System.out.println("No patients to discharge.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to " + Hospital.getHospitalName());
        System.out.println("Hospital is located at: " + Hospital.HOSPITAL_ADDRESS);
        System.out.println("Total bed capacity: " + Hospital.TOTAL_BED_CAPACITY);
        System.out.println("Available beds: " + Hospital.getAvailableBeds());

        Hospital.admitPatient();
        Hospital.admitPatient();
        Hospital.dischargePatient();

        System.out.println("Current available beds: " + Hospital.getAvailableBeds());

        Hospital.updateHospitalAddress("456 Oak Avenue, Metropolis");
        System.out.println("Updated Hospital Address: " + Hospital.HOSPITAL_ADDRESS);

        System.out.println("Daily revenue target: $" + Hospital.dailyRevenueTarget);
    }
}



