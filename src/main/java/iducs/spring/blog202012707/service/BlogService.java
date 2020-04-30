package iducs.spring.blog202012707.service;

import java.util.List;

import iducs.spring.blog202012707.domain.Blog;

public interface BlogService {
	Blog getBlog(long id); // primary key�� �ش��ϴ� id�� ��ȸ
	List<Blog> getBlogs(); // ��� ����� ��ȸ
	List<Blog> getBlogsByTitle(String title); // name���� ��ȸ
	List<Blog> getBlogByBlogger(String blogger); // company�� ��ȸ
	List<Blog> getBlogByPage(int index, int size); // page�� ��ȸ
	int postBlog(Blog blog); // �߰�
	int putBlog(Blog blog); // ����
	int deleteBlog(long id); // ����
}
