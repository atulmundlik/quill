package com.eclectic.quill.model;

import java.util.Map;

import com.eclectic.quill.enums.BOOKMARK_TYPE;
/**
 * 
 * @author atul_mundlik
 *
 */
public class Page {

	private String pageId;

	private Long pageNo;

	private Chapter chapter;

	private BOOKMARK_TYPE type;

	// TODO
	// Location on page and Image URL(decide on external or local disk relative
	// path).
	private Map<String, String> images;

	// TODO
	// Decide on length restrictions.
	private String body;

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public Long getPageNo() {
		return pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Chapter getDiary() {
		return chapter;
	}

	public void setDiary(Chapter chapter) {
		this.chapter = chapter;
	}

	public BOOKMARK_TYPE getType() {
		return type;
	}

	public void setType(BOOKMARK_TYPE type) {
		this.type = type;
	}

	public Map<String, String> getImages() {
		return images;
	}

	public void setImages(Map<String, String> images) {
		this.images = images;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
