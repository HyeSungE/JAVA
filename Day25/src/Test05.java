enum Data{
	¥��(4000), «��(6000), ����(12000), ����(20000), ����(24000),
	ġŲ(17000), �߹�(18000), ����(3000), ��â(15000);
	int price;
	Data(int price){
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}

public class Test05 {
	public static void main(String[] args) {
		Data[] data = Data.values();
		for(int i=0; i<data.length; ++i) {
			System.out.print("name : " + data[i].name());
			System.out.println(" , price : " + data[i].getPrice());
		}
	}
}
