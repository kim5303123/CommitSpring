package com.commit.repository.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserVo {
	
	//	ID
	Integer id;
	//	이름
    String name;
	//	이메일
    String email;
	//	비밀번호
    String password;
	//	성별
    String gender;
	//	생년월일
    String birth;
	//	주소
    String address;
	//	회원 상태
    String member;
	//	전화번호
    String phoneNumber;
    
    public UserVo(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
    
}

