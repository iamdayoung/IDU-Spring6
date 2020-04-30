package iducs.spring.blog202012707.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;

import iducs.spring.blog202012707.domain.Blog;

@Repository
public class BlogRepositoryImpl implements BlogRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	public BlogRepositoryImpl(SimpleDriverDataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public long create(Blog blog) {
		// TODO Auto-generated method stub
		String sql = "insert into blog values(seq_blog.nextval, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, blog.getTitle(), blog.getContent(), blog.getFilepath(), blog.getBlogger(), blog.getRegDateTime());
		return 0;
	}

	@Override
	public Blog read(Blog blog) {
		// TODO Auto-generated method stub
		String sql = "select * from blog where id = ?";
		//Blog retBlog = jdbcTemplate.queryForObject(sql, blog.getId(), new RowMapper());
		return null;
	}

	@Override
	public List<Blog> readList() {
		// TODO Auto-generated method stub
		String sql = "select * from blog order by id desc";
		
		List<Blog> blogList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Blog>(Blog.class));
		return blogList;
	}

	@Override
	public long update(Blog blog) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long delete(Blog blog) {
		// TODO Auto-generated method stub
		return 0;
	}

}
