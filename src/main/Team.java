package main;
// world cup simulation : 48 teams 

public class Team implements Comparable<Team>{
	int wins = 0;
	int losses = 0;
	int ties = 0;
	int points = 0;
	int ranking; 
	String name;
	Region division;
	public Team (String name, Region division, int ranking) {
		this.name = name;
		this.division = division;
		this.ranking = ranking;
	}
	
	public void compete(Team rival) {
		// temp just for testing 
		double constant;
		double coeff = .6;
		double modifier = 400;
		if (this.ranking > rival.ranking) {
			constant = (coeff)*((rival.ranking - modifier)/(this.ranking - modifier));
		}
		else {
			constant = (coeff)*((this.ranking - modifier)/(rival.ranking - modifier));
		}
	    double random = Math.random();
		if (random < constant) {
			this.ties++;
			rival.ties++;
			this.points++;
			rival.points++;
		}
		else {
			int constant2 = 850;
			//modify constant as you see fit
			//must be greater than the lowest team's ranking (858)
			int rank_a = this.ranking - constant2;
			int rank_b = rival.ranking - constant2;
			int rank_add = rank_a + rank_b;
			int random2 = (int)(Math.random()*rank_add);
			if (random2 < rank_a) {
				this.wins++;
				rival.losses++;
				this.points += 3;
			}
			else {
				this.losses++;
				rival.wins++;
				rival.points += 3;
			}
		}					
	}
	
	public boolean postCompete(Team rival) {
		int constant = 1300;
		//modify constant as you see fit
		//must be greater than the lowest team's ranking (858)
		int rank_a = this.ranking - constant;
		int rank_b = rival.ranking - constant;
		int rank_add = rank_a + rank_b;
		int random = (int)(Math.random()*rank_add);
		if (random < rank_a) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Team rival) {
		return rival.points - this.points;
	}
	
	public void setPoints() {
		points = 0;
	}
}
