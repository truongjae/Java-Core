package demo;

public class main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
//        userService.login("truong","123456780");
        userService.getAllUser();
    }
}
