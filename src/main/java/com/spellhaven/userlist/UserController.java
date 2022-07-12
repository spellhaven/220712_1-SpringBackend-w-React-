package com.spellhaven.userlist;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spellhaven.userlist.dao.IDao;
import com.spellhaven.userlist.dto.UserDto;

@CrossOrigin(origins = "*", maxAge = 3600) // 밖에서 들어온 모든 데이터를 받겠습니디~ 뭐 이런 놈.
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	IDao dao;
	
	@GetMapping // getmapping과 postmapping의 차이: 같은 경로 "/users"에서, 인수가 없으면 getmapping 있으면 postmapping 이렇게 들어가는 놈이다. (더 검색해 봐라. 근데 헷갈린다 ㅋ)
	public ArrayList<UserDto> userList() {
		
		System.out.println(dao.userList());
		System.out.println("회원목록 반환 성공, ㅋ");
		
		return dao.userList();
	}
	
	@PostMapping
	public void insertUser(@RequestBody UserDto user) {
		
		dao.insertUser(user);
		System.out.println("신규회원정보 입력 성공, ㅋ");

	}
	
	@GetMapping("/{id}")
	public UserDto userById(@PathVariable int id) { // PathVariable은 말 그대로다. Path에 있던 "/{id}"를 변수 id로 쓰겠다 이 얘기다. 
		
		System.out.println(dao.userById(id));
		System.out.println("회원 한 놈 검색해서 반환했어, ㅋ");
		
		UserDto searchedUser = dao.userById(id);
		
		return searchedUser;
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		
		dao.deleteUser(id);
		System.out.println("캐삭완");
		
	}
	
	@PutMapping("/{id}")
	public void updateUser(@PathVariable int id, @RequestBody UserDto user) {
	
		System.out.println("어떤회원쉑 정보 업뎃 시도함: ");
		
		dao.updateUser(user);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
