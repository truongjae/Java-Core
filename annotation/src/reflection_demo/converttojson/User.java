package reflection_demo.converttojson;

@Entity
public class User {
    private String username;
    private String password;
    private Integer age;
    private Boolean sex;
    private Float height = 1.7f;
    public User(UserBuilder userBuilder){
        this.username = userBuilder.username;
        this.password = userBuilder.password;
        this.age = userBuilder.age;
        this.sex = userBuilder.sex;
        this.height = userBuilder.height;
    }
    public static class UserBuilder{
        private String username;
        private String password;
        private Integer age;
        private Boolean sex;
        private Float height;

        public UserBuilder height(Float height) {
            this.height = height;
            return this;
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }
        public UserBuilder sex(Boolean sex){
            this.sex = sex;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
