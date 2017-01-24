package cn.com.plustv;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TestDemo6 {
	static SmartCard sc = new SmartCard();
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	                                                                         
	public static void main(String[] args) throws Exception {

		// 创建SAXReader对象
		SAXReader reader = new SAXReader();
		// 读取文件，取得Document
		Document document = reader.read(new FileInputStream("D:/bizcode_20170123172330.xml"));
		// 取得根标签对象，得到books的标签
		Element root = document.getRootElement();
		// 根据实际需要取得相应的值
		List<Element> elements = root.elements();

		// List<String> list = new ArrayList<>();
		// for (String picName : list) {
		// sc.tjSDK("D:/" + picName);
		// }

		for (Element element : elements) {
			// 解析xml文件获取图片名称
			String picName = element.elementText("pic");
			String onlinetime = element.elementText("onlinetime");
			Date parse = simpleDateFormat.parse(onlinetime);
			//String format = simpleDateFormat.format(onlinetime);
			System.out.println(parse.getTime());
			//System.out.println(parse);
			//System.out.println(parse.getTime());1485222719084   1485219600000
			                                      
			
		
//			Long valueOf = Long.valueOf(onlinetime);
//			System.out.println(valueOf);
//			String onlinetime2 = simpleDateFormat.format(valueOf * 1000);
//
//      		Date onlinetimeDate = simpleDateFormat.parse(onlinetime2);
//      		System.out.println(onlinetimeDate.getTime());
//      		long time = onlinetimeDate.getTime();
//      		System.out.println(time);
//			System.out.println(onlinetimeDate.getTime());
//			Date date = simpleDateFormat.parse(onlinetime);
//			System.out.println(date);
			//System.out.println(date.getTime());
//			long lOnlinetime = Long.valueOf(onlinetime) * 1000;
//			System.out.println(lOnlinetime);
			// list.add(picName);
//			sc.tjSDK("D:/" + picName);
		}
//		Integer cacheTime = 1000;
//		Timer timer = new Timer();
//		// (TimerTask task, long delay, long period)任务，延迟时间，多久执行
//		timer.scheduleAtFixedRate(new TimerTask() {
//
//			@Override
//			public void run() {
//				try {
//
//					// 创建SAXReader对象
//					SAXReader reader = new SAXReader();
//					// 读取文件，取得Document
//					Document document = reader.read(new FileInputStream("D:/bizcode_20170123172330.xml"));
//					// 取得根标签对象，得到books的标签
//					Element root = document.getRootElement();
//					// 根据实际需要取得相应的值
//					List<Element> elements = root.elements();
//
//					// List<String> list = new ArrayList<>();
//					// for (String picName : list) {
//					// sc.tjSDK("D:/" + picName);
//					// }
//
////					long now = new Date().getTime();
////					System.out.println("time is " + now);
////					List<Element> elementList = new ArrayList<>();
////
////					List<Element> elementList2 = new ArrayList<>();
//
//					for (Element element : elements) {
//						// 解析xml文件获取图片名称
//						String picName = element.elementText("pic");
//						// list.add(picName);
//						// 解析xml获取上线时间
//						String onlinetime = element.elementText("onlinetime");
//						long lOnlinetime = Long.valueOf(onlinetime) * 1000;
//						System.out.println("target time is " + lOnlinetime);
//
//						if (now - lOnlinetime >= 0 && now - lOnlinetime < 1000) {
//							elementList.add(element);
//						}
//						// 解析xml获取下线时间
//						String offlineTime = element.elementText("offlineTime");
//						long lOfflineTime = Long.valueOf(offlineTime) * 1000;
//						if (now - lOfflineTime >= 0 && now - lOfflineTime < 1000) {
//							elementList2.add(element);
//						}
//						// 解析xml获取下线时间
//						// String offlineTime =
//						// element.elementText("offlineTime");
//						// long lOfflineTime = Long.valueOf(offlineTime);
//						// String onlinetime2 =
//						// simpleDateFormat.format(lOnlinetime * 1000);
//						// Date onlinetimeDate =
//						// simpleDateFormat.parse(onlinetime2);
//						// String offlineTime2 =
//						// simpleDateFormat.format(lOfflineTime * 1000);
//						// Date offlineTimeDate =
//						// simpleDateFormat.parse(offlineTime2);
//						// map.put(picName, onlinetimeDate);
//
//					}
//					System.out.println("dddddddd");
//					// System.out.println(map);
//					// for (String keyPicName : keySet) {
//					// System.out.println(map.get(keyPicName));
//					// System.out.println(new Date());
//					// if (map.get(keyPicName) == new Date()) {
//					// c
//					// System.out.println("ggggggggggggggggggggggg");
//					// }
//					// }
//					// 如果到了上线时间会执行此方法
//					for (Element element : elementList) {
//						String picName = element.elementText("pic");
//						String onlinetime = element.elementText("onlinetime");
//						String offlineTime = element.elementText("offlineTime");
//						sc.tjSDK03("/logo/" + picName, 0, 0, true);
//						System.out.println("start to upload " + picName);
//					}
//					// elementList.stream().forEach(element -> {
//					// String picName = element.elementText("pic");
//					// String onlinetime = element.elementText("onlinetime");
//					// String offlineTime = element.elementText("offlineTime");
//					// sc.tjSDK03("/logo/" + picName, 0, 0, true);
//					// System.out.println("start to upload " + picName);
//					//
//					// });
//					// 如果到了下线时间 会执行此方法
//					for (Element element : elementList2) {
//						String picName = element.elementText("pic");
//						sc.tjSDK04("/logo/" + picName);
//						System.out.println("end to upload " + picName);
//					}
//					// elementList2.stream().forEach(element -> {
//					// String picName = element.elementText("pic");
//					// sc.tjSDK04("/logo/" + picName);
//					// System.out.println("end to upload " + picName);
//					//
//					// });
//
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			} 
//
//		}, 0, cacheTime);

	}
}
