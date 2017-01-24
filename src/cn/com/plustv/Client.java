package cn.com.plustv;
public class Client {

	public static void main(String[] args) {
		SmartCard smartCard = new SmartCard();
	boolean tjSDK = smartCard.tjSDK("dd");
		System.out.println("*******"+tjSDK);
	}
}
   