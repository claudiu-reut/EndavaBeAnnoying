package ro.usv;

public class Housefly extends Insect implements Annoyable{
    private Integer personsAnnoyed=0;
    public Housefly() {
        this.setEyeCount(6000);
        this.setName("Fly");
        this.setLegCount(6);
    }

    @Override
    public void beAnnoying() {
        personsAnnoyed++;
    }
}
