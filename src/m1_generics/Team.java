package m1_generics;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player>{//later we did generic//T can be soccer or football or baseball player
    //Now I can create any team
    //assume that student say I wanna join football or soccer team//create team
    //Should accept only Player class and subclasses=>Team<T extends Player>
    //T should be child of player class
private String name;//team name
    //who is gonna join list of members
 //   private List<Player> members=new ArrayList<>(); //the members belongs to player classs
    //polymorphisim //I can put football player baseball player
    private List<T> members = new ArrayList<T>();


    public Team(String name) {//with name
        this.name = name;
    }

public boolean addPlayer(T player){
//                 it was Player ->T we are making everything generic
    if(members.contains(player)){//we are checking//if it is already on the team
        System.out.println(((Player)player).getName()+ " is already on the team");
        return false;
    }else{
        members.add(player);
        System.out.println(((Player)player).getName()+" picked for team"+this.name);//*this.name*
       // for to access to Player from T->Player casting
        return true;
    }

}

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
