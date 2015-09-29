package myMonsters;

public class No1_Minotaur¦Ì³³¿Õ´µ extends Monster  {
	static String name="¦Ì³³¿Õ´µMinotaur";
	static int att=999;
	static int def=400;
	static int hp=9999;
	static int mp=500;
	public No1_Minotaur¦Ì³³¿Õ´µ() {
		super(name, att, def, hp, mp);
	}
	
	int MagCost,MagDamage;
	String MagName;
	
	@Override
	public String getMagName(int magLv) {
		switch (magLv) {
		case 1:
			MagName="«ì´_";
			break;
		case 2:
			MagName="¯Pª¢³N";
			break;
		case 3:
			MagName="¤õ¨c°g°ì";
			break;
		case 4:
			MagName="¯u.¦aº»·~¤õ";
			break;
		case 5:
			MagName="²×·¥.¹k¥Û¬P©]";
			break;
		}
		return MagName;
	}
	@Override
	public int getMagDamage(int magLv) {
		switch (magLv) {
		case 1:
			MagDamage=123;
			break;
		case 2:
			MagDamage=-500;
			break;
		case 3:
			MagDamage=-700;
			break;
		case 4:
			MagDamage=-800;
			break;
		case 5:
			MagDamage=-1099;
			break;
		}
		return MagDamage;
	}
	@Override
	public int getMagCost(int magLv) {
		switch (magLv) {
		case 1:
			MagCost=30;
			break;
		case 2:
			MagCost=30;
			break;
		case 3:
			MagCost=60;
			break;
		case 4:
			MagCost=120;
			break;
		case 5:
			MagCost=300;
			break;
		}
		return MagCost;
	}
	
}
