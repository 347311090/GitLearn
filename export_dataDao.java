package com.school.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.school.demo.entiy.book_load;
import com.school.demo.entiy.paper_load;
import com.school.demo.entiy.project_load;
import com.school.demo.entiy.research_load;
//Git is a distributed version control system.
//		Git is free software distributed under the GPL.
//Git has a mutable index called stage.
//Git tracks changes.
//Git tracks changes of files.
@Mapper
public interface export_dataDao {
	public List<project_load> select_project(@Param ("rpeopleName")String Name);

	public List<research_load> select_research(@Param ("rpeopleName")String Name);

	public List<paper_load> select_paper(@Param ("rpeopleName")String Name);

	public List<book_load> select_book(@Param ("rpeopleName")String Name);
	
	public int count (@Param ("rpeopleName") String name,@Param ("wp") String wp);
	public List<research_load> select_research1(@Param ("rpeopleName")String name,@Param ("wp")String wp);
	
	public List<project_load> select_project1(@Param ("rpeopleName")String name,@Param ("projectName")String projectName);
	public int count1 (@Param ("rpeopleName") String name,@Param ("projectName") String projectName);

	public List<paper_load> select_paper1(@Param ("rpeopleName") String name, @Param("paperName")String paperName);

	public int count2(@Param("rpeopleName")String name, @Param("paperName")String paperName);

	public List<book_load> select_book1(@Param("rpeopleName")String name, @Param("bookName")String bookName);

	public int count3(@Param("rpeopleName")String name, @Param("bookName")String bookName);
	
}
