class Sawon3{
	String name = "ȫ�浿";
	
}

class Sales3 extends Sawon3{
	String name = "�赿��";
	String displayInfoLocal(){
		String name = "�ֹμ�";
		return name;
	}
	String displayInfoThis(){
		return this.name;
	}
}