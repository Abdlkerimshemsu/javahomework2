public class Teacher {
    private String name;
    private String subject;

    // Constructor
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
