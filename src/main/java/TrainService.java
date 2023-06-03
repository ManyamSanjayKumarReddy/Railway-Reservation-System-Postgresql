import java.util.ArrayList;
import java.util.List;

public class TrainService {

    List<JourneyDetails> passengers = new ArrayList<>();

    JourneyDB db = new JourneyDB();

    public void addDetails(JourneyDetails J){
        // passengers.add(J);
        db.save(J);
    }

    public List<JourneyDetails> getDetails(){
            return passengers;
    }

    public List<JourneyDetails> getDestinationText(String text){
        String str =text.toLowerCase();
        List<JourneyDetails> destinations = new ArrayList<>();

        for (JourneyDetails J : passengers){
                String destination = J.getDestination().toLowerCase();
                if (destination.equals(str)){
                    destinations.add(J);
                }
        }
        return destinations;
    }

    public List<JourneyDetails> getDetailsCost(int value){

        List<JourneyDetails> passengers_cost = new ArrayList<>();

        for (JourneyDetails J : passengers){
            if (J.getCost_ticket() > value){
                passengers_cost.add(J);
            }
        }
        return passengers_cost;

    }
}
