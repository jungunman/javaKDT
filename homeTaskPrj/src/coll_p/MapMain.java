package coll_p;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {

		//생성
		HashMap mm = new HashMap();
		
		//mm.add("고래","포유류");
		mm.put("고래","포유류");		//value - 중첩가능
		mm.put("상어","어류");		//추가
		mm.put("악어","파충류");
		mm.put("오타니","이도류");
		mm.put("상어","뚜루루뚜루"); 	//대입
		mm.put("사자","포유류");		//value - 중첩가능
		mm.put("켄","어류");
		mm.put("류","어겐");
		//mm.set("운만","재미없어");
		mm.put(100,123.456);
		mm.put(true,'a');
		
		System.out.println(mm);
		System.out.println(mm.get("고래"));
		System.out.println(mm.get(0));	//key 가 없으면 null
		Object rr = mm.remove("오타니");	//remove 리턴으로 value
		System.out.println(mm);
		System.out.println(rr);
		System.out.println(mm.size());
		System.out.println(mm.containsKey("상어"));
		System.out.println(mm.containsKey("인어"));
		System.out.println(mm.containsKey("뚜루루뚜루"));
		System.out.println(mm.containsValue("파충류"));
		System.out.println(mm.containsValue("사자"));
		System.out.println(mm.containsValue("휘발류"));
		
		/*
		for (Object object : mm) {
			
		}*/
		//Iterator it = mm.iterator();
		
		Set ss = mm.entrySet();
		System.out.println(ss);
		
		for (Object obj : ss) {
			Map.Entry me = (Map.Entry)obj;
			System.out.println(me.getKey()+","+me.getValue()+"=>"+obj);
		}
		
		System.out.println("-----------------------");
		Iterator it = ss.iterator();
		while(it.hasNext()) {
			Object oo = it.next();
			Map.Entry me = (Map.Entry)oo;
			System.out.println(me.getKey()+","+me.getValue()+"=>"+oo);
		}
		
		ss = mm.keySet();
		System.out.println(ss);
		
		for (Object kk : ss) {
			System.out.println(kk+","+mm.get(kk));
		}
		
		System.out.println("-----------------------");
		it = ss.iterator();
		while(it.hasNext()) {
			Object kk = it.next();
			System.out.println(kk+","+mm.get(kk));
		}
		Collection vv = mm.values();
		System.out.println(vv);
		for (Object v : vv) {
			System.out.println(v);
		}
		
		System.out.println("-----------------------");
		it = vv.iterator();
		while(it.hasNext()) {
			Object v = it.next();
			System.out.println(v);
		}
		
		
		
	}

}
