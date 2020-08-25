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

	public void checkScore(Dice dice[]) {
		boolean [] dicearr = {false,false,false,false,false,false,false}; // 0~6  �ڵ��� �������� ���� 0���� ���� ä�� ����.
		// ������ ���
		if (dice[0].number == dice[1].number && dice[1].number == dice[2].number && dice[2].number == dice[3].number
				&& dice[3].number == dice[4].number) {
			System.out.println("Yachu : " + 50);
		}
		else
			System.out.println("Yachu : " + 0);
		// chance�� ���
		int sum = 0;
		for (int i = 0; i < dice.length; i++) {
			sum += dice[i].number;
		}
		System.out.println("chance : " + sum);
		//four of kind�� ���
		int sameFour = 0;
		int resultFour = 0;
		for(int i = 0 ; i<dice.length; i++){
			sameFour = 0;
			if(dicearr[dice[i].number] == false) //��Ʈ����Ʈ Ȯ�ο�
				dicearr[dice[i].number] = true;
			
			for(int j = 0; j<dice.length; j++){
				if(dice[i].number == dice[j].number)
					sameFour++;
				if(sameFour >= 4){
					resultFour = sum; //���� ��쿡�� ��� �ֻ����� �� �ƴҰ�쿡�� ������
				}
			}
		}
		System.out.println("Four of kind : " + resultFour);
		
		//������Ʈ����Ʈ �� ���
		//boolean [] dicearr = {false,false,false,false,false,false,false}; // 0~6  �ڵ��� �������� ���� 0���� ���� ä�� ����.
		int straight = 0;
		for(int i = 0; i<dicearr.length; i++){
			if(dicearr[i] == true){
				straight ++;
			}
			else{ //�ѹ��̶� ���ӵ��� �ʾ�����
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
	}

	@Override
	public String toString() {
		return "LowerPoint [fourkind=" + fourkind + ", fullHouse=" + fullHouse + ", smallStraight=" + smallStraight
				+ ", largeStraight=" + largeStraight + ", chance=" + chance + ", yachu=" + yachu + "]";
	}

}