package ec.edu.espe.dailyDevHM.view;
import ec.edu.espe.dailyDevHM.model.Projects;
import ec.edu.espe.dailyDevHM.model.Team;

/**
 *
 * @author Antonio Revilla
 */

public class DailyDevSystem {
    
    public static void main(String[] args){
        //ArrayList<Developers> developers = new ArrayList<>();
        Projects[] projects = new Projects[2];
        Team team;
        
        //developers.add(new Developers());
        //developers.add(new Developers());
        //developers.add(new Developers());
        
        projects[0] = new Projects(1,5,"Task App Develoment");
        projects[1] = new Projects(2,3,"Sales App Develoment");
  
        team = new Team(1,"CodingNinjas", 1, projects);
        
        System.out.println("Team --> " + team);
    }
    
}
