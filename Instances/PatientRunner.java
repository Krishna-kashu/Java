class PatientRunner{
	
	public static void main(String[] args){

	Patient patient= new Patient();
	
	System.out.println("default name is: "+patient.name);
	System.out.println("default value for age is: "+patient.age);
	System.out.println("default weight is: "+patient.weight);
	System.out.println("default has_allergy is: "+patient.has_allergy);
	
	patient.name="Raghav";
	patient.age=30;
	patient.weight=56.86f;
	patient.has_allergy=true;
	
	System.out.println("\nupdated name is: "+patient.name);
	System.out.println("updated value for age is: "+patient.age);
	System.out.println("updated weight is: "+patient.weight);
	System.out.println("updated has_allergy is: "+patient.has_allergy);
	
}
}