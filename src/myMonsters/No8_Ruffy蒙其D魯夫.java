package myMonsters;

public class No8_Ruffy»X¨äD¾|¤Ò extends Monster {
	static String name="»X¨äD¾|¤Ò Ruffy";
	static int att=1999;
	static int def=345;
	static int hp=9999;
	static int mp=500;
	public No8_Ruffy»X¨äD¾|¤Ò() {
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
			MagName="¾ó½¦JETºj";
			break;
		case 3:
			MagName="¾ó½¦JETÁ³±Û¼u";
			break;
		case 4:
			MagName="¾ó½¦¥¨¤H®ð²y";
			break;
		case 5:
			MagName="ÅQ®ð.ªZ¸Ë¦âµw¤Æ.¾ó½¦JETºj¶Ã¥´";
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
			MagDamage=-400;
			break;
		case 3:
			MagDamage=-600;
			break;
		case 4:
			MagDamage=-800;
			break;
		case 5:
			MagDamage=-1299;
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
