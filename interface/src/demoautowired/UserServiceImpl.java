package demoautowired;

public class UserServiceImpl implements UserService{
    @Override
    public void login() {
        System.out.println("day la login 1");
    }

    @Override
    public void register() {
        System.out.println("register");
    }
    // dependency injection
}
