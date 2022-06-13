package demo;

public interface UserService {
    void login(String username, String password);
    void register(String username,String password);
    void getAllUser();
}
