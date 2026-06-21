import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    // INSERT
    public void addStudent(Student s) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO students(name, age, department, email) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, s.name);
            ps.setInt(2, s.age);
            ps.setString(3, s.department);
            ps.setString(4, s.email);

            ps.executeUpdate();
            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // VIEW
    public void viewStudents() {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT * FROM students";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("department") + " | " +
                    rs.getString("email")
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Student Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

