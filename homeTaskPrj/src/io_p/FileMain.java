package io_p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) throws Exception {
		File ff = new File("fff/qqq/ccc.txt");
		//ff = new File("D:\\public\\green\\2023_10\\study\\javaWork\\teacherPrj\\fff\\qqq\\bbb.txt");
		System.out.println(ff);
		System.out.println(ff.exists());
		System.out.println(ff.isFile());
		System.out.println(ff.isDirectory());
		System.out.println(ff.isAbsolute());
		System.out.println(ff.getParent());
		System.out.println(ff.getName());
		System.out.println(ff.getAbsolutePath());
		System.out.println(ff.getPath());
		System.out.println(ff.isHidden());
		System.out.println(ff.canExecute());
		System.out.println(ff.canRead());
		System.out.println(ff.canWrite());
		System.out.println(ff.length());
		System.out.println(new Date( ff.lastModified()));
		
		ff = new File("fff/zzz.xcv");
		ff.createNewFile();
		
		new File("fff/ttt").mkdir();
		//new File("fff/ooo/ppp").mkdir();
		new File("fff/ooo/ppp").mkdirs();
		
		ff.delete();
		
		new File("fff/eee.txt").renameTo(new File("dst/mnb.txt"));
		
		
		Files.copy(
				new File("fff/child_3.jpg").toPath(),
				new FileOutputStream("dst/son_3.jpg"));
		
		System.out.println("파일 리스트 -----------------");
		
		File [] arr = new File("fff").listFiles();
		for (File file : arr) {
			System.out.println(file.getName()+":"+file.isDirectory());
		}
		
		/*
//지정한 폴더의 파일을 각각 종류별로 지정 폴더에 저장하시오
/// 하위 폴더까지 검색하세요
/// 같은 파일명인 경우 중복 처리 하세요

//이미지 : bmp, jpg, gif, png , jpeg
//음악 : mp3, wma, wav
//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
//기타 : 위의 분류 이외
//확장자의 대소문자 구분하지 않음
 * 
 * 

///원본폴더명을 입력받아 폴더안의 음악가사파일을   
    가사 폴더 >  장르 > 국적 > 가수 폴더 에 저장하세요 
         단. txt 파일만 해당
///  파일 정보 
    1- 노래제목
    2- 장르
    3- 가수
    4- 국적
    5- 가사 

		 * */
	}

}

