package ClassInterface;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical {
	// US
		@Override
		public void physioServices() {
			System.out.println("FH -- physioServices");
		}
		
		@Override
		public String physioServices(int a) {
			System.out.println("FH -- physioServices " + a);
			return "FH";
		}

		@Override
		public void cardioServices() {
			System.out.println("FH -- cardioServices");
		}

		@Override
		public void ENTServices() {
			System.out.println("FH -- ENTServices");
		}

		@Override
		public void emergencyServices() {
			System.out.println("FH -- emergencyServices");
		}

		// UK
		@Override
		public void oncologyServices() {
			System.out.println("FH -- oncologyServices");
		}

		@Override
		public void pediaServices() {
			System.out.println("FH -- pediaServices");
		}

		// Indian
		@Override
		public void neuroServices() {
			System.out.println("FH -- neuroServices");

		}

		@Override
		public void dentalServices() {
			System.out.println("FH -- dentalServices");

		}

		// Individual:
		public void medicalTraining() {
			System.out.println("FH -- medicalTraining");
		}

		public void optClinical() {
			System.out.println("FH -- optClinical");
		}

		// method hiding
		public static void billing() {
			System.out.println("Fortis hospital -- billing");
		}

		// default method overriding:
		@Override
		public void medialHistory() {
			System.out.println("FH -- medialHistory");
		}

		@Override
		public void covid19Vaccination() {
			System.out.println("FH -- covid19Vaccination");

		}

}
