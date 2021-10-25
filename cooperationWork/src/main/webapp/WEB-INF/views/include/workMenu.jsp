<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Created by CodingLab |www.youtube.com/CodingLabYT-->
<html lang="ko">
<head>
<meta charset="UTF-8">
<!--<title> Drop Down Sidebar Menu | CodingLab </title>-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/work.css">
<!-- Boxiocns CDN Link -->
<link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css'
	rel='stylesheet'>
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>TASKWITH</title>
</head>
<body>
	<nav class="shadow">
		<div id="blogMenu">
			<ul>
			<li><a href="#"><img src="${pageContext.request.contextPath}/resources/images/vert.png"
	style="height:40px;width:40px;margin-top:15px;"></a>
				<ul style="margin-top:15px;paddle-right:300px;">
					<li><a href="#">Web Design</a></li>
					<li><a href="#">Login Forms</a></li>
					<li><a href="#">Card Design</a></li>
				</ul> 
				</li>
			</ul>
		</div>
			<h3 style="color:white; float:right; margin-top:20px;">서현진 님</h3>
		<div class="navbar">
			<div class="nav-links">
				<ul class="links">
					<li style="color: white; font-size: 30px; margin-top: 3px; margin-left: 20px">새 워크스페이스1</li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="sidebar close">
		<div class="logo-details"
			style="font-size: 50px; margin-left: 12px; margin-top: 15px;">
			<a href="${pageContext.request.contextPath}/space/space"> <i
				class='fas fa-arrow-circle-left' style="color: white;"></i>
			</a> <img class="logo"
				src="${pageContext.request.contextPath}/resources/images/workspace.png"
				style="height: 35px; width: 35px; margin-bottom: 15px; margin-left: 10px;">
			<span class="logo_name" style="font-size: 30px; margin-bottom: 15px;">TASKWITH</span>
		</div>
		<ul class="nav-links">

			<li>
				<div class="iocn-link">
					<a href="#"> <i class='bx bx-collection'></i> <span
						class="link_name">작업관리</span>
					</a> <i class='bx bxs-chevron-down arrow'></i>
				</div>
				<ul class="sub-menu">
					<li><a class="link_name" href="#">작업관리</a></li>
					<li><a href="#">게시판</a></li>
					<li><a href="#">캘린더</a></li>
					<li><a href="#">칸반보드</a></li>
				</ul>
			</li>
			<li>
				<div class="iocn-link">
					<a href="#"> <i class='bx bx-book-alt'></i> <span
						class="link_name">파일관리</span>
					</a> <i class='bx bxs-chevron-down arrow'></i>
				</div>
				<ul class="sub-menu">
					<li><a class="link_name" href="#">파일관리</a></li>
					<li><a href="#">파일브라우저</a></li>
				</ul>
			</li>
			<li>
				<div class="iocn-link">
					<a href="#"> <i class='bx bx-plug'></i> <span class="link_name">메신저</span>
					</a> <i class='bx bxs-chevron-down arrow'></i>
				</div>
				<ul class="sub-menu">
					<li><a class="link_name" href="#">메신저</a></li>
					<li><a href="#">UI Face</a></li>
					<li><a href="#">Pigments</a></li>
					<li><a href="#">Box Icons</a></li>
				</ul>
			</li>
			<li>
				<div class="profile-details">

					<i class='bx bx-log-out'></i>
				</div>
			</li>
		</ul>
	</div>
	<section class="home-section">
		<div class="home-content">
			<i class='bx bx-menu'
				style="color: white; z-index: 10000; margin-top: 10px"></i>
		</div>
	</section>
	<script>
  let arrow = document.querySelectorAll(".arrow");
  for (var i = 0; i < arrow.length; i++) {
    arrow[i].addEventListener("click", (e)=>{
   let arrowParent = e.target.parentElement.parentElement;//selecting main parent of arrow
   arrowParent.classList.toggle("showMenu");
    });
  }
  let sidebar = document.querySelector(".sidebar");
  let sidebarBtn = document.querySelector(".bx-menu");
  console.log(sidebarBtn);
  sidebarBtn.addEventListener("click", ()=>{
    sidebar.classList.toggle("close");
  });
  </script>
</body>
</html>