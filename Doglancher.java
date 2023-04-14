public class Doglancher {
    public static void main(String[] args) {
        Dog d = new Dog(35);
        d.bark();
        Dog [] dogs =new Dog[2];
        dogs[0] = new Dog(24);
        dogs[1] = new Dog(34);
        dogs[0].bark();
        Dog biggerdog = Dog.bigger(dogs[0], dogs[1]);
        biggerdog.bark();
        Dog biggerdog2 = dogs[0].bigger2(dogs[1]);
        biggerdog2.bark();
    }

}
