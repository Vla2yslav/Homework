package module3.task3;

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(long secretKey, String email) {
        this.secretKey = secretKey;
        this.email = email;
    }

    public SpecialStudent(String collegeName, int rating, long id) {
        super(collegeName, rating, id);
    }

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
