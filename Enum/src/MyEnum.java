public enum MyEnum {
    CAFE("cafe"),TEA("tra"),COCA("coca");
    private String ten;

    private MyEnum(String ten){
        this.ten = ten;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
