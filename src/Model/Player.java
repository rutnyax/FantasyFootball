package Model;

import java.util.ArrayList;
import java.util.List;


public class Player {
	
	private int player_id;
	private String player_fname;
	private String player_lname;
	private String player_position;
	private int player_injured;
	private String player_team;
	private int player_points;
	private List<Player> team_members;
	//private List<Player> goalies;
	//private List<Player> defenders;
	//private List<Player> midfielders;
	//private List<Player> attackers;

	public Player(int player_id, String player_fname, String player_lname, String player_position, int player_injured, String player_team, int player_points){
		this.player_id = player_id;
		this.player_fname = player_fname;
		this.player_lname = player_lname;
		this.player_position = player_position;
	    this.player_injured = player_injured;
	    this.player_team = player_team;
	    this.player_points = player_points;
	    team_members = new ArrayList<Player>();
	    //goalies = new ArrayList<Player>();
	    //defenders = new ArrayList<Player>();
	    //midfielders = new ArrayList<Player>();
	    //attackers = new ArrayList<Player>();
	}
	
	//team
	public void add(Player p) {
		team_members.add(p);
	   }

	   public void remove(Player p) {
		   team_members.remove(p);
	   }

	   public List<Player> getTeamMembers(){
	     return team_members;
	   }

	public String toString(){
	      return ("Name: " + player_fname + player_lname + "\tPosition: "+ player_position + "\tAvailability: " + player_injured + "\tTeam: " + player_team + "\t\t\tPoints: " + player_points);
	   }   
	
	/*//goalies
	public void addGoalie(Player p) {
	      goalies.add(p);
	   }

	   public void removeGoalie(Player p) {
	      goalies.remove(p);
	   }

	   public List<Player> getGoalies(){
	     return goalies;
	   }

	public String goaliesToString(){
	      return ("Goalies :[ Name : " + player_name + ", Availability : " + player_availability + ", Points :" + player_points+" ]");
	   }   
	
	//defenders
	public void addDef(Player p) {
	      defenders.add(p);
	   }

	   public void removeDef(Player p) {
		   defenders.remove(p);
	   }

	   public List<Player> getDefenders(){
	     return defenders;
	   }
	   
	public String defendersToString(){
	      return ("Defenders :[ Name : " + player_name + ", Availability : " + player_availability + ", Points :" + player_points+" ]");
	   }   
	
	//midfielders
	public void addMid(Player p) {
	      midfielders.add(p);
	   }

	   public void removeMid(Player p) {
		   midfielders.remove(p);
	   }

	   public List<Player> getMid(){
	     return midfielders;
	   }
	   
	public String MidToString(){
	      return ("Midfielders :[ Name : " + player_name + ", Availability : " + player_availability + ", Points :" + player_points+" ]");
	   }  
	
	//attackers
		public void addAtt(Player p) {
			attackers.add(p);
		   }

		   public void removeAtt(Player p) {
			   attackers.remove(p);
		   }

		   public List<Player> getAtt(){
		     return attackers;
		   }
		   
		public String AttToString(){
		      return ("attackers :[ Name : " + player_name + ", Availability : " + player_availability + ", Points :" + player_points+" ]");
		   } */ 
	
	
	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	
	public String getPlayer_position() {
		return player_position;
	}

	public void setPlayer_position(String player_position) {
		this.player_position = player_position;
	}

	public String getPlayer_fname() {
		return player_fname;
	}

	public void setPlayer_fname(String player_fname) {
		this.player_fname = player_fname;
	}
	

	public String getPlayer_lname() {
		return player_lname;
	}

	public void setPlayer_lname(String player_lname) {
		this.player_lname = player_lname;
	}

	public int getPlayer_injured() {
		return player_injured;
	}

	public void setPlayer_injured(int player_injured) {
		this.player_injured = player_injured;
	}
	
	public String getPlayer_team() {
		return player_team;
	}

	public void setPlayer_team(String player_team) {
		this.player_team = player_team;
	}
	
	public int getPlayer_points() {
		return player_points;
	}

	public void setPlayer_points(int player_points) {
		this.player_points = player_points;
	}

}
