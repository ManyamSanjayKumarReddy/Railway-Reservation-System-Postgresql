import java.util.List;
/*
    Railway Reservation System
        Services in the System :
            1. Coach Number
            2. Date of Journey
            3. Destination
            4. Cost of Ticket
            5. Name of the Passenger

      1. Add the Passenger Details
      2. List of the Passenger Journey Details

 */
public class Main {
    public static void main(String[] args){

        TrainService service = new TrainService();

        /*

        service.addDetails(new JourneyDetails("Khader Basha", 7, 300, "Kadapa" , "1-01-2023"));
        service.addDetails(new JourneyDetails("Sanju", 12, 500, "Rayachoty" , "21-06-2023"));
        service.addDetails(new JourneyDetails("Naveen", 6, 1200, "Nellore" , "09-03-2023"));
        service.addDetails(new JourneyDetails("Vinay", 15, 900, "Kavali" , "16-04-2023"));
        service.addDetails(new JourneyDetails("Khader Basha", 9, 600, "Madurai" , "01-10-2022"));
        service.addDetails(new JourneyDetails("Srikanth", 12, 1200, "Rayachoty" , "02-09-2023"));
        service.addDetails(new JourneyDetails("Naveen", 8, 120, "Kavali" , "09-03-2022"));
        service.addDetails(new JourneyDetails("Jathin", 15, 1800, "Chennai" , "16-09-2022"));

         */


        System.out.println("-----------------Get all the Passenger Details-----------------------");
        List<JourneyDetails> details =service.getDetails();
        // Enhanced For Loop
        for (JourneyDetails J : details){
            System.out.println(J);
        }

        System.out.println("------------------Get all the Passengers with Destination Name -------------------");
        List<JourneyDetails> dest = service.getDestinationText("Kavali");
        for (JourneyDetails destination : dest){
            System.out.println(destination);
        }

        System.out.println("----------------Get the Passengers List who travelled with ticket cost more than 500 ------------------");
        List<JourneyDetails> cost = service.getDetailsCost(500);
        for (JourneyDetails pass : cost){
            System.out.println(pass);
        }

    }
}
