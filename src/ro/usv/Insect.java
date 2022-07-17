package ro.usv;

public abstract class Insect {

    private String name;
    private int eyeCount;
    private int legCount;

    public Insect() {
        name="";
        eyeCount=0;
        legCount=0;
    }

    public Insect(String name, int eyeCount, int legCount) {
        this.name = name;
        this.eyeCount = eyeCount;
        this.legCount = legCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEyeCount() {
        return eyeCount;
    }

    public void setEyeCount(int eyeCount) {
        this.eyeCount = eyeCount;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    @Override
    public String toString() {
        return "Insect{" +
                "name='" + name + '\'' +
                ", eyeCount=" + eyeCount +
                ", legCount=" + legCount +
                '}';
    }
}
