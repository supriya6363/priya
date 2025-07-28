 class Hospital {
    
    private String name;
    private int bedCapacity;
    private String mainDepartment; 
    public Hospital() {
        this.name = "Unknown Hospital";
        this.bedCapacity = 0;
        this.mainDepartment = "General Medicine";
    }

   
    public Hospital(String name, int bedCapacity, String mainDepartment) {
        this.name = name;
        this.bedCapacity = bedCapacity;
        this.mainDepartment = mainDepartment;
    }

    
    public void setHospitalDetails(String name, int bedCapacity, String mainDepartment) {
        this.name = name;
        this.bedCapacity = bedCapacity;
        this.mainDepartment = mainDepartment;
    }

   
    public void printHospitalDetails(String objectLabel) {
        System.out.println("Hospital " + objectLabel + ":");
        System.out.println("  Name: " + name);
        System.out.println("  Bed Capacity: " + bedCapacity);
        System.out.println("  Main Department: " + mainDepartment);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        
        Hospital noArgHospitals = new Hospital();
        for (int i = 0; i < 5; i++) {
            noArgHospitals.add(new Hospital());
        }

        
        System.out.println("Hospitals created with no-argument constructor and initialized with setHospitalDetails:");
        for (int i = 0; i < noArgHospitals.size(); i++) {
            Hospital hosp = noArgHospitals.get(i);
            hosp.setHospitalDetails("City Care Hospet" + (i + 1), 100 + (i * 20), "Cardiology");
            hosp.printHospitalDetails("NA_Hosp_" + (i + 1));
        }

        
        Hospital paramHospitals = new Hospital();
        System.out.println("\nHospitals created with parameterized constructor:");
        for (int i = 0; i < 5; i++) {
            paramHospitals.add(new Hospital("Hospet General Hosp." + (i + 1), 200 + (i * 50), "Orthopedics"));
            paramHospitals.get(i).printHospitalDetails("P_Hosp_" + (i + 1));
        }

      
        System.out.println("\nHospitals (parameterized) reinitialized with setHospitalDetails:");
        for (int i = 0; i < paramHospitals.size(); i++) {
            Hospital hosp = paramHospitals.get(i);
		(sanjevani Hospet" + (i + 1), 150 + (i * 30), "Pediatrics");
            hosptal.printHospitalDetail("P_Hosp_" + (i + 1));
        }
  }
  }
