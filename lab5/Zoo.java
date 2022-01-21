import java.util.ArrayList;
import java.util.stream.Stream;

public class Zoo {
    private ArrayList<Animal> animals;
    Animal lonely;

    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    // => ищем клетки с животными заданного вида species
    public Stream<Integer> getStreamSameAnimalsInCage(String species) {
        return this.animals.stream()
                .filter(animal -> animal.getSpecies().equals(species))
                .map(animal -> animal.getCage());
    }

    public Animal showLonelyAnimal(String kind) {
        int k = 0;
        for(Animal elem : animals){
            String h = elem.getSpecies();

            if (h.equals(kind)) {
                k += 1;
                lonely = elem;
            }
        }
        if (k == 1) return lonely;
        return null;
    }

}

