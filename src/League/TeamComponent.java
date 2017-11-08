package League;
//acts as interface for every Team
public abstract class TeamComponent{//safety vs transparency in composite which did you go for?

   /*Throw UnsupportedOperationException so that if
     it doesn't make sense for a team, or the league
     to inherit a method they can just inherit the
     default implementation */

	public void add(TeamComponent newTeamComponent) {
		
		throw new UnsupportedOperationException();
	}
	
	public void remove(TeamComponent newTeamComponent) {
		
		throw new UnsupportedOperationException();
	}
	
    public TeamComponent getComponent(int componentIndex) {
		
		throw new UnsupportedOperationException();
	}
    
    public String getTeamUser() {
    	
  		throw new UnsupportedOperationException();
      }
    
    public String getLeagueName() {
  		throw new UnsupportedOperationException();

    }
    public String getLeagueDescription() {
  		throw new UnsupportedOperationException();

    }
	public void updatePoints() {
  		throw new UnsupportedOperationException();
	}
    
    public String getTeamName() {
    	
		throw new UnsupportedOperationException();
    }
    
    public int getPoints() {
		throw new UnsupportedOperationException();

    }
    
    public int getPosition() {
		throw new UnsupportedOperationException();

    }
    public String displayLeagueTeams(){
		throw new UnsupportedOperationException();

    }
    //When called by class object that extends this class 
    //it will print info specific to the team
    public String displayTeamInfo() {
		throw new UnsupportedOperationException();

    }

}
