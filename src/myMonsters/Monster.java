package myMonsters;

public class Monster implements MonsterMethods{
	static String Name;
	static int ATT;
	static int DEF;
	static int HP;
	static int MP;
	protected  Monster(String name,int att,int def,int hp,int mp) {
		Name=name;
		ATT=att;
		DEF=def;
		HP=hp;
		MP=mp;
	}
	
	public Monster() {
		
	}

	@Override
	public String getName() {
		return Name;
	}

	@Override
	public String getMagName(int magLv) {
		return null;
	}

	@Override
	public int getMagDamage(int magLv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMagCost(int magLv) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getAblt() {
		return "ATT = "+ATT+"\nDEF = "+DEF;
	}
	public String getHPMP(){
		return "HP = "+HP+"\nMP = "+MP;
	}
	public int getAtt() {
		return ATT;
	}public int getDEF() {
		return DEF;
	}public int getHP() {
		return HP;
	}public int getMP() {
		return MP;
	}
	public void setHP(int Damage) {
		HP+=Damage;
	}
	public void setMP(int Damage) {
		MP+=Damage;
	}
}
