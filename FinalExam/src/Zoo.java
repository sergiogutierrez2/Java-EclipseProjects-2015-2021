import java.util.ArrayList;

class Zoo {
    ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void allTalking() {
        for (Animal animal : animals) {
            animal.talk();
        }
    }
}