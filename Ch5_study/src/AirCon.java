class AirCon{
	// ���� ����
	String company;
	String color;
	int price;
	int size;
	int temp;	//�µ�
	
	
	//�޼ҵ� ����.
	
	void powerOn(){
		System.out.println("power on");
	}
	
	void powerOff(){
		System.out.println("power off");
	}
	
	void tempUp(){
		temp++;
		System.out.println("temp up");
	}
	
	void tempDown(){
		temp--;
		System.out.println("temp down");
	}
}