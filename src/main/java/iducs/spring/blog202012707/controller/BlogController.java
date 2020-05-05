package iducs.spring.blog202012707.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import iducs.spring.blog202012707.domain.Blog;
import iducs.spring.blog202012707.service.BlogService;

@Controller
public class BlogController {
	
	private BlogService blogService;
	
	public BlogController(BlogService blogService) {
		this.blogService = blogService;
	}
	
	@GetMapping("/blogs/all")
	public String getblogs(Model model) {
		List<Blog> blogList = blogService.getBlogs();
		model.addAttribute("blogList", blogList);
		return "/blogs/get-blogs";		
	}
		
	@GetMapping("/blogs/{id}")
	public String getblog(@PathVariable("id") long id, Model model) {
		model.addAttribute("blog", blogService.getBlog(id));
		return "/blogs/get-blog";
	}
	
	@PostMapping("/blogs")
	public String postBlog(@RequestBody @Valid Blog blog, Model model) {
		blogService.postBlog(blog);
		return "redirect:/blogs/all";
	}
	
	@GetMapping("/blogs/new")
	public String postBlog() {
		return "/blogs/new-form";		
	}

}
