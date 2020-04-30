package iducs.spring.blog202012707.repository;

import java.util.List;

import iducs.spring.blog202012707.domain.Blog;

public interface BlogRepository {
	long create(Blog blog);
	Blog read(Blog blog);
	List<Blog> readList();
	long update(Blog blog);
	long delete(Blog blog);
}
