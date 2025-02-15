package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {
	
	//  input: id
	// output: Review or null
	public Review selectReviewBYID(int id);
	
	public int insertReview(Review review);
	
	public int insertReviewAsField(
		@Param("storeId") int storeId,
		@Param("menu") String menu,
		@Param("userName") String userName,
		@Param("point") Double point,
		@Param("review") String review);
	
	public int updateReviewById(
			@Param("id") int id,
			@Param("review") String review);

	public int deleteReviewById(int id);
}
