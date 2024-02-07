package ec.edu.espe.question33.model;

import ec.edu.espe.question33.utils.FileHandler;
import java.util.ArrayList;
import ec.edu.espe.question33.helpers.Constants;

/**
 *
 * @author mateo
 */
public class SoccerPlayer {

    private int id;
    private String name;
    private boolean isProfessional;
    private int age;

    public SoccerPlayer(String name, boolean isProfessional, int age) {
        FileHandler<SoccerPlayer> fileHandler = new FileHandler();
            
        this.id = (fileHandler.readJSONListSoccerPlayer(new Constants().SOCCER_PLAYERS_FILE_PATH).getLast() != null)? 
                fileHandler.readJSONListSoccerPlayer(new Constants().SOCCER_PLAYERS_FILE_PATH).getLast().getId() + 1 : 1;
        
        this.name = name;
        this.isProfessional = isProfessional;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsProfessional() {
        return isProfessional;
    }

    public void setIsProfessional(boolean isProfessional) {
        this.isProfessional = isProfessional;
    }

    @Override
    public String toString() {
        String soccerPlayerInfo = "";
        soccerPlayerInfo += "-------------\n"
                + "id=  " + id + "\n"
                + "name= " + name + "\n";
        soccerPlayerInfo += (isProfessional)? "yes" : "no";
        return soccerPlayerInfo;
    }

    public ArrayList<SoccerPlayer> getSoccerPlayerDataBase() {
        FileHandler fileHandler = new FileHandler();
        ArrayList<SoccerPlayer> soccerPlayerDataBase = fileHandler.readJSONListSoccerPlayer(new Constants().SOCCER_PLAYERS_FILE_PATH);
        return soccerPlayerDataBase;
    }

    public void addNewSoccerPlayer(SoccerPlayer soccerPlayer) {
        FileHandler fileHandler = new FileHandler();
        ArrayList<SoccerPlayer> soccerPlayerDataBase = fileHandler.readJSONListSoccerPlayer(new Constants().SOCCER_PLAYERS_FILE_PATH);
        soccerPlayerDataBase.add(soccerPlayer);
        fileHandler.saveJSONFile(soccerPlayerDataBase, new Constants().SOCCER_PLAYERS_FILE_PATH);
    }

}
