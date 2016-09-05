package WrittenExam.JD.CaiGouDan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] prices = new int[n];
			for (int i = 0; i < n; i++) {
				int price = sc.nextInt();
				prices[i] = price;
			}
			Arrays.sort(prices);
			HashMap<String, Integer> hm = new HashMap<>();
			for (int j = 0; j < m; j++) {
				String good = sc.next();
				if (hm.containsKey(good)) {
					hm.put(good, hm.get(good) + 1);
				} else {
					hm.put(good, 1);
				}
			}
			int hmLen = hm.size();
			int p = 0;
			int[] chosePrice = new int[hmLen];
			for (Integer chose : hm.values()) {
				chosePrice[p] = chose;
				p++;
			}
			Arrays.sort(chosePrice);
			int min = 0;
			int max = 0;

			for (int l = 0; l < chosePrice.length / 2; l++) {
				int tmp = chosePrice[l];
				chosePrice[l] = chosePrice[chosePrice.length - l - 1];
				chosePrice[chosePrice.length - l - 1] = tmp;
			}
			for (int z = 0; z < chosePrice.length; z++) {
				min = min + prices[z] * chosePrice[z];
			}

			for (int l = 0; l < prices.length / 2; l++) {
				int tmp = prices[l];
				prices[l] = prices[prices.length - l - 1];
				prices[prices.length - l - 1] = tmp;
			}
			for (int z = 0; z < chosePrice.length; z++) {
				max = max + prices[z] * chosePrice[z];
			}

			System.out.println(min + " " + max);
		}
	}
}