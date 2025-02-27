package com.commit.mappers;

import java.util.List;


import com.commit.repository.vo.ReviewVo;



public interface ReviewMapper {
//	<select id="selectAllItems" resultType="reviewVo">
	List<ReviewVo> selectAllItems();
	
//	<select id="selectById" parameterType="int" resultType="reviewVo">
	ReviewVo selectById(Integer id);
	
	int insertReview(ReviewVo reviewVo);
	
	List<ReviewVo> selectReviewsById(Integer id);


}