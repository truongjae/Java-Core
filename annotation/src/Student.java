public class Student {
    @MyAnnotation(value = "truong")
    private String ID;

    @MyAnnotation
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
