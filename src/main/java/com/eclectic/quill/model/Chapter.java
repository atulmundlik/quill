package com.eclectic.quill.model;

import java.util.List;
/**
 * 
 * @author atul_mundlik
 *
 */
public class Chapter {

	private String chapterId;

	private String chapterName;

	private List<Page> pages;

	// Optional
	// Image URL(decide on external or local disk relative path).
	private String image;

	// Optional
	private String description;

	public String getChapterId() {
		return chapterId;
	}

	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
