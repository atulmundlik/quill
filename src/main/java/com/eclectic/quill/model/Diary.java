package com.eclectic.quill.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.eclectic.quill.enums.BOOKMARK_TYPE;
import com.eclectic.quill.enums.DIARY_TYPE;

/**
 * 
 * @author atul_mundlik
 *
 */
@Document(collection="diaries")
@TypeAlias("diary")
public class Diary {

	@Id
	private String diaryId;

	//@Field(value="Diary_Name")
	private String diaryName;

	//@Field(value="Diary_Type")
	private DIARY_TYPE type;

	// Need to be short
	private String description;

	// URL for diary cover.
	private String diaryCover;

	private long numberOfPages;

	private Page currentPage;

	@DBRef
	private List<Month> months;

	// Bookmarked pages with type.
	// ex - this page is important to me or this is marked for later edit/view
	// Page entity also holds the BOOKMARK_TYPE attribute.
	private Map<Long, BOOKMARK_TYPE> bookMarkedPages;

	public String getDiaryId() {
		return diaryId;
	}

	public void setDiaryId(String diaryId) {
		this.diaryId = diaryId;
	}

	public String getDiaryName() {
		return diaryName;
	}

	public void setDiaryName(String diaryName) {
		this.diaryName = diaryName;
	}

	public DIARY_TYPE getType() {
		return type;
	}

	public void setType(DIARY_TYPE type) {
		this.type = type;
	}

	public String getDiaryCover() {
		return diaryCover;
	}

	public void setDiaryCover(String diaryCover) {
		this.diaryCover = diaryCover;
	}

	public long getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(long numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Page getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Page currentPage) {
		this.currentPage = currentPage;
	}

	public Map<Long, BOOKMARK_TYPE> getBookMarkedPages() {
		return bookMarkedPages;
	}

	public void setBookMarkedPages(Map<Long, BOOKMARK_TYPE> bookMarkedPages) {
		this.bookMarkedPages = bookMarkedPages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}

}
