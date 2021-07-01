package com.school.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.demo.entiy.book_load;
import com.school.demo.entiy.paper_load;
import com.school.demo.entiy.project_load;
import com.school.demo.entiy.research_load;
@Mapper
public interface research_loadDao {
	
	public boolean insert(@Param ("rload")research_load rload);
	
	public boolean insert_project(@Param ("pload")project_load pload);
	
	public boolean insert_paper(@Param("papLoad") paper_load papLoad);
	
	public boolean insert_book(@Param("bookLoad") book_load bookLoad);

	public int update_project(@Param("pLoad")project_load pLoad);

	public int delete_project(@Param("id")String id);

	public int update_book(@Param("bLoad")book_load bLoad);

	public int delete_book(@Param("id")String id);

	public int update_paper(@Param("pLoad")paper_load pLoad);

	public int delete_paper(@Param("id")String id);

	public int update_research(@Param("rLoad")research_load rLoad);

	public int delete_research(@Param("id")String id);
}
