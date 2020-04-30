package iducs.spring.blog202012707.service;

import java.util.List;

import iducs.spring.blog202012707.domain.Blog;

public interface BlogService {
	Blog getBlog(long id); // primary key에 해당하는 id로 조회
	List<Blog> getBlogs(); // 모든 사용자 조회
	List<Blog> getBlogsByTitle(String title); // name으로 조회
	List<Blog> getBlogByBlogger(String blogger); // company로 조회
	List<Blog> getBlogByPage(int index, int size); // page로 조회
	int postBlog(Blog blog); // 추가
	int putBlog(Blog blog); // 수정
	int deleteBlog(long id); // 삭제
}
