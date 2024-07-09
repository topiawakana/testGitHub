package code13_01;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
//		h.name = "ミナト";
		h.setName("");
		System.out.println(h.getName());
		
		h.setHp(100);
		System.out.println(h.getHp());
		//インスタンスを作成して変数に代入し、セッターで渡す方法
		Sword s = new Sword("炎の剣", 10);
		h.setSword(s);
		
		//セッターの引数で直接インスタンスを生成する方法
		h.setSword(new Sword("炎の剣", 10));
		
		System.out.println(h.getSword().getName());
		System.out.println(h.getSword().getDamage());
		
	}

}
