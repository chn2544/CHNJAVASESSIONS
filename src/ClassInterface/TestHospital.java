package ClassInterface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.neuroServices();
		fh.physioServices();
		fh.pediaServices();
		fh.medicalTraining();
		fh.optClinical();
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);
		
		USMedical.billing();
		FortisHospital.billing();
		
		fh.medialHistory();      // overridden method in child class will be called.
		fh.covid19Vaccination();
		fh.medicalRD();
		
		//top casting:
		//child class object can be referred by parent interface ref variable
		
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.ENTServices();
		us.physioServices();
		us.emergencyServices();
		us.covid19Vaccination();
		
		//down casting: NA
		
		
		
	}

	
}
