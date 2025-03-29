class SyringeRunner{
public static void main(String[] args){

			
		int qnt1=2; 
		String mdcn1= "insuline"; 
		String nurse1="Nurse Sarah"; 
		boolean injected1=true;
		
		Syringe.details(qnt1,mdcn1,nurse1);
		Syringe.inject(injected1);
		
		
		int qnt2=2; String mdcn2= "Paracetamol"; String nurse2="Nurse Sarala"; boolean injected2=true;
		Syringe.details(qnt2,mdcn2,nurse2);
		Syringe.inject(injected2);
		
		int qnt3=2; String mdcn3="Adrenaline"; String nurse3="Nurse Sowmya"; boolean injected3=true;
		Syringe.details(qnt3,mdcn3,nurse3);
		Syringe.inject(injected3);
		
		int qnt4=2; String mdcn4= "Paracetamol"; String nurse4="Nurse Sunitha"; boolean injected4=false;
		Syringe.details(qnt4,mdcn4,nurse4);
		Syringe.inject(injected4);
		
		int qnt5=2; String mdcn5="COVID-19 Vaccine"; String nurse5="Nurse Jaya"; boolean injected5=false;
		Syringe.details(qnt5,mdcn5,nurse5);
		Syringe.inject(injected5);
		
	
		
	}
}


