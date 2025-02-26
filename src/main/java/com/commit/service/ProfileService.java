package com.commit.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.commit.mappers.ProfileMapper;
import com.commit.repository.vo.ProfileVo;

import jakarta.annotation.PostConstruct;


@Service
public class ProfileService {
	
	@Value("${file.upload-dir}")
	private String uploadDir;
	
	@Autowired
	private ProfileMapper profileMapper;
	
	//	프로필 사진 등록
	@PostConstruct
    public void init() {
        try {
            Path uploadPath = Paths.get(uploadDir);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
                System.out.println("Directory " + uploadDir + " created");
            } else {
                System.out.println("Directory " + uploadDir + " already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException("Could not create upload directory!", e);
        }
    }
	
	//	신상 정보 불러오기
	public ProfileVo profileSelect(int id) {
		ProfileVo profileVo = profileMapper.profileSelect(id);
		return profileVo;
	}
	
	//	신상 정보 추가
	public int profileInsert(ProfileVo profile) {
		return profileMapper.profileInsert(profile);
	}
	
	
	//	신상 정보 수정
	public ProfileVo profileUpdate(ProfileVo profile) {
		profileMapper.profileUpdate(profile);
		return profile;
	}
}	

	
	
