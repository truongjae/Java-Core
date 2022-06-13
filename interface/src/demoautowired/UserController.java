package demoautowired;

public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    public void hello(){
        userService.login();
    }

}
