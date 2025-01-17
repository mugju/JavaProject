public class UpperPoint implements Check_score {
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

	public void isBonus() {
		if ((this.onePoint + this.twoPoint + this.threePoint + this.fourPoint + this.fivePoint + this.sixPoint) > 63) {
			this.bonus = 60;
		}
	}

	public int checkScore(Dice dice[], int Scoreset) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (dice[i].number == 1) {
				count++;
			}
		}
		System.out.println("OnePoint : " + 1 * count);
		int onepoint = 1 * count;
		count = 0;
		for (int i = 0; i < 5; i++) {
			if (dice[i].number == 2) {
				count++;
			}
		}
		System.out.println("twoPoint : " + 2 * count);
		int twopoint = 2 * count;
		count = 0;
		for (int i = 0; i < 5; i++) {
			if (dice[i].number == 3) {
				count++;
			}
		}
		System.out.println("threePoint : " + 3 * count);
		int threepoint = 3 * count;
		count = 0;
		for (int i = 0; i < 5; i++) {
			if (dice[i].number == 4) {
				count++;
			}
		}
		System.out.println("fourPoint : " + 4 * count);
		int fourpoint = 4 * count;
		count = 0;
		for (int i = 0; i < 5; i++) {
			if (dice[i].number == 5) {
				count++;
			}
		}
		System.out.println("fivePoint : " + 5 * count);
		int fivepoint = 5 * count;
		count = 0;
		for (int i = 0; i < 5; i++) {
			if (dice[i].number == 6) {
				count++;
			}
		}
		System.out.println("sixPoint : " + 6 * count);
		int sixpoint = 6 * count;
		if (Scoreset == 1) {
			return onepoint;
		} 
		else if (Scoreset == 2) {
			return twopoint;
		} // fullhouse자리
		else if (Scoreset == 3) {
			return threepoint;
		} 
		else if (Scoreset == 4) {
			return fourpoint;
		} 
		else if (Scoreset == 5) {
			return fivepoint;
		} 
		else if (Scoreset == 6) {
			return sixpoint;
		} 
		else
			return 0; // 컴파일 오류때문에 적어놓음

	}

	public void setScore(Dice dice[], int Scoreset) {
		switch (Scoreset) {
		case 1:
			this.setOnePoint(this.checkScore(dice, Scoreset));
			break;
		case 2:
			this.setTwoPoint(this.checkScore(dice, Scoreset));
			break;
		case 3:
			this.setThreePoint(this.checkScore(dice, Scoreset));
			break;
		case 4:
			this.setFourPoint(this.checkScore(dice, Scoreset));
			break;
		case 5:
			this.setFivePoint(this.checkScore(dice, Scoreset));
			break;
		case 6:
			this.setSixPoint(this.checkScore(dice, Scoreset));
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		return "UpperPoint [onePoint=" + onePoint + ", twoPoint=" + twoPoint + ", threePoint=" + threePoint
				+ ", fourPoint=" + fourPoint + ", fivePoint=" + fivePoint + ", sixPoint=" + sixPoint + "]";
	}

}