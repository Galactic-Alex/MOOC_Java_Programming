public class Bird {
    private String name;
    private String nameInLatin;
    private int observations;

    public Bird(String name, String nameInLatin) {
        this.nameInLatin = nameInLatin;
        this.name = name;
        observations = 0;
    }

    public void addObservations() {
        observations++;
    }

    public String getName() {
        return name;
    }

    public String getNameInLatin() {
        return nameInLatin;
    }

    public int getObservations() {
        return observations;
    }

    @Override
    public String toString() {
        return name + " (" + nameInLatin + "): " + observations + " observations";
    }
}
