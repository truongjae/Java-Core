package manager;

public class cat extends animal{
    public cat(String speak) {
        this.speak = speak;
    }

    public cat(String color, String name, String speak) {
        super(color, name);
        this.speak = speak;
    }

    private String speak;

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public cat() {
        super();
    }

    public cat(String color, String name) {
        super(color, name);
    }
}
