package ro.usv;

public class Telemarketer extends Person implements Annoyable {
    private String adevrtisedProduct;
    private Integer personsAnnoyed=0;

    public Telemarketer(String fullName, boolean sittingAtTable, boolean annoyed, Integer personsAnnoyed, String adevrtisedProduct) {
        super(fullName,-1, sittingAtTable, annoyed);
        this.personsAnnoyed = personsAnnoyed;
        this.adevrtisedProduct=adevrtisedProduct;
    }

    @Override
    public void beAnnoying() {
    personsAnnoyed++;
    }
}
