public class Toy {
    private final int id;
    private final String name;
    private int frequency;

    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s; частота выпадения: %s%%", name, frequency);
    }


    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}