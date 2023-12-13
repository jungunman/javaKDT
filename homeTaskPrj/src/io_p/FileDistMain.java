package io_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

/*
//지정한 폴더의 파일을 각각 종류별로 지정 폴더에 저장하시오
/// 하위 폴더까지 검색하세요
/// 같은 파일명인 경우 중복 처리 하세요

//이미지 : bmp, jpg, gif, png , jpeg
//음악 : mp3, wma, wav
//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
//기타 : 위의 분류 이외
//확장자의 대소문자 구분하지 않음
 */
public class FileDistMain {
	
	HashMap<String, String>srcs;
	
	
	void dirGo(File files) {
		System.out.println(">>디렉토리 시작"+files);
		for (File ff : files.listFiles()) {
			if(ff.isDirectory()) {
				dirGo(ff);
			}else {
				fileSave(ff);
			}
			
		}
		System.out.println(">>디렉토리 끝-----------"+files);
	}
	
	void fileSave(File ff) {
		String fName = ff.getName();
		int pos = fName.lastIndexOf(".");
		String ext = fName.substring(pos+1);
		String fileName = fName.substring(0,pos);
		String src = srcs.get(ext.toLowerCase());
		if(src==null) {
			src = "etc";
		}
		System.out.println("파일이었어"+ff+src);
		String path = "asdf/"+src+"/";
		new File(path).mkdirs();
		File newFile = new File(path+fName);
		int no = 1;
		while(newFile.exists()) {//중복된 파일 감지
			fName = fileName+"_"+no+"."+ext;
			newFile = new File(path+fName);
			no++;
		}
		fileCopy(newFile, ff);
	}
	
	void fileCopy(File src, File ori) {
		try {
			FileInputStream fis = new FileInputStream(ori);
			FileOutputStream fos = new FileOutputStream(src);
			
			fos.write(fis.readAllBytes());
			
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public FileDistMain() {
		srcs = new HashMap<String, String>();
		srcs.put("bmp", "img");
		srcs.put("jpg", "img");
		srcs.put("gif", "img");
		srcs.put("png", "img");
		srcs.put("jpeg", "img");
		srcs.put("mp3", "music");
		srcs.put("wma", "music");
		srcs.put("wav", "music");
		srcs.put("doc", "oa");
		srcs.put("hwp", "oa");
		srcs.put("ppt", "oa");
		srcs.put("xls", "oa");
		srcs.put("pptx", "oa");
		srcs.put("xlsx", "oa");
		srcs.put("docx", "oa");
		dirGo(new File("qwer"));
	}

	public static void main(String[] args) {
		new FileDistMain();
	}

}
