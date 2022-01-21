public class Animal {
    private String name;
    private String species;
    private int cage;

    public Animal(String name, String species, int cage) {
        this.name = name;
        this.species = species;
        this.cage = cage;
    }
    public String getName() {
        return this.name;
    }
    public String getSpecies() {
        return this.species;
    }
    public int getCage() {
        return this.cage;
    }
}