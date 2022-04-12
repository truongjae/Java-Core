package reflection_demo.test;

public class User {
    @Scan
    private String username;
    @Scan
    private String password;

    private Boolean sex;

    public User(String username, String password, Boolean sex) {
        this.username = username;
        this.password = password;
        this.sex = sex;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPasswordUsername(String username,String password) {
        this.username = username;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
