package test;

public class unit {
	String name;
	Faction faction;
	PlayWhether playWhether;
	
	public unit(String name, Faction faction, PlayWhether playWhether) {
		this.name = name;
		this.faction = faction;
		this.playWhether = playWhether;
	}
	
}
enum Faction{
	BLU_F,OPF_F,IND_F,CIV_F;
}
enum PlayWhether{
	player,nonPlayer;
}