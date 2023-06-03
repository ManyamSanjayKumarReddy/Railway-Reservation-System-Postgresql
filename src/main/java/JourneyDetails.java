class JourneyDetails{

    private String name;
    private int coach_num;
    private int cost_ticket;
    private String destination;
    private String date;

    public JourneyDetails() {
    }

    public JourneyDetails(String name, int coach_num, int cost_ticket, String destination, String date) {
        this.name = name;
        this.coach_num = coach_num;
        this.cost_ticket = cost_ticket;
        this.destination = destination;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoach_num() {
        return coach_num;
    }

    public void setCoach_num(int coach_num) {
        this.coach_num = coach_num;
    }

    public int getCost_ticket() {
        return cost_ticket;
    }

    public void setCost_ticket(int cost_ticket) {
        this.cost_ticket = cost_ticket;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "JourneyDetails{" +
                "name='" + name + '\'' +
                ", coach_num=" + coach_num +
                ", cost_ticket=" + cost_ticket +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}