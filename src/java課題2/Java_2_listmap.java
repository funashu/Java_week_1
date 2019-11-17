package java課題2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;



public class Java_2_listmap {

	public static void main(String args[]) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("えなみ");
		names.add("とべ");
		names.add("ふなき");

		for(String s:names) {
			System.out.println(s + "さん");
		}

		Map<String, Integer> prefs = new LinkedHashMap<String, Integer>();
		prefs.put("東京都", 1380);
		prefs.put("神奈川県", 905);
		prefs.put("大阪府", 881);
		for(String key : prefs.keySet()) {
			int value = prefs.get(key);

			System.out.println(key + "の人口は" + value + "万人です");
		}

	}

}



