public class student {
    private String id;
    private String name;
    private String username;
    private String password;
    private String address;
    private int age;
    private String email;
    private String phone;

    public student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.username = studentBuilder.username;
        this.password = studentBuilder.password;
        this.address = studentBuilder.address;
        this.age = studentBuilder.age;
        this.email = studentBuilder.email;
        this.phone = studentBuilder.phone;
    }
    public static class StudentBuilder{
        private String id;
        private String name;
        private String username;
        private String password;
        private String address;
        private int age;
        private String email;
        private String phone;

        public StudentBuilder id(String id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder username(String username) {
            this.username = username;
            return this;
        }

        public StudentBuilder password(String password) {
            this.password = password;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder email(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public student build(){
            return new student(this);
        }
    }

    @Override
    public String toString() {
        return "student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
