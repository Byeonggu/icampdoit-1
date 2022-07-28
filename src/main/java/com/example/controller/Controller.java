package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class Controller {
	
	@RequestMapping( value="/home.do" )
	public ModelAndView home(HttpServletRequest request) {
		System.out.println( "list() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "home" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/about.do" )
	public ModelAndView about(HttpServletRequest request) {
		System.out.println( "about() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "about" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/notice.do" )
	public ModelAndView notice(HttpServletRequest request) {
		System.out.println( "notice() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/customercare/notice" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/faq.do" )
	public ModelAndView faq(HttpServletRequest request) {
		System.out.println( "faq() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/customercare/faq" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/searchkey.do" )
	public ModelAndView searchkey(HttpServletRequest request) {
		System.out.println( "searchkey() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/search/search_key" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/searchmap.do" )
	public ModelAndView searchmap(HttpServletRequest request) {
		System.out.println( "searchmap() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/search/search_map" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/campview.do" )
	public ModelAndView campview(HttpServletRequest request) {
		System.out.println( "campview() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/search/campview" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/mboardlist.do" )
	public ModelAndView mboardlist(HttpServletRequest request) {
		System.out.println( "mboardlist() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/board/mboard_list" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/mboardview.do" )
	public ModelAndView mboardview(HttpServletRequest request) {
		System.out.println( "mboardview() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/board/mboard_view" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/mboardwrite.do" )
	public ModelAndView mboardwrite(HttpServletRequest request) {
		System.out.println( "mboardwrite() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/board/mboard_write" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/mboardmodify.do" )
	public ModelAndView mboardmodify(HttpServletRequest request) {
		System.out.println( "mboardmodify() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/board/mboard_modify" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/hboardlist.do" )
	public ModelAndView hboardlist(HttpServletRequest request) {
		System.out.println( "hboardlist() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/board/hboard_list" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/hboardview.do" )
	public ModelAndView hboardview(HttpServletRequest request) {
		System.out.println( "hboardview() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/board/hboard_view" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/mypage.do" )
	public ModelAndView mypage(HttpServletRequest request) {
		System.out.println( "mypage() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/mypage/mypage" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/mypagesub.do" )
	public ModelAndView mypagesub(HttpServletRequest request) {
		System.out.println( "mypagesub() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/mypage/mypage_sub" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/mypagemylist.do" )
	public ModelAndView mypagemylist(HttpServletRequest request) {
		System.out.println( "mypagemylist() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/mypage/mypage_mylist" );
		
		return modelAndView;
	}
	
	@RequestMapping( value="/login.do" )
	public ModelAndView login(HttpServletRequest request) {
		System.out.println( "login() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/login/login" );
		
		return modelAndView;
	}
	
	
	//관리자페이지
	@RequestMapping( value="/admin.do" )
	public ModelAndView admin(HttpServletRequest request) {
		System.out.println( "admin() 호출" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "admin/admin" );
		
		return modelAndView;
	}
	@RequestMapping( value="/admin_users.do" )
	public ModelAndView adminUsers(HttpServletRequest request) {
		System.out.println( "admin() 호출" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "admin/admin_users" );
		
		return modelAndView;
	}
	@RequestMapping( value="/admin_board.do" )
	public ModelAndView adminBoard(HttpServletRequest request) {
		System.out.println( "admin() 호출" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "admin/admin_board" );
		
		return modelAndView;
	}

	@RequestMapping( value="/signup.do" )
	public ModelAndView signup(HttpServletRequest request) {
		System.out.println( "signup() ȣ��" );
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "/login/signup" );
		
		return modelAndView;
	}
}
