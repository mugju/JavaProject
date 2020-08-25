public class UpperPoint{
	private int onePoint;
	private int twoPoint;
	private int threePoint;
	private int fourPoint;
	private int fivePoint;
	private int sixPoint;
	
	private int bonus;
	
	
	public int getOnePoint() {
		return onePoint;
	}
	public void setOnePoint(int onePoint) {
		this.onePoint = onePoint;
	}
	public int getTwoPoint() {
		return twoPoint;
	}
	public void setTwoPoint(int twoPoint) {
		this.twoPoint = twoPoint;
	}
	public int getThreePoint() {
		return threePoint;
	}
	public void setThreePoint(int threePoint) {
		this.threePoint = threePoint;
	}
	public int getFourPoint() {
		return fourPoint;
	}
	public void setFourPoint(int fourPoint) {
		this.fourPoint = fourPoint;
	}
	public int getFivePoint() {
		return fivePoint;
	}
	public void setFivePoint(int fivePoint) {
		this.fivePoint = fivePoint;
	}
	public int getSixPoint() {
		return sixPoint;
	}
	public void setSixPoint(int sixPoint) {
		this.sixPoint = sixPoint;
	}
	
	public void isBonus(){
		if((this.onePoint + this.twoPoint + this.threePoint + this.fourPoint + this.fivePoint + this.sixPoint) > 63){
		this.bonus = 60;	
		}
	}
	
	public void checkScore(Dice dice[]){
		int count = 0;
		for(int i = 0; i<5;i++){
			if(dice[i].number == 1){count ++;}
		}
		System.out.println("OnePoint : " + 1*count);
		
		count = 0;
		for(int i = 0; i<5;i++){
			if(dice[i].number == 2){count ++;}
		}
		System.out.println("twoPoint : " + 2*count);
		
		count = 0;
		for(int i = 0; i<5;i++){
			if(dice[i].number == 3){count ++;}
		}
		System.out.println("threePoint : " + 3*count);
		
		count = 0;
		for(int i = 0; i<5;i++){
			if(dice[i].number == 4){count ++;}
		}
		System.out.println("fourPoint : " + 4*count);
		
		count = 0;
		for(int i = 0; i<5;i++){
			if(dice[i].number == 5){count ++;}
		}
		System.out.println("fivePoint : " + 5*count);
		
		count = 0;
		for(int i = 0; i<5;i++){
			if(dice[i].number == 6){count ++;}
		}
		System.out.println("sixPoint : " + 6*count);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "UpperPoint [onePoint=" + onePoint + ", twoPoint=" + twoPoint + ", threePoint=" + threePoint
				+ ", fourPoint=" + fourPoint + ", fivePoint=" + fivePoint + ", sixPoint=" + sixPoint + "]";
	}
	
}