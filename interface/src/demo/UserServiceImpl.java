package demo;

public class UserServiceImpl implements UserService{

    @Override
    public void login(String username, String password) {
        if(checkInfo(username,password)){
            if(username=="truong" && password=="12345678"){
                System.out.println("dang nhap thanh cong");
            }
            else {
                System.out.println("dang nhap that bai");
            }
        }
        else {
            System.out.println("dang nhap that bai");
        }
    }

    @Override
    public void register(String username, String password) {
        if(checkInfo(username,password)){
            System.out.println("dang ki thanh cong");
        }
        else {
            System.out.println("dang ki that bai");
        }
    }

    @Override
    public void getAllUser() {
        System.out.println("day la phuong thuc get all");
    }

    public boolean checkInfo(String username,String password){ // kiem tra thong tin username, password
        boolean check = true;
        // a2bc
        for (int i=0;i<username.length();i++){
            if(username.codePointAt(i)<97 || username.codePointAt(i)> 122){
                check=false;
                System.out.println("username chi dc ton tai tu a-z");
                break;
            }
        }
        if(password.length()<8){
            System.out.println("mat khau phai co it nhat 8 ki tu");
            check = false;
        }
        return check;
    }

}
