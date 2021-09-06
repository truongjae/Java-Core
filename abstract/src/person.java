public abstract class person {
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public person(){}
    public person(String ten) {
        this.ten = ten;
    }

    private String ten;
}
