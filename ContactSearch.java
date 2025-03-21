/*long getMobileByEmail(Strig email)//15
String getEmailByName(String name)//15
String[] searchByLastName(String name);//3
// store 5 names with ends with Kapoor;
// store 5 names with ends with Sharma
// store 5 names with ends with Shetty




*/


class ContactSearch{
	static long getMobileByEmail(String email){
		System.out.println("\nRunning getMobileByEmail in ContactSearch");
		if(email==("krishna2345@gmail.com")){
			System.out.println(email+"Ph. no.: 7899082933");
			
		}
		else if(email=="rajeshkulala4567@gmail.com"){
			System.out.println(email+"Ph. no.: 7953998837");
		}else if(email=="kavanasharma@gmail.com"){
			System.out.println(email+"Ph. no.: 7654883333");
		}else if(email=="sarithaharish097@gmail.com"){
			System.out.println(email+"Ph. no.: 6267729933");
		}else if(email=="raghavguptha876@gmail.com"){
			System.out.println(email+"Ph. no.: 6267729033");
		}else if(email=="bhavyadevadiga845@gmail.com"){
			System.out.println(email+"Ph. no.: 6267729903");
		}else if(email=="ramyakrishnamoorthi78@gmail.com"){
			System.out.println(email+"Ph. no.: 111111933");
		}else if(email=="kalpanachandran678@gmail.com"){
			System.out.println(email+"Ph. no.: 626772222");
		}else if(email=="bograthsars790@gmail.com"){
			System.out.println(email+"Ph. no.: 3333333333");
		}else if(email=="djfhjyus88jh@gmail.com"){
			System.out.println(email+"Ph. no.: 4736473675");
		}else if(email=="tarunnayakmk89@gmail.com"){
			System.out.println(email+"Ph. no.: 6267778933");
		}else if(email=="harshakrishna09@gmail.com"){
			System.out.println(email+"Ph. no.: 6267724533");
		}else if(email=="04ranjithkulal8@gmail.com"){
			System.out.println(email+"Ph. no.: 6267745933");
		}else if(email=="jalajabharath.789@gmail.com"){
			System.out.println(email+"Ph. no.: 6267723453");
		}else if(email=="umeshraj.120@gmail.com"){
			System.out.println(email+"Ph. no.: 6267729677");
		}else if(email=="krishnaranjith98@gmail.com"){
			System.out.println(email+"Ph. no.: 8797729933");
		}else if(email=="chammanthsharma983@gmail.com"){
			System.out.println(email+"Ph. no.: 6267770933");
		}
		else{
			System.out.println("contact not found... for "+email);
		}
		return 0; 
	}
	
	
	static String getEmailByName(String name){
		
		System.out.println("\nRunning getEmailByName in ContactSearch");
		if(name=="Raji"){
			System.out.println(name+" Email ID: Raji@gmail.com");
			return null;
		}else if(name=="Krishna"){
			System.out.println(name+" Email ID: krishna2345@gmail.com");
			return null;
		}else if(name=="Rama"){
			System.out.println(name+" Email ID: Rama@gmail.com");
			return null;
		}else if(name=="Kiran"){
			System.out.println(name+" Email ID: Kiran@gmail.com");
			return null;
		}else if(name=="Meera"){
			System.out.println(name+" Email ID: Meera@gmail.com");
			return null;
		}else if(name=="Gagan Desayi"){
			System.out.println(name+" Email ID: Gagan@gmail.com");
			return null;
		}else if(name=="Jaya Krishna"){
			System.out.println(name+" Email ID: Jaya@gmail.com");
			return null;
		}else if(name=="Bhavya"){
			System.out.println(name+"Email ID: Bhavya@gmail.com");
			return null;
		}else if(name=="Aditi"){
			System.out.println(name+"Email ID: Aditi@gmail.com");
			return null;
		}else if(name=="Swathi"){
			System.out.println(name+"Email ID: Swathi@gmail.com");
			return null;
		}else if(name=="Swaroop"){
			System.out.println(name+"Email ID: Swaroop@gmail.com");
			return null;
		}else if(name=="Niranjan"){
			System.out.println(name+"Email ID: Niranjan@gmail.com");
			return null;
		}else if(name=="Kavya"){
			System.out.println(name+"Email ID: Kavya@gmail.com");
			return null;
		}else if(name=="Navya"){
			System.out.println(name+"Email ID: Navya@gmail.com");
			return null;
		}else if(name=="Sarayu"){
			System.out.println(name+"Email ID: Sarayu@gmail.com");
			return null;
		}else if(name=="Sarala"){
			System.out.println(name+"Email ID: Sarala@gmail.com");
			return null;
		}else if(name=="Kumar"){
			System.out.println(name+"Email ID: Kumar@gmail.com");
			return null;
		}else if(name=="Thrivikram"){
			System.out.println(name+"Email ID: Thrivikram@gmail.com");
			return null;
		}else if(name=="Komal"){
			System.out.println(name+"Email ID: Komal@gmail.com");
			return null;
		}else if(name=="Dina"){
			System.out.println(name+"Email ID: Dina@gmail.com");
			return null;
		}else if(name=="Ambi"){
			System.out.println(name+"Email ID: Ambi@gmail.com");
			return null;
		}else if(name=="Nirmitra"){
			System.out.println(name+"Email ID: Nirmitra@gmail.com");
			return null;
		}
		else {
			System.out.println("Email ID not found for the name "+name);
			return null;
		}
	
	}
	
	
	static String[] searchByLastName(String name) {
       
        String[] Knames = {"Sanya Kapoor", "Sudha Kapoor", "Rajesh Kapoor", "Ananya Kapoor", "Aloop Kapoor"};
        String[] Snames = {"Bhargav Shetty", "Niranjan Shetty", "Ravi Shetty", "Kousalya Shetty", "Sowmya Shetty"};
        String[] Mnames = {"Swathi Sharma", "Rajesh Sharma", "Ram Sharma", "Manya Sharma", "Shalaka Sharma"};
       
        if (name==("Kapoor")) {
            return Knames;
        } else if (name==("Shetty")) {
            return Snames;
        } else if (name==("Sharma")) {
            return Mnames;
        } else {
            System.out.println("No names found " + name);
            return null; 
        }
       }
      }



	
 

