package kitri.edu.mvc;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@RequestMapping(value = "/upload.file", method = RequestMethod.GET)
	public String uploadForm() {
		return "upload_spring";

	}

	@RequestMapping(value = "/upload.file", method = RequestMethod.POST)
	public String uploadResult(UploadVO vo) throws IllegalStateException, IOException {
		// ${uploadvo}
		System.out.println(vo.getName());
		System.out.println(vo.getDescription());
		// MultipartFile메소드
		/*
		 * System.out.println(vo.getFile1().getOriginalFilename());
		 * System.out.println(vo.getFile1().getName());
		 * System.out.println(vo.getFile1().getSize());
		 * System.out.println(vo.getFile1().getContentType());
		 */

		// vo.getFile1(), vo.getFile2() : 2개 파일
		// 업로드 이름 그대로 전달받아서 서버컴퓨터 c:upload 폴더 저장
		// java.io.*
		// 지금은 null이면 안된다.
		MultipartFile mf1 = vo.getFile1();
		MultipartFile mf2 = vo.getFile2();

		// 전송 파일명 추출
		String filename1 = mf1.getOriginalFilename();
		String filename2 = mf2.getOriginalFilename();

		// 업로드 파일 저장 서버 위치
		String uploadpath = "c:/upload/";

		// 1. 중복 이름 파일 체크
		String[] filelist = new File(uploadpath).list();
		for (String s : filelist) {
			if (s.contentEquals(filename1)) {
				System.out.println(filename1 + "있어요~~");
				String ext1 = filename1.substring(filename1.lastIndexOf("."));
				String remain = filename1.substring(0, filename1.lastIndexOf(".")-1);
				filename1 = remain +"1"+ext1;
				
				// 확장자
				//Dat.eAC.java
			}
			if (s.contentEquals(filename2)) {
				System.out.println(filename2 + "있어요~~");
			}
		}

		// 업로드 파일은 c:upload/업로드파일명으로 지정
		File file1 = new File(uploadpath + filename1);
		File file2 = new File(uploadpath + filename2);

		// mf1 파일 내용을 file1에 저장시킨다. c:uplaod/업로드파일명 복사
		mf1.transferTo(file1);
		mf2.transferTo(file2);

		return "uploadresult_spring";
	}
}
