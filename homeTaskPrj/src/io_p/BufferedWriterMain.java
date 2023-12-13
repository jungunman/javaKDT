package io_p;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {

	public static void main(String[] args) {
		try {
			
			String [] arr = {
				"여긴 참나무 숲 장수풍뎅이와",
				"9876543231",
				")(*&^%^%$$##@!",
				"jeroijnd erjioef efoefhjno",
			};
			
			FileWriter fw = new FileWriter("fff/eee.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (String str : arr) {
				bw.write(str+"\n"); //문자열 바로 입력
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*
person.txt 파일에 당일 전화한 사람들 명단이 있다.
전화번호에 32가 들어있는 용의자를 색출하여 filterPerson.txt로 저장하세요

person.txt

정운일 남 28 010-3232-3232
정운십 남 32 010-3345-5634
정운백 여 24 010-1234-1234
정운천 남 32 010-3246-3042
정운만 남 26 010-9876-5432
정운억 남 20 010-3436-3137
정운조 남 28 010-7653-2345


filterPerson.txt

정운일 남 28 010-3232-3232
정운천 남 32 010-3246-3042
정운만 남 26 010-9876-5432
정운조 남 28 010-7653-2345
*/

	}

}
