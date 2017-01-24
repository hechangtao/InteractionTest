package cn.com.plustv;

import org.junit.Test;

public class TestSdk {
	SmartCard sc = new SmartCard();

	@Test
	public void test01() {

		//测试方法一：通过
		boolean tjSDK = sc.tjSDK("D:/200311000100101.tga");
		System.out.println(tjSDK);
	}

	@Test
	public void test02() {
		//测试方法二：通过
		boolean tjSDK02 = sc.tjSDK02("/logo/200311000100101.tga");
		System.out.println(tjSDK02);
	}

	@Test
	public void test03() {
		//测试方法三：通过
		boolean tjSDK03 = sc.tjSDK03("/logo/200311000100101.tga", 0, 0, true);
		System.out.println(tjSDK03);
	}

	@Test
	public void test04() {
		//测试方法四：通过
		boolean tjSDK04 = sc.tjSDK04("/logo/out2_20170110_1_6x1080.tga");
		System.out.println(tjSDK04);
	}

	@Test
	public void test05() {
		//测试方法五：通过
		int   freeSpace=0;
		boolean tjSDK05 = sc.tjSDK05(freeSpace);
		System.out.println(tjSDK05);
	}

	@Test
	public void test06() {
		//测试方法六：通过
		int fileNums =0;
		boolean tjSDK06 = sc.tjSDK06("/logo/clock.tga", fileNums);
		System.out.println(tjSDK06);
	}

	@Test
	public void test07() {
		//测试方法七：通过
		boolean tjSDK07 = sc.tjSDK07(404, "好的 好的好的");
		System.out.println(tjSDK07);
	}

	@Test
	public void test08() {
		//测试方法八：通过
		boolean tjSDK08 = sc.tjSDK08();
		System.out.println(tjSDK08);
	}

	@Test
	public void test09() {
		//测试方法九：通过
		int fileNums =0;
		boolean tjSDK09 = sc.tjSDK09("/logo/clock.tga", fileNums);
		System.out.println(tjSDK09);
	}

	@Test
	public void test10() {
		//测试方法十：通过
		//SmartCard sc = new SmartCard();
		M2cLogoInfo_t m2cLogoInfo_t = new M2cLogoInfo_t();
		m2cLogoInfo_t.setHeight((short) 200);
		m2cLogoInfo_t.setName("sdk");
		m2cLogoInfo_t.setOx((short) 200);
		m2cLogoInfo_t.setOy((short) 200);
		m2cLogoInfo_t.setShowit(1000);
		m2cLogoInfo_t.setWidth((short) 100);
		//boolean tjSDK10 = sc.tjSDK10("plustv", m2cLogoInfo_t);
		sc.tjSDK10("/logo/clock.tga", m2cLogoInfo_t);
		//System.out.println(tjSDK10);

	}

}
