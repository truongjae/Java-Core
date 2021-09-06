public class emloyee extends person{
    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    private double luong;

    @Override
    public void thongtin() {
        System.out.println("class con");
    }
}
