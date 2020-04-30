package iducs.spring.blog202012707.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iducs.spring.blog202012707.domain.Blog;
import iducs.spring.blog202012707.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {
	
	
	private BlogRepository blogRepository;
	
	public BlogServiceImpl(BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}

	@Override
	public Blog getBlog(long id) {
		// TODO Auto-generated method stub
		Blog blog = new Blog();
		blog.setId(id);
		return blogRepository.read(blog);
	}

	@Override
	public List<Blog> getBlogs() {
		// TODO Auto-generated method stub
		return blogRepository.readList();
	}

	@Override
	public List<Blog> getBlogsByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getBlogByBlogger(String blogger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getBlogByPage(int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int postBlog(Blog blog) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int putBlog(Blog blog) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBlog(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
