package com.spellhaven.userlist.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.spellhaven.userlist.dto.UserDto;

@Mapper
public interface IDao { // CRUD 게시판을 만들어 보자! ^^ (Create, Read, Update, Delete) 각각 INSERT INTO, SELECT, UPDATE, DELETE의 SQL문을 쓴다. ^^
	
	// 인터페이스에서 public은 생략해도 되지만, 난 습관성으로 걍 넣었다, ㅋ.
	public ArrayList<UserDto> userList(); // 모든 회원 리스트 불러오기 (네 식구들 다 불러와.) 아, 참고로 ArrayList 말고 List로 받아도 된대. (List가 상위 개념이라서.)
	
	public UserDto userById(int id); // 특정 유저의 ID로 그 유저의 정보 불러오기
	
	public void insertUser(UserDto user); // 새로운 회원 정보 입력하기
	//public void insertUser(int id, String username, String phone, String nickname, int age, int membership); // 옛날에는 이렇게 했었지. 근데 이번에는 리액트 쪽에서 State(유저정보)가 통째로 날아오니까, 걍 Dto로 통째로 받어.
	
	public void updateUser(UserDto user); // 회원정보수정
	
	public void deleteUser(int id); // 캐삭
}
