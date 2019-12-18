package com.nz.practice.leetcode;

import java.util.*;

/**
 *  给出一组词语，查询出现次数最多的n个词语
 * words[] 词组， 出现最多的前几个
 *
 */
public class MostWord {
	public static List<String> topKFrequent(String[] words, int k) {
		List<String> resList = new ArrayList<>();
		Map<String, Integer> keyMap =  new HashMap();
		for(String word : words){
			if(keyMap.containsKey(word)){
				int i = keyMap.get(word)== null? 0 : keyMap.get(word);
				keyMap.put(word, ++i);
			} else {
				keyMap.put(word, 1);
			}
		}
		Set<Map.Entry<String, Integer>> entries = keyMap.entrySet();
		ArrayList<Map.Entry<String, Integer>> objects = new ArrayList<>(entries);
		Collections.sort(objects, ((o1, o2) ->
			/**
			 * 升序排的话就是第一个参数.compareTo(第二个参数);
			 * 降序排的话就是第二个参数.compareTo(第一个参数);
			 　*/
			o1.getValue() > o2.getValue()? -1 : (o1.getValue()==o2.getValue() ? o1.getKey().compareTo(o2.getKey()) :1)
		));
		for (int i = 0; i<k ; i++){
			resList.add(objects.get(i).getKey());
		}
		return resList;
	}

	public static void main(String[] args) {
		String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
		System.out.println(topKFrequent(words,2));
	}
}
