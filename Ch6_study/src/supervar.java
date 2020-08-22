class Sawon3{
	String name = "È«±æµ¿";
	
}

class Sales3 extends Sawon3{
	String name = "±èµ¿Çõ";
	String displayInfoLocal(){
		String name = "ÃÖ¹Î¼ö";
		return name;
	}
	String displayInfoThis(){
		return this.name;
	}
}