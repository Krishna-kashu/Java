class ContactSearchRunner{
	public static void main(String[] args){
		
		
		String email1="krishna2345@gmail.com";
		String email2="krishnaveni4567@gmail.com";
		String email3="krishnaveni@gmail.com";
		String email4="kavanasharma@gmail.com";
		String email5="rajeshkulala4567@gmail.com";
		String email6="sarithaharish097@gmail.com";
		String email7="raghavguptha876@gmail.com";
		String email8="bhavyadevadiga845@gmail.com";
		String email9="ramyakrishnamoorthi78@gmail.com";
		String email10="kalpanachandran678@gmail.com";
		String email11="bograthsars790@gmail.com";
		String email12="djfhjyus88jh@gmail.com";
		String email13="tarunnayakmk89@gmail.com";
		String email14="harshakrishna09@gmail.com";
		String email15="04ranjithkulal8@gmail.com";
		String email16="jalajabharath.789@gmail.com";
		String email17="umeshraj.120@gmail.com";
		String email18="krishnaranjith98@gmail.com";
		String email19="chammanthsharma983@gmail.com";
		String email20="karunyakamth09@gmail.com";
	
		
		ContactSearch.getMobileByEmail(email1);
		ContactSearch.getMobileByEmail(email2);
		ContactSearch.getMobileByEmail(email3);
		ContactSearch.getMobileByEmail(email4);
		ContactSearch.getMobileByEmail(email5);
		ContactSearch.getMobileByEmail(email6);
		ContactSearch.getMobileByEmail(email7);
		ContactSearch.getMobileByEmail(email8);
		ContactSearch.getMobileByEmail(email9);
		ContactSearch.getMobileByEmail(email10);
		ContactSearch.getMobileByEmail(email11);
		ContactSearch.getMobileByEmail(email12);
		ContactSearch.getMobileByEmail(email13);
		ContactSearch.getMobileByEmail(email14);
		ContactSearch.getMobileByEmail(email15);
		ContactSearch.getMobileByEmail(email16);
		ContactSearch.getMobileByEmail(email17);
		ContactSearch.getMobileByEmail(email18);
		ContactSearch.getMobileByEmail(email19);
		ContactSearch.getMobileByEmail(email20);
		
		
		ContactSearch.getEmailByName("Raji");
		ContactSearch.getEmailByName("Krishna");
		ContactSearch.getEmailByName("Rama");
		ContactSearch.getEmailByName("Kiran");
		ContactSearch.getEmailByName("Meera");
		ContactSearch.getEmailByName("Gagan Desayi");
		ContactSearch.getEmailByName("Jaya Krishna");
		ContactSearch.getEmailByName("Bhavya");
		ContactSearch.getEmailByName("Aditi");
		ContactSearch.getEmailByName("Swathi");
		ContactSearch.getEmailByName("Swaroop");
		ContactSearch.getEmailByName("Niranjan");
		ContactSearch.getEmailByName("Kavya");
		ContactSearch.getEmailByName("Navya");
		ContactSearch.getEmailByName("Sarayu");
		ContactSearch.getEmailByName("Sarala");
		ContactSearch.getEmailByName("Kumar");
		ContactSearch.getEmailByName("Thrivikram");
		ContactSearch.getEmailByName("Komal");
		ContactSearch.getEmailByName("Dina");
		ContactSearch.getEmailByName("Ambi");
		ContactSearch.getEmailByName("Nirmitra");
		ContactSearch.getEmailByName("Rajath");
		
		
		
		String[] kapoor = ContactSearch.searchByLastName("Kapoor");
        String[] sharma = ContactSearch.searchByLastName("Sharma");
        String[] shetty = ContactSearch.searchByLastName("Shetty");

        System.out.println("\nKapoor's family:");
        for (String k : kapoor) {
            System.out.println(k);
        }

        System.out.println("\nSharma's family:");
        for (String s : sharma) {
            System.out.println(s);
        }

        System.out.println("\nShetty's family:");
        for (String m : shetty) {
            System.out.println(m);
        }
	}
}


