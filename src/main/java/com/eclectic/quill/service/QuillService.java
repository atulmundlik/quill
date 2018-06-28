package com.eclectic.quill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eclectic.quill.dao.QuillDao;
/**
 * 
 * @author atul_mundlik
 *
 */
@Component
public class QuillService {

	@Autowired
	QuillDao dao;

	public void findAll() {
		dao.findAll();
	}

	public void loadDiary(String diaryId) {
		dao.findDiary(diaryId);

	}

	public void loadPage(String diaryId, String pageId) {
		dao.loadPage(diaryId, pageId);
		
	}
	
	public void deletePage(String diaryId, String pageId) {
		dao.deletePage(diaryId, pageId);
		
	}

	public void deleteDiary(String diaryId) {
		dao.deleteDiary(diaryId);
		
	}

	public void createDiary() {
		dao.createDiary();
		
	}
}
