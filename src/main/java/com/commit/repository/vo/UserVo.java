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
	private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String birth;
    private String address;
    private String member;
    private String phoneNumber;
    
    public UserVo(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
}

