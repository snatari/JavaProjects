package sba3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"alex","xylos","alex","alan","alex"};
		List <String> list = new ArrayList<String>();
		Map<String,Integer> map = new HashMap<String ,Integer>();
		int count =0;
		for(int i =0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i])+1;
				map.put(arr[i], count);
				list.add(arr[i]+count);
			}else
			{
				map.put(arr[i], 0);
				list.add(arr[i]);
				
			}
		}for(String W :list)
				System.out.println(W);
		
		
		
		
		}
	}