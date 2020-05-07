package kp.entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Elections {
    HashMap<Admin, Intern> choices;

    public HashMap<Admin, Intern> getChoices() {
        return choices;
    }

    public void putChoice(Admin admin, Intern intern) {
        choices.put(admin, intern);
    }

    public Intern findInternByMaxVote(){
        ArrayList<Intern> list = (ArrayList<Intern>) choices.values();
        return null;
    }

    public void clear(){
        choices.clear();
    }
}
