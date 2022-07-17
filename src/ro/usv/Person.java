package ro.usv;

public class Person {
private String fullName;
private Integer seat;
private boolean sittingAtTable;
private boolean annoyed;

    public Person() {
        fullName="";
        seat=-1;
        sittingAtTable=false;
        annoyed=false;
    }

    public Person(String fullName, Integer seat, boolean sittingAtTable, boolean annoyed) {
        this.fullName = fullName;
        this.seat = seat;
        this.sittingAtTable = sittingAtTable;
        this.annoyed = annoyed;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public boolean isSittingAtTable() {
        return sittingAtTable;
    }

    public void setSittingAtTable(boolean sittingAtTable) {
        this.sittingAtTable = sittingAtTable;
    }

    public boolean isAnnoyed() {
        return annoyed;
    }

    public void setAnnoyed(boolean annoyed) {
        this.annoyed = annoyed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", seat=" + seat +
                ", sittingAtTable=" + sittingAtTable +
                ", annoyed=" + annoyed +
                '}';
    }
}
