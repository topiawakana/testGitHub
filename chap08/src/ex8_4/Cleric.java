package ex8_4;

public class Cleric {
	String name;
	
	final int MAX_HP = 50;
	int hp = this.MAX_HP;
	
	final int MAX_MP = 10;
	int mp = this.MAX_MP;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println(this.name + "はセルフエイドの魔法をとなえた！");
		System.out.println(this.name + "の体力は全快した！");
		System.out.println("HP:" + this.hp + "/MP:" + this.mp);
	}
	public int pray(int sec) {
		//回復する予定のポイント…(A)
//		int recover = new Random().nextInt(3) + sec;
		int recover = (int)(Math.random() * 3) + sec;
		//現在減っているhp…(B)
		int delta = this.MAX_MP - this.mp;
		//実際の回復量(返り値に使用）
		int recoverActual = 0;
		
		//方法①(A)と(B)を比較する
		if (recover < delta) {
			this.mp += recover;
			recoverActual = recover;
		}else {
			this.mp = this.MAX_MP;
			recoverActual = delta;
		}
		
		//方法②(A)と(B)のうち、小さいほうをhpに足す
//		recoverActual = Math.min(recover, delta);
//		this.mp += recoverActual;
		
		//方法③先にrecoverを足し、
		//それがMAX_HPを超えているならMAX_HPに戻す
		this.mp += recover;
		if (this.mp > this.MAX_MP) {
			this.mp = this.MAX_MP;
			recoverActual = delta;
		}else {
			recoverActual = recover;
		}
		
		//メッセージを表示し、回復したポイントを返す
		System.out.println(this.name + "は祈った");
		System.out.println("MPが" + recoverActual + "ポイント回復した");
		System.out.println("HP:" + this.hp + "/MP:" + this.mp);
		return recoverActual;
	}
}
