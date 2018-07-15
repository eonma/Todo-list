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
						<li><a href="all" class="active"><i class="ti-home"></i> <span class="title">All</span> <span class="badge">${fn:length(tasks)}</span></a></li>
						<li><a href="today"><i class="ti-calendar"></i> <span class="title">Today</span> </a></li>
						<li><a href="week"><i class="ti-layers-alt"></i> <span class="title">Week</span> </a></li>
						<li><a href="completed"><i class="ti-check-box"></i> <span class="title">Completed</span></a></li>
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
							<h1 class="page-title">All</h1>
						</div>
					</div>
					<div class="container-fluid">
					<div class="row sortable-grid">
						<!-- CHAT SUPPORT -->
						<div class="col-md-12 sortable-item">
						<form:form class="form-horizontal" method="post" action="save" modelAttribute="task" id="saveForm">
							<div class="input-group">
								<form:input path="title" class="form-control" type="text" placeholder="Add a ToDo"/>
								<span class="input-group-btn">
									<button class="btn btn-primary" type="submit" id="addTask">Add</button>
								</span>
							</div>
						</form:form>
							<br>
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
													<span class="milestone-title">
														<i class="fa fa-check icon-indicator ${colourLable}"></i> ${task.title}</span> 
													<span class="label ${dateLable} label-transparent" style="float:right;">${task.dueDate}</span>
												</a>
											</h4>
										</div>
										
										<div id="collapse${task.id}" class="panel-collapse collapse">
										
											<form:form class="form-horizontal" method="post" action="edit" modelAttribute="task" id="taskForm">
												<form:hidden path="id" value="${task.id}" />
												<div class="panel-body">
													<div class="form-group">
														<form:label path="title" class="col-sm-1 control-label">TITLE</form:label>
														<div class="col-sm-11">
															<form:input path="title" type="text" class="form-control" id="title" value="${task.title}"/>
														</div>
													</div>
													<div class="form-group">
														<form:label path="note" class="col-sm-1 control-label">NOTE</form:label>
														<div class="col-sm-11">
															<form:input path="note" type="text" class="form-control" id="note" placeholder="note" value="${task.note}"/>
														</div>
													</div>
													<div class="milestone-section layout-table project-metrics">
														
														<div class="cell">
															<div class="main-info-item">
																<span class="title">DATE START</span> 
																
																	<div class="input-group date" data-date-autoclose="true" data-provide="datepicker">
																		<form:input path="createDate" type="text" class="form-control" value="${createDate }"/>
																		<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
																	</div>
																
															</div>
														</div>
														<div class="cell">
															<div class="main-info-item">
																<span class="title">DATE END</span> 
																
																	<div class="input-group date" data-date-autoclose="true" data-provide="datepicker">
																		<form:input path="dueDate" type="text" class="form-control" value="${dueDate}"/>
																		<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
																	</div>
																
															</div>
														</div>
													</div>
												</div>
											<div class="panel-footer">
												<button class="btn btn-warning" id="editBtn${task.id}" type="submit" formaction="edit"> <i class="fa fa-pencil"></i> Edit </button>
												<button class="btn btn-primary" id="editBtn${task.id}" type="submit" formaction="complete" style="float:right;"> <i class="fa fa-check"></i> Complete </button>
											
											</div>
											
											</form:form>
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