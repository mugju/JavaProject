class House{
	int price;
	String dong;
	int size;
	String kind;
	
	public House(){
		this(10000,"은행동",32,"아파트");
	}

	public House(int price, String dong, int size, String kind) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.dong = dong;
		this.size = size;
		this.kind = kind;
	}
}