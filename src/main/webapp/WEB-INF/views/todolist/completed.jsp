<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Welcome to ToDo</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
		<!-- VENDOR CSS -->
		<link rel="stylesheet" href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/vendor/font-awesome/css/font-awesome.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/vendor/themify-icons/css/themify-icons.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/vendor/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" />">
		<!-- MAIN CSS -->
		<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/skins/sidebar-nav-darkgray.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/skins/navbar3.css" />">
		<!-- ICONS -->
		<link rel="icon" type="image/png" href="<c:url value="/resources/img/favicon.png" />">
	</head>
	<body>
		<!-- WRAPPER -->
		<div id="wrapper">
			<!-- NAVBAR -->
			<nav class="navbar navbar-default navbar-fixed-top">
				<div class="brand">
					<a href="all">
						<img src="<c:url value="/resources/img/logo.png" />" class="img-responsive logo">
					</a>
				</div>
			</nav>
			<!-- END NAVBAR -->
			<!-- LEFT SIDEBAR -->
			<div id="sidebar-nav" class="sidebar">
				<nav>
					<ul class="nav" id="sidebar-nav-menu">
						<li class="menu-group">ToDo List</li>
						<li><a href="all"><i class="ti-home"></i> <span class="title">All</span> </a></li>
						<li><a href="today"><i class="ti-calendar"></i> <span class="title">Today</span> </a></li>
						<li><a href="completed" class="active"><i class="ti-check"></i> <span class="title">Completed</span><span class="badge">${fn:length(tasks)}</span></a></li>
					</ul>
					<button type="button" class="btn-toggle-minified" title="Toggle Minified Menu"><i class="ti-arrows-horizontal"></i></button>
				</nav>
			</div>
			<!-- END LEFT SIDEBAR -->
			<!-- MAIN -->
			<div class="main">
				<!-- MAIN CONTENT -->
				<div class="main-content">
					<div class="content-heading clearfix">
						<div class="heading-left">
							<h1 class="page-title">COMPLETED</h1>
						</div>
					</div>
					<div class="container-fluid">
					<div class="row sortable-grid">
						<!-- CHAT SUPPORT -->
						<div class="col-md-12 sortable-item">
							<div class="panel-group project-accordion">

								<c:forEach var="task" items="${tasks}">
									<c:set var="dateLable" value="label-success"/>
									<c:set var="colourLable" value="custom-text-green3"/>
									<c:if test = "${task.overDue}">
										<c:set var="dateLable" value="label-danger"/>
										<c:set var="colourLable" value="custom-text-red"/>
									</c:if>
									<c:if test = "${task.today}">
										<c:set var="dateLable" value="label-warning"/>
										<c:set var="colourLable" value="custom-text-yellow"/>
									</c:if>
									<fmt:formatDate value="${task.dueDate}" pattern="MM/dd/yyyy" var="dueDate"/>
									<fmt:formatDate value="${task.createDate}" pattern="MM/dd/yyyy" var="createDate"/>
									<div class="panel project-milestone">
										<div class="panel-heading">
											<h4 class="panel-title">
												<a href="#collapse${task.id}" data-toggle="collapse"
													data-parent="#accordion" class="collapsed"> 
													<span class="milestone-title" style="text-decoration: line-through; color:grey;">
														<i class="fa fa-check icon-indicator ${colourLable}"></i>${task.title}</span> 
													<span class="label ${dateLable} label-transparent" style="float:right;">${task.dueDate}</span>
												</a>
											</h4>
										</div>
										
										<div id="collapse${task.id}" class="panel-collapse collapse">
											<div class="panel-body">
												<div class="milestone-section">
													<h4 class="milestone-heading">TITLE</h4>
													<p class="milestone-description">${task.title}</p>
													<br>
													<h4 class="milestone-heading">NOTE</h4>
													<p class="milestone-description">${task.note}</p>
												</div>
												<div class="milestone-section layout-table project-metrics">
													<div class="cell">
														<div class="main-info-item">
															<span class="title">DATE START</span> <span class="value">${task.createDate}</span>
														</div>
													</div>
													<div class="cell">
														<div class="main-info-item">
															<span class="title">DATE END</span> <span class="value">${task.dueDate}</span>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</c:forEach> 
							</div>
						</div>
					</div>
				</div>
				</div>
			</div>
			<!-- END MAIN -->
			<div class="clearfix"></div>
			<footer>
				<div class="container-fluid">
					<p class="copyright">cm </p>
				</div>
			</footer>
		</div>
		<!-- END WRAPPER -->
		<!-- Javascript -->
		<script src="<c:url value="/resources/vendor/jquery/jquery.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/pace/pace.min.js" />"></script>
		<script src="<c:url value="/resources/scripts/klorofilpro-common.js" />"></script>
		<script src="<c:url value="/resources/vendor/bootstrap-datepicker/js/bootstrap-datepicker.min.js" />"></script>
		<script src="<c:url value="/resources/scripts/todolist.js" />"></script>
		
	</body>
</html>