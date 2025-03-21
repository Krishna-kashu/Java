/*CabSearch
int getCostBySourceAndDestination(String source,String destination);//12
int getDistanceBySourceAndDestination(String source,String destination);23
void searchAvailability(String destination);
25
*/

class CabSearch {
    static int getCostBySourceAndDestination(String source, String destination) {
        if (source == "Majestic" && destination == "Indiranagar") {
    System.out.println(source + " to " + destination + " price is: 30");
    return 1;
	} else if (source == "Majestic" && destination == "Yeshwanthpur") {
		System.out.println(source + " to " + destination + " price is: 25");
		return 1;
	} else if (source == "Majestic" && destination == "MG Road") {
		System.out.println(source + " to " + destination + " price is: 25");
		return 1;
	} else if (source == "Majestic" && destination == "Whitefield") {
		System.out.println(source + " to " + destination + " price is: 60");
		return 1;
	} else if (source == "Indiranagar" && destination == "Whitefield") {
		System.out.println(source + " to " + destination + " price is: 50");
		return 1;
	} else if (source == "Majestic" && destination == "Banashankari") {
		System.out.println(source + " to " + destination + " price is: 35");
		return 1;
	} else if (source == "Banashankari" && destination == "Yelachenahalli") {
		System.out.println(source + " to " + destination + " price is: 20");
		return 1;
	} else if (source == "Yeshwanthpur" && destination == "Peenya") {
		System.out.println(source + " to " + destination + " price is: 15");
		return 1;
	} else if (source == "Peenya" && destination == "Nagasandra") {
		System.out.println(source + " to " + destination + " price is: 20");
		return 1;
	} else if (source == "MG Road" && destination == "Trinity") {
		System.out.println(source + " to " + destination + " price is: 10");
		return 1;
	} else if (source == "Majestic" && destination == "Nagasandra") {
		System.out.println(source + " to " + destination + " price is: 40");
		return 1;
	} else if (source == "Whitefield" && destination == "KR Puram") {
		System.out.println(source + " to " + destination + " price is: 20");
		return 1;
	} else if (source == "K Puram" && destination == "Baiyappanahalli") {
		System.out.println(source + " to " + destination + " price is: 15");
		return 1;
	} else {
		System.out.println("No direct route available or invalid station names.");
		return 0;
	}
	}
    static int getDistanceBySourceAndDestination(String source, String destination) {
        if (source == "Majestic" && destination == "Indiranagar") {
			System.out.println(source + " to " + destination + " distance is: 6.7 km");
			return 1;
		} else if (source == "Majestic" && destination == "Yeshwanthpur") {
			System.out.println(source + " to " + destination + " distance is: 7.5 km");
			return 1;
		} else if (source == "Majestic" && destination == "MG Road") {
			System.out.println(source + " to " + destination + " distance is: 4.5 km");
			return 1;
		} else if (source == "Majestic" && destination == "Whitefield") {
			System.out.println(source + " to " + destination + " distance is: 24.5 km");
			return 1;
		} else if (source == "Indiranagar" && destination == "Whitefield") {
			System.out.println(source + " to " + destination + " distance is: 18.3 km");
			return 1;
		} else if (source == "Majestic" && destination == "Banashankari") {
			System.out.println(source + " to " + destination + " distance is: 8.3 km");
			return 1;
		} else if (source == "Banashankari" && destination == "Yelachenahalli") {
			System.out.println(source + " to " + destination + " distance is: 4.7 km");
			return 1;
		} else if (source == "Yeshwanthpur" && destination == "Peenya") {
			System.out.println(source + " to " + destination + " distance is: 3.8 km");
			return 1;
		} else if (source == "Peenya" && destination == "Nagasandra") {
			System.out.println(source + " to " + destination + " distance is: 7.2 km");
			return 1;
		} else if (source == "MG Road" && destination == "Trinity") {
			System.out.println(source + " to " + destination + " distance is: 1.2 km");
			return 1;
		} else if (source == "Majestic" && destination == "Nagasandra") {
			System.out.println(source + " to " + destination + " distance is: 13.8 km");
			return 1;
		} else if (source == "Whitefield" && destination == "KR Puram") {
			System.out.println(source + " to " + destination + " distance is: 9.3 km");
			return 1;
		} else if (source == "KR Puram" && destination == "Baiyappanahalli") {
			System.out.println(source + " to " + destination + " distance is: 3.8 km");
			return 1;
		} else {
			System.out.println("No distance data.");
			return 0;
		}

			}
    static void searchAvailability(String destination) {
        if (destination == "Majestic" || destination == "Indiranagar" || destination == "Yeshwanthpur" ||
    destination == "MG Road" || destination == "Whitefield" || destination == "Banashankari" ||
    destination == "Yelachenahalli" || destination == "Peenya" || destination == "Nagasandra" ||
    destination == "Trinity" || destination == "KR Puram" || destination == "Baiyappanahalli" ||
    destination == "Hebbal" || destination == "Electronic City" || destination == "Jayanagar" ||
    destination == "Mysore Road" || destination == "Vijayanagar" || destination == "Kengeri" ||
    destination == "Hosur Road" || destination == "Rajajinagar" || destination == "Basavanagudi" ||
    destination == "Ulsoor" || destination == "Marathahalli" || destination == "Sarjapur" ||
    destination == "Koramangala" || destination == "Bellandur" || destination == "Devanahalli") {
    
    System.out.println("Cabs available to " + destination);
		} else {
			System.out.println("No cabs available.");
		}

    }
}