package League;
import java.util.ArrayList;
import java.util.Iterator;

public class LeaguePublic extends TeamComponent{//add teams to league and call submethod on each team to print stats when iterating through league
	
	ArrayList teamComponents = new ArrayList();
	
	public String leagueName;

    public LeaguePublic(String newLeagueName){
    	leagueName = newLeagueName;
    }
        
    public String getleagueName() { return leagueName; }

    public void add(TeamComponent newTeamComponent) {
        teamComponents.add(newTeamComponent);
    }

    public void remove(TeamComponent newTeamComponent) {
	    teamComponents.remove(newTeamComponent);
     } 

    public TeamComponent getComponent(int componentIndex) { 	
        return (TeamComponent)teamComponents.get(componentIndex);
        }
    
    public void updatePoints(int points) {
    	 Iterator teamIterator = teamComponents.iterator();

         while(teamIterator.hasNext()) {
             TeamComponent teamInfo = (TeamComponent) teamIterator.next();
             teamInfo.updatePoints(points);}
    }

    public void displayTeamInfo(){
        Iterator teamIterator = teamComponents.iterator();

        while(teamIterator.hasNext()) {
            TeamComponent teamInfo = (TeamComponent) teamIterator.next();
            teamInfo.displayTeamInfo();
        }
        		
    }
}

    

