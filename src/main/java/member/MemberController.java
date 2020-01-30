package member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	//Model( ) , 
	
	//회원가입, 회원리스트조회, 회원정보, 회원수정, 회원탈퇴
	@RequestMapping("/member/add")
	public void addMember(){
		System.out.println("=== 회원 가입 처리중입니다. ===");
		//뷰이름은 url 동일 이름 결정 ( member 폴더안에 add.jsp를 찾겠다.)
		//webapp/web-inf/views/member/add.jsp
		// 모델 없다 / view member/add.jsp
	
	}
	
	@RequestMapping("/member/list")
	public String getMemberList() {
		System.out.println("=== 회원 리스트 처리중입니다. ===");
		// 모델 없고, 뷰이름은 member/memberlist.jsp
		return "/member/memberlist";
	}

	
	@RequestMapping("/member/delete")
	public String deleteMember() {
		System.out.println("=== 회원 탈퇴 처리후 회원 리스트 출력합니다. ===");
		// 모델 없고, 뷰이름은 member/memberlist.jsp
		// 컨트롤러 메소드 실행은 하지 않고 jsp 파일(뷰) 이동
		//return "/member/memberlist";
		
		// url "/member/list" 매핑 컨트롤러 메소드 실행
		return "redirect:/member/list";
	}
	
	@RequestMapping("/member/update")
	public ModelAndView updateMember() {
		System.out.println("=== 회원정보 수정합니다. ===");
		ModelAndView mav = new ModelAndView();
		mav.addObject("updateid", "수정id");
		//mav.setViewName("member/update"); 
		//안써도 mapping으로 가짐
		return mav;		
	}
	@RequestMapping("/member/get")
	public Model getMember(Model m) {
		System.out.println("=== 회원정보를 조회합니다. ===");
		m.addAttribute("id", "sptring");
		m.addAttribute("name", "이자바");
		return m; // 뷰이름은 url
	}
	
	@RequestMapping("/member/get2")
	public Map<String, String> getMember2() {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println("=== 회원정보를 조회합니다. ===");
		map.put("id", "sptring");
		map.put("name", "이자바");
		return map; //뷰
	}
	////// 리턴 타입 //////
	// 모든 뷰에서 사용가능
	@ModelAttribute("listmodel")
	public ArrayList<MemberVO> getModel(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("spring","이름"));
		list.add(new MemberVO("mybatis","태균"));
		list.add(new MemberVO("java","김자바"));
		list.add(new MemberVO("android","돼지"));
		list.add(new MemberVO("jsp","굳굳"));
		
		
		
		return list;
	}
	
	
	@ModelAttribute("searchmodel")
	public ArrayList<String> getModel2(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("이름검색");
		list.add("id검색");
		list.add("email검색");
		list.add("연락처검색");
		
		return list;
	}
	
	@RequestMapping("/member/searchlist")
	public ModelAndView searchlist(@RequestParam("searchitem")String item, @RequestParam("searchword")String word){

		ModelAndView mav = new ModelAndView();
		//searchitem = ID .. 
		//searchword = ja .. 
		
		//item ID검색 이름검색 XX검색
		item = item.substring(0, item.length()-2);
		mav.addObject("item", item);
		mav.addObject("word", word);
		/*
		 * ArrayList<MemberVO> list = getModel(); for() { 조건만족한것만 }
		 */		
		return mav;

		
	}
	
	//ModelAttribute 메소드 선언 : 공유
	@RequestMapping("/member/list2")
	public void getList2() {
		//모든 Member ArrayList 리턴 - 모델
		// 위에서 만든걸로 갈한다.
	}
	 
	@RequestMapping("/member/list3")
	public void getList3() {
		//검색 조건 추가 Member ArrayList 리턴 - 모델
		
	}
	

	
}
