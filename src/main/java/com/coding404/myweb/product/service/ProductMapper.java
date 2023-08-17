package com.coding404.myweb.product.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import com.coding404.myweb.command.CategoryVO;
import com.coding404.myweb.command.ProductUploadVO;
import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.util.Criteria;

@Mapper
public interface ProductMapper {
	
	public int productRegist(ProductVO vo); //상품등록
	public void productFileRegist(ProductUploadVO vo); //파일등록
	
	//public ArrayList<ProductVO> getList(String writer);
	public ArrayList<ProductVO> getList(@Param("writer") String writer,
										@Param("cri") Criteria cri);
	public int getTotal(@Param("writer") String writer,
						@Param("cri") Criteria cri); //전체게시글수
	public ProductVO getDetail(int prod_id); //상세
	public int productUpdate(ProductVO vo);//수정
	public void productDelete(int prod_id); //삭제
	
	
	//카테고리처리
	public ArrayList<CategoryVO> getCategory(); //처음가져올때
	public ArrayList<CategoryVO> getCategoryChild(CategoryVO vo); //2단, 3단 가져올때
	
	//이미지
	public ArrayList<ProductUploadVO> getAjaxImg(int prod_id);
	
}
