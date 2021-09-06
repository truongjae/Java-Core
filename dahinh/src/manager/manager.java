package manager;

public class manager {
    private animal animal;

    public animal getAnimal() {
        return animal;
    }

    public void setAnimal(animal animal) {
        this.animal = animal;
    }

    public manager(animal animal){
        this.animal = animal;
    }

}
