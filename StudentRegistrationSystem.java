
import java.util.ArrayList;
import java.util.List;

// Account Class
class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void logout() {
        System.out.println("Logged out successfully.");
    }

    public String getUsername() {
        return username;
    }
}

// Student Class
class Student {
    private String id;
    private String name;
    private String email;

    public Student(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Course Class
class Course {
    private String code;
    private String title;
    private int units;

    public Course(String code, String title, int units) {
        this.code = code;
        this.title = title;
        this.units = units;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getUnits() {
        return units;
    }
}

// RegistrationManager Class
class RegistrationManager {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

    public void registerStudent(Student student) {
        students.add(student);
        System.out.println("Student registered: " + student.getName());
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added: " + course.getTitle());
    }

    public void createAccount(Account account) {
        accounts.add(account);
        System.out.println("Account created for: " + account.getUsername());
    }

    public void enrollCourse(Student student, Course course) {
        System.out.println("Student " + student.getName() + " enrolled in course: " + course.getTitle());
        // You can maintain a mapping if you want to store enrollments
    }
}

// Main Class to Test
public class StudentRegistrationSystem {
    public static void main(String[] args) {
        RegistrationManager manager = new RegistrationManager();

        // Create and register students
        Student student1 = new Student("5000", "Fatema", "Fatema@example.com");
        manager.registerStudent(student1);

        // Create and add courses
        Course course1 = new Course("C101", "Introduction to Java", 3);
        manager.addCourse(course1);

        // Create account
        Account account1 = new Account("Fatema123", "password");
        manager.createAccount(account1);

        // Enroll student in course
        manager.enrollCourse(student1, course1);

        // Test login
        if (account1.login("alice123", "password")) {
            System.out.println("Login successful for " + account1.getUsername());
        }

        // Logout
        account1.logout();
    }
}

