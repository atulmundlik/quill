package com.eclectic.quill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eclectic.quill.service.QuillService;

/**
 * 
 * @author atul_mundlik
 *
 */
@RestController
@RequestMapping(value = "/diary/")
public class DiaryController {

	@Autowired
	QuillService service;

	/**
	 * Create Diary.
	 * 
	 * @param diaryId
	 */
	@RequestMapping(value = "create")
	public void createDiary() {
		service.createDiary();
	}

	/**
	 * Delete Diary by it's ID.
	 * 
	 * @param diaryId
	 */
	@RequestMapping(value = "{diaryId}")
	public void deleteDiary(@PathVariable(value = "diaryId") String diaryId) {
		service.deleteDiary(diaryId);
	}

	/**
	 * Fetch List of all the Diaries. Additional schema Cover of each diary
	 * Number of pages in each diary.
	 * 
	 */
	@RequestMapping("all")
	public void showAllDiaries() {
		service.findAll();
	}

	/**
	 * Fetch first five pages of Diary.
	 * 
	 * Additional schema Number of pages.
	 * 
	 * @param diaryId
	 */
	@RequestMapping(value = "{diaryId}/edit")
	public void editDiary(@PathVariable(value = "diaryId") String diaryId) {
		service.loadDiary(diaryId);
	}

	/**
	 * Fetch particular page of Diary.
	 * 
	 * @param diaryId
	 */
	@RequestMapping(value = "{diaryId}/edit/{pageId}")
	public void fetchDiaryPage(@PathVariable(value = "diaryId") String diaryId,
			@PathVariable(value = "pageId") String pageId) {
		service.loadPage(diaryId, pageId);
	}

	/**
	 * Delete particular page of Diary.
	 * 
	 * @param diaryId
	 */
	@RequestMapping(value = "{diaryId}/edit/{pageId}")
	public void deletePage(@PathVariable(value = "diaryId") String diaryId,
			@PathVariable(value = "pageId") String pageId) {
		service.deletePage(diaryId, pageId);
	}

}
