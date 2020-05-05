<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

  <%@ include file="../main/i-head.jsp" %>
  <title>202012707 KDY BLOG</title>

</head>

<body>

  <!-- Navigation -->
  <%@ include file="../main/i-nav.jsp" %>
  
  <!-- Page Header -->
  <header class="masthead" style="background-image: url('../img/post-bg.jpg')">
    <div class="overlay"></div>
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
          <div class="site-heading">
            <h1>Blog Detail</h1>
            <span class="subheading">블로그 상세 :D</span>
          </div>
        </div>
      </div>
    </div>
  </header>

  <!-- Post Content -->
  <article>
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
          <h2 class="section-heading">${requestScope.blog.title }</h2>
		  <p>${requestScope.blog.content } <br>: Space, the final frontier. These are the voyages of the Starship Enterprise.</p>	
          <a href="#">
            <img class="img-fluid" src="./files/${requestScope.blog.filepath}" alt="">
          </a>
          <span class="caption text-muted">To go places and do things that have never been done</span>
          <p> Written ${requestScope.blog.regDateTime } 
          Photographs by <a href="#">${requestScope.blog.blogger }</a>.</p>
          <div class="clearfix">
	         <a class="btn btn-primary float-right" href="./blog-update-form.do?id=${blog.id }">수정 &rarr;</a> &nbsp;
	         <a class="btn btn-primary float-right" href="./blogs-delete?id=${blog.id }">삭제 &rarr;</a>
	       </div>
        </div>
      </div>
      
    </div>
  </article>
        
  <hr>

  <!-- Footer -->
  <%@ include file="../main/i-footer.jsp" %>
  
</body>

</html>
