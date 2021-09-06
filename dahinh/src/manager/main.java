package manager;

public class main {
    public static void main(String[] args) {
        manager manager = new manager(new dog("vang","cho","gaugau"));
        manager manager1 = new manager(new cat("den","meo","meomeo"));
        System.out.println(manager.getAnimal().getColor()+" "+manager.getAnimal().getName());
        System.out.println(manager1.getAnimal().getColor()+" "+manager1.getAnimal().getName());

    }
}
