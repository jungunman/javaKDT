package coll_p;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueMain {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue qq = new LinkedList();
		
//		st.add(1);
//		st.add(2);
//		st.add(3);
//		qq.add(1);
//		qq.add(2);
//		qq.add(3);
		st.push(11);
		st.push(22);
		st.push(33);
		
		qq.offer(11);
		qq.offer(22);
		qq.offer(33);
		
		System.out.println("st:"+st);
		System.out.println("qq:"+qq);
		
		for (int i = 0; i < st.size(); i++) {
			//System.out.println(st.get(i)+","+qq.get(i));
			System.out.println(st.get(i));
		}
		
//		Object rr = st.pop();
//		System.out.println("rr:"+rr);
//		System.out.println("st:"+st+st.empty());
//		rr = st.pop();
//		System.out.println("rr:"+rr);
//		System.out.println("st:"+st+st.empty());
//		rr = st.pop();
//		System.out.println("rr:"+rr);
//		System.out.println("st:"+st+st.empty());
//		rr = st.pop();
//		System.out.println("rr:"+rr);
//		System.out.println("st:"+st);
		System.out.println("stack ----------------------");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
//		Object rr = qq.poll();
//		System.out.println("rr:"+rr);
//		System.out.println("qq:"+qq+qq.isEmpty());
//		rr = qq.poll();
//		System.out.println("rr:"+rr);
//		System.out.println("qq:"+qq+qq.isEmpty());
//		rr = qq.poll();
//		System.out.println("rr:"+rr);
//		System.out.println("qq:"+qq+qq.isEmpty());
//		rr = qq.poll();
//		System.out.println("rr:"+rr);
//		System.out.println("qq:"+qq+qq.isEmpty());
		System.out.println("queue----------------------");
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());
		}
	}

}
