package ro.usv;

public class Mosquito extends Insect implements Annoyable{
    private Integer personsBit=0;

    public Mosquito() {
        this.setLegCount(6);
        this.setEyeCount(2);
        this.setName("Mosquito");
    }

    public Integer getPersonsBit() {
        return personsBit;
    }

    public void setPersonsBit(Integer personsBit) {
        this.personsBit = personsBit;
    }

    @Override
    public void beAnnoying() {
    personsBit++;
    }
}
