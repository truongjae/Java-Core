public class main {
    public static void main(String[] args) {
        Animal animal = FactoryBean.getInstance(FactoryBean.Mode.Animal,"animal",Animal::new);
        Animal animal1 = FactoryBean.getInstance(FactoryBean.Mode.Animal,"animal");
        Worker worker = FactoryBean.getInstance(FactoryBean.Mode.Worker,"worker",Worker::new);
        Worker worker1 = FactoryBean.getInstance(FactoryBean.Mode.Worker,"worker");
        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(worker);
        System.out.println(worker1);
    }
}
