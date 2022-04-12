package reflection_demo.converttojson;


public class main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User.UserBuilder()
                .username("truong")
                .password("123")
                .height(1.7f)
                .sex(true)
                .age(20)
                .build();
        System.out.println(ConvertToJson.convert(user));
    }
}
