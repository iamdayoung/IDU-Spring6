# 인덕대학교 전공심화과정 컴퓨터신기술특강

### 2020.04.28 ( IDU_Spring 프로젝트에 있음)

###### - FrontController 패턴으로 개발

- Create : blogs-post
  - input form : blog-create-form.jsp
  - action or method : /blogs-post ➡ postBlog() ➡ /blog-all
- Read : blogs-get
  - action or method : /blogs-get ➡ getBlog() ➡ /blog-read-view.jsp
- Read List : blogs-all
  - action or method : /blogs-all ➡ getBlog() ➡ /blog-list-view.jsp
- Update : 
  - form : blog-update-form.jsp
  - action or method : /blogs-put ➡ putBlog() ➡ /blog-read-view.jsp
- Delete :
  - action or method : /blogs-delete ➡ deleteBlog() ➡ /blogs-all

---------

### 2020.04.30  

###### - FrontController 모델을 Spring Web MVC로 변환하시오

1. mvc-blog-[학번] : 프로젝트 이름
2. iducs.spring.blog[학번] : 최상위 패키지
3. get-blogs, get-blog, post-blog 만 Mapping하시오.