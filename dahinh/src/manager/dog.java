package manager;

public class dog extends animal{
    private String speak;

    public dog(String speak) {
        this.speak = speak;
    }

    public dog(String color, String name, String speak) {
        super(color, name);
        this.speak = speak;
    }

    public dog(){
        super();
    }
    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
    public dog(String color, String name) {
        super(color, name);
    }
}
