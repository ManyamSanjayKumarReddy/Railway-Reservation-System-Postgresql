import java.sql.*;
import java.util.ArrayList;

public class JourneyDB {

    Connection conn = null;

    public JourneyDB() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pyramidclass", "postgres", "123456");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(JourneyDetails J){

        String query = "insert into passengers (name, coach_num, cost_ticket, destination, date) values (?,?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1,J.getName());
            st.setInt(2,J.getCoach_num());
            st.setInt(3,J.getCost_ticket());
            st.setString(4,J.getDestination());
            st.setString(5, J.getDate());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
