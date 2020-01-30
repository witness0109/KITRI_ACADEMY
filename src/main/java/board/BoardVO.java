package board;

import java.util.Date;

public class BoardVO {

	int seq;
	String title;
	String contents;
	String writer;
	Date time; 
	int password;
	int viewcount;
	
	
	
	@Override
	public String toString() {
		return "[ 번호=" + seq + ", 제목=" + title + ", 내용=" + contents + ", 작성자=" + writer + ", 작성시간="
				+ time + ", 비밀번호=" + password + ", 조회수=" + viewcount + "]";
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	
	
	
}
