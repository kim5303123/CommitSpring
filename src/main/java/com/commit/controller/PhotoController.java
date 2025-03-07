package com.commit.controller;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.commit.repository.vo.PhotoVo;
import com.commit.service.PhotoService;

@RestController
@RequestMapping("/api/photo")
public class PhotoController {

	@Autowired
	private PhotoService photoService;

//	POST : /api/photo/upload -> 프로필 사진 업로드
	@PostMapping("/upload")
	public ResponseEntity<String> uploadProfilePicture(@RequestParam("file") MultipartFile file,
			@RequestParam("profileId") Integer profileId) {
		if (file.isEmpty()) {
			return ResponseEntity.badRequest().body("파일을 선택해주세요.");
		}

		try {
			String filePath = photoService.uploadProfilePicture(file, profileId);
			return ResponseEntity.ok("프로필 사진이 성공적으로 업로드되었습니다. 파일 경로: " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("파일 업로드 중 오류가 발생했습니다.");
		}
	}

//	GET : /api/photo/upload/{id} -> 프로필 사진 조회
	@GetMapping("/upload/{id}")
	public ResponseEntity<PhotoVo> getProfile(@PathVariable Integer id) {
		PhotoVo profile = photoService.getProfileById(id);
		if (profile != null) {
			return ResponseEntity.ok(profile);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	private static final String IMAGE_DIR = "/home/user/uploads/";

    @GetMapping("/{filename}")
    public ResponseEntity<Resource> getImage(@PathVariable String filename) throws IOException {
        Path imagePath = Paths.get(IMAGE_DIR + filename);
        Resource resource = new UrlResource(imagePath.toUri());

        if (!resource.exists()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG) // 이미지 타입 설정
                .body(resource);
    }

}