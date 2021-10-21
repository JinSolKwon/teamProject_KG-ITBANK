<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Created by CodingLab |www.youtube.com/CodingLabYT-->
<html lang="ko" dir="ltr">
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
	<span class="write-setting" style="color:white; float:right;">
						<i class='bx bx-log-out'></i>
					</span>
		<div class="navbar">
			<div class="nav-links">
				<div class="sidebar-logo">
					<span class="logo-name">CodingLab</span> <i class='bx bx-x'></i>
				</div>
				<ul class="links" style="margin-left:30px;">
					<li style="color:white; font-size:30px; margin-top:3px;">새 워크스페이스1</li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="sidebar close">
		<div class="logo-details" style="font-size:50px; margin-left:12px;margin-top:15px;">
			<a href="${pageContext.request.contextPath}/space/space"><i class='fas fa-arrow-circle-left'
			style="color:white;"></i>
			</a>
			&nbsp&nbsp&nbsp<span class="logo_name" style="font-size:30px; margin-bottom:10px;">TASKWITH</span>
		</div>
		<ul class="nav-links">
			<li><a href="#"> <i class='bx bx-grid-alt'></i> <span
					class="link_name">Dashboard</span>
			</a>
				<ul class="sub-menu blank">
					<li><a class="link_name" href="#">Category</a></li>
				</ul></li>
			<li>
				<div class="iocn-link">
					<a href="#"> <i class='bx bx-collection'></i> <span
						class="link_name">Category</span>
					</a> <i class='bx bxs-chevron-down arrow'></i>
				</div>
				<ul class="sub-menu">
					<li><a class="link_name" href="#">Category</a></li>
					<li><a href="#">HTML & CSS</a></li>
					<li><a href="#">JavaScript</a></li>
					<li><a href="#">PHP & MySQL</a></li>
				</ul>
			</li>
			<li>
				<div class="iocn-link">
					<a href="#"> <i class='bx bx-book-alt'></i> <span
						class="link_name">Posts</span>
					</a> <i class='bx bxs-chevron-down arrow'></i>
				</div>
				<ul class="sub-menu">
					<li><a class="link_name" href="#">Posts</a></li>
					<li><a href="#">Web Design</a></li>
					<li><a href="#">Login Form</a></li>
					<li><a href="#">Card Design</a></li>
				</ul>
			</li>
			<li><a href="#"> <i class='bx bx-pie-chart-alt-2'></i> <span
					class="link_name">Analytics</span>
			</a>
				<ul class="sub-menu blank">
					<li><a class="link_name" href="#">Analytics</a></li>
				</ul></li>
			<li><a href="#"> <i class='bx bx-line-chart'></i> <span
					class="link_name">Chart</span>
			</a>
				<ul class="sub-menu blank">
					<li><a class="link_name" href="#">Chart</a></li>
				</ul></li>
			<li>
				<div class="iocn-link">
					<a href="#"> <i class='bx bx-plug'></i> <span
						class="link_name">Plugins</span>
					</a> <i class='bx bxs-chevron-down arrow'></i>
				</div>
				<ul class="sub-menu">
					<li><a class="link_name" href="#">Plugins</a></li>
					<li><a href="#">UI Face</a></li>
					<li><a href="#">Pigments</a></li>
					<li><a href="#">Box Icons</a></li>
				</ul>
			</li>
			<li><a href="#"> <i class='bx bx-compass'></i> <span
					class="link_name">Explore</span>
			</a>
				<ul class="sub-menu blank">
					<li><a class="link_name" href="#">Explore</a></li>
				</ul></li>
			<li><a href="#"> <i class='bx bx-history'></i> <span
					class="link_name">History</span>
			</a>
				<ul class="sub-menu blank">
					<li><a class="link_name" href="#">History</a></li>
				</ul></li>
			<li><a href="#"> <i class='bx bx-cog'></i> <span
					class="link_name">Setting</span>
			</a>
				<ul class="sub-menu blank">
					<li><a class="link_name" href="#">Setting</a></li>
				</ul></li>
			<li>
				<div class="profile-details">
					
					<i class='bx bx-log-out'></i>
				</div>
			</li>
		</ul>
	</div>
	<section class="home-section">
		<div class="home-content">
			<i class='bx bx-menu' style="color:white; z-index:10000; margin-top:10px"></i>
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