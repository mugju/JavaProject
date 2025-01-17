//Four of kind, Full house, Small Straight, Large Straight, chance, Yachu

public class LowerPoint implements Check_score {
	private int fourkind;
	private int fullHouse;
	private int smallStraight;
	private int largeStraight;
	private int chance;
	private int yachu;

	public int getFourkind() {
		return fourkind;
	}

	public void setFourkind(int fourkind) {
		this.fourkind = fourkind;
	}

	public int getFullHouse() {
		return fullHouse;
	}

	public void setFullHouse(int fullHouse) {
		this.fullHouse = fullHouse;
	}

	public int getSmallStraight() {
		return smallStraight;
	}

	public void setSmallStraight(int smallStraight) {
		this.smallStraight = smallStraight;
	}

	public int getLargeStraight() {
		return largeStraight;
	}

	public void setLargeStraight(int largeStraight) {
		this.largeStraight = largeStraight;
	}

	public int getChance() {
		return chance;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}

	public int getYachu() {
		return yachu;
	} 

	public void setYachu(int yachu) {
		this.yachu = yachu;
	}

	public int checkScore(Dice dice[], int Scoreset) {
		boolean [] dicearr = {false,false,false,false,false,false,false}; // 0~6  코드의 가독성을 위해 0번은 비우둔 채로 진행.
		// 야추의 경우
		if (dice[0].number == dice[1].number && dice[1].number == dice[2].number && dice[2].number == dice[3].number
				&& dice[3].number == dice[4].number) {
			System.out.println("Yachu : " + 50);
		}
		else
			System.out.println("Yachu : " + 0);
		// chance의 경우
		int sum = 0;
		for (int i = 0; i < dice.length; i++) {
			sum += dice[i].number;
		}
		System.out.println("chance : " + sum);
		//four of kind의 경우
		int sameFour = 0;
		int resultFour = 0;
		for(int i = 0 ; i<dice.length; i++){
			sameFour = 0;
			if(dicearr[dice[i].number] == false) //스트레이트 확인용
				dicearr[dice[i].number] = true;
			
			for(int j = 0; j<dice.length; j++){
				if(dice[i].number == dice[j].number)
					sameFour++;
				if(sameFour >= 4){
					resultFour = sum; //맞을 경우에는 모든 주사위의 합 아닐경우에는 나가리
				}
			}
		}
		System.out.println("Four of kind : " + resultFour);
		//풀 하우스의 경우
		int full_check = 0;
		if(sameFour >= 3){ //일단 같은게 3개이상 있을떄 접근함.
			for(int i=0;i<dicearr.length;i++){
				if(dicearr[i] == true){
					full_check++;
				}
			}
		}
		int fullhouse = 0;
		if(full_check == 2){
			fullhouse = sum; //풀하우스일경우 모든 주사위의 합이 점수임
		}
		//라지스트레이트 의 경우
		
		int straight = 0;
		for(int i = 0; i<dicearr.length; i++){
			if(dicearr[i] == true){
				straight ++;
			}
			else{ //한번이라도 연속되지 않았을때
				straight = 0;
			}
		}
		int largeStraight = 0;
		int shortStraight = 0;
		if(straight == 5){
			largeStraight = 30;
			System.out.println("Large Straight : " + largeStraight);
		}
		else
			System.out.println("Large Straight : " + largeStraight);
		
		if(straight >= 4){
			shortStraight = 15;
			System.out.println("Short Straight : " + shortStraight);
		}
		else
			System.out.println("Short Straight : " + largeStraight);
		
		if(Scoreset == 7){return resultFour;}
		else if(Scoreset == 8){return fullhouse;} //fullhouse자리
		else if(Scoreset == 9){return shortStraight;}
		else if(Scoreset == 10){return largeStraight;}
		else if(Scoreset == 11){return sum;}
		else if(Scoreset == 12){return 50;}
		else
			return 0; //컴파일 오류때문에 적어놓음
	}
	
	
	public void setScore(Dice dice[], int Scoreset){
		switch (Scoreset) {
		case 7:
			this.setFourkind(this.checkScore(dice, Scoreset));
			break;
		case 8:
			this.setFullHouse(this.checkScore(dice, Scoreset));
			break;
		case 9:
			this.setSmallStraight(this.checkScore(dice, Scoreset));
			break;
		case 10:
			this.setLargeStraight(this.checkScore(dice, Scoreset));
			break;
		case 11:
			this.setChance(this.checkScore(dice, Scoreset));
			break;
		case 12:
			this.setYachu(this.checkScore(dice, Scoreset));
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		return "LowerPoint [fourkind=" + fourkind + ", fullHouse=" + fullHouse + ", smallStraight=" + smallStraight
				+ ", largeStraight=" + largeStraight + ", chance=" + chance + ", yachu=" + yachu + "]";
	}

}