package ro.usv;

import java.util.ArrayList;

public class Main {
    static ArrayList<Annoyable> pests= new ArrayList<>();
    static ArrayList<Person> dinnerTable= new ArrayList<>();
    public static void serveDinner(){
        for (Person p:dinnerTable) {
            if(p.getSeat()!=-1)
                 p.setSittingAtTable(true);
        }
        for(Annoyable pest:pests)
        {pest.beAnnoying();
            for (Person p:dinnerTable) {
                p.setAnnoyed(true);
                System.out.println(p.getFullName()+" is annnoyed by "+pest.getClass().getSimpleName());
            }
        }
    }
    public static void main(String[] args) {
        Housefly fly=new Housefly();
        Mosquito mosquito=new Mosquito();
        Telemarketer telemarketer= new Telemarketer("Ion Ionescu",false,false,0,"Domestos");
        pests.add(fly);
        pests.add(mosquito);
        pests.add(telemarketer);
        Person p1=new Person("Mihai Eminescu",1,true,false);
        Person p2=new Person("Ion Creanga",2,true,false);
        Person p3=new Person("Titu Maiorescu",3,true,false);
        dinnerTable.add(p1);
        dinnerTable.add(p2);
        dinnerTable.add(p3);
        System.out.println("Dinner is served people are sitting in the dining room");
        serveDinner();

    }
}
