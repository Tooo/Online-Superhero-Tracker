package ca.cmpt213.a3.onlinesuperherotracker.model;

/**
 * Superhero class models information about a superhero.
 * Data includes id, name, height in cm, civilian save count, and its superpower
 */
public class Superhero {
    private long id;
    private String name;
    private double heightInCm;
    private int civilianSaveCount;
    private String superPower;

    public Superhero () {

    }

    public Superhero (long id, String name, double heightInCm, int civilianSaveCount, String superPower) {
        this.id = id;
        this.name = name;
        this.heightInCm = heightInCm;
        this.civilianSaveCount = civilianSaveCount;
        this.superPower = superPower;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(double heightInCm) {
        this.heightInCm = heightInCm;
    }

    public int getCivilianSaveCount() {
        return civilianSaveCount;
    }

    public void setCivilianSaveCount(int civilianSaveCount) {
        this.civilianSaveCount = civilianSaveCount;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", height=" + heightInCm +
                ", civiliansSaved=" + civilianSaveCount +
                ", superpower='" + superPower + '\'' +
                '}';
    }
}
