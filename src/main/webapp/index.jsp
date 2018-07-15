<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Welcome to Klorofil Pro | Klorofil Pro - Bootstrap Admin Dashboard Template</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
		<!-- VENDOR CSS -->
		<link rel="stylesheet" href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/vendor/font-awesome/css/font-awesome.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/vendor/themify-icons/css/themify-icons.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/vendor/pace/themes/orange/pace-theme-minimal.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/vendor/x-editable/bootstrap3-editable/css/bootstrap-editable.css" />">
		<!-- MAIN CSS -->
		<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/skins/sidebar-nav-darkgray.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/skins/navbar3.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/themify-icons.css" />">
		<!-- ICONS -->
		<link rel="icon" type="image/png" sizes="96x96" href="<c:url value="/resources/img/favicon.png" />">
	</head>
	<body>
		<!-- WRAPPER -->
		<div id="wrapper">
			<!-- NAVBAR -->
			<nav class="navbar navbar-default navbar-fixed-top">
				<div class="brand">
					<a href="index.html">
						<img src="<c:url value="/resources/img/logo-white.png" />" alt="Klorofil Pro Logo" class="img-responsive logo">
					</a>
				</div>
				<div class="container-fluid">
					<div id="navbar-menu">
						<ul class="nav navbar-nav navbar-right">
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									<span>CM</span>
								</a>
								<ul class="dropdown-menu logged-user-menu">
									<li><a href="#"><i class="ti-user"></i> <span>My Profile</span></a></li>
									<li><a href="appviews-inbox.html"><i class="ti-email"></i> <span>Message</span></a></li>
									<li><a href="#"><i class="ti-settings"></i> <span>Settings</span></a></li>
									<li><a href="page-lockscreen.html"><i class="ti-power-off"></i> <span>Logout</span></a></li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<!-- END NAVBAR -->
			<!-- LEFT SIDEBAR -->
			<div id="sidebar-nav" class="sidebar">
				<nav>
					<ul class="nav" id="sidebar-nav-menu">
						<li class="menu-group">ToDo List</li>
						<li><a href="all" class="active"><i class="ti-home"></i> <span class="title">All</span> <span class="badge">15</span></a></li>
						<li><a href="today"><i class="ti-calendar"></i> <span class="title">Today</span> <span class="badge">5</span></a></li>
						<li><a href="week"><i class="ti-agenda"></i> <span class="title">Week</span> <span class="badge">8</span></a></li>
						<li><a href="completed"><i class="ti-check"></i> <span class="title">Completed</span></a></li>
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
							<h1 class="page-title">Welcome to CM ToDo List</h1>
						</div>
						<ul class="breadcrumb">
							<li><a href="#"><i class="fa fa-home"></i> Home</a></li>
							<li class="active">All</li>
						</ul>
					</div>
					<div class="container-fluid"> 
						<div class="row sortable-grid">
							<!-- CHAT SUPPORT -->
						<div class="col-md-12 sortable-item">
							<div class="input-group">
								<input class="form-control" type="text" placeholder="Add a ToDo">
								<span class="input-group-btn">
									<button class="btn btn-primary" type="button">Add</button>
								</span>
							</div>
							<br>
							<div class="panel-group project-accordion">
												<!-- project milestone -->
												<div class="panel project-milestone">
													<div class="panel-heading">
														<h4 class="panel-title">
															<a href="#collapse1" data-toggle="collapse" data-parent="#accordion" class="collapsed" aria-expanded="false">
																<span class="milestone-title"><i class="fa fa-check icon-indicator text-success"></i> Research on eCommerce Trends</span>
																<span class="label label-success label-transparent">PAID</span>
																<i class="fa toggle-icon fa-plus-circle"></i>
															</a>
														</h4>
													</div>
													<div id="collapse1" class="panel-collapse collapse" aria-expanded="false" style="height: 0px;">
														<div class="panel-body">
															<div class="milestone-section">
																<h4 class="milestone-heading">DESCRIPTION</h4>
																<p class="milestone-description">Velit elitr dolore eu pri, ut has vero imperdiet dissentiet, sit magna blandit reformidans in. Alia commune disputationi vis no, natum rebum melius in ius.</p>
															</div>
															<div class="milestone-section layout-table project-metrics">
																<div class="cell">
																	<div class="main-info-item">
																		<span class="title">DATE START</span>
																		<span class="value">Jul 23, 2017</span>
																	</div>
																</div>
																<div class="cell">
																	<div class="main-info-item">
																		<span class="title">DATE END</span>
																		<span class="value">Aug 01, 2017</span>
																	</div>
																</div>
																<div class="cell">
																	<div class="main-info-item">
																		<span class="title">EST. VALUE</span>
																		<span class="value">$1,200</span>
																	</div>
																</div>
																<div class="cell">
																	<div class="main-info-item">
																		<span class="title">DELIVERABLE</span>
																		<span class="value">
																			<i class="fa fa-file-pdf-o"></i>
																			<a href="#">Research_FINAL.pdf</a>
																		</span>
																	</div>
																</div>
															</div>
															<div class="milestone-section">
																<div class="table-responsive">
																	<table class="table table-striped table-project-tasks">
																		<thead>
																			<tr>
																				<th>TASK</th>
																				<th>DEADLINE</th>
																				<th>PROGRESS</th>
																				<th>ACTIONS</th>
																			</tr>
																		</thead>
																		<tbody>
																			<tr>
																				<td colspan="4" class="divider">COMPLETED TASK</td>
																			</tr>
																			<tr>
																				<td>
																					<span class="task-indicator success"></span> Functional Specs</td>
																				<td>Jul 30, 2017</td>
																				<td>100%</td>
																				<td>
																					<span class="actions">
																						<a href="#"><i class="fa fa-eye"></i></a>
																						<a href="#"><i class="fa fa-pencil"></i></a>
																						<a href="#"><i class="fa fa-trash"></i></a>
																					</span>
																				</td>
																			</tr>
																			<tr>
																				<td>
																					<span class="task-indicator success"></span> Design Specs</td>
																				<td>Aug 01, 2017</td>
																				<td>100%</td>
																				<td>
																					<span class="actions">
																						<a href="#"><i class="fa fa-eye"></i></a>
																						<a href="#"><i class="fa fa-pencil"></i></a>
																						<a href="#"><i class="fa fa-trash"></i></a>
																					</span>
																				</td>
																			</tr>
																		</tbody>
																	</table>
																</div>
															</div>
														</div>
														<div class="panel-footer">
															<a href="#" class="btn btn-default"><i class="fa fa-pencil"></i> EDIT MILESTONE</a>
															<a href="#" class="btn btn-default"><i class="fa fa-cloud-upload"></i> UPLOAD</a>
															<a href="#" class="btn btn-success"><i class="fa fa-file"></i> VIEW INVOICE</a>
														</div>
													</div>
												</div>
												<!-- end project milestone -->
												<!-- project milestone -->
												<div class="panel project-milestone">
													<div class="panel-heading">
														<h4 class="panel-title">
															<a href="#collapse3" data-toggle="collapse" data-parent="#accordion" class="collapsed">
																<span class="milestone-title"><i class="fa fa-spinner icon-indicator custom-text-blue3"></i> Phase 1 Project Delivery</span>
																<span class="note">7 days until deadline</span>
																<i class="fa fa-plus-circle toggle-icon"></i>
															</a>
														</h4>
													</div>
													<div id="collapse3" class="panel-collapse collapse">
														<div class="panel-body">
															<div class="milestone-section">
																<h4 class="milestone-heading">DESCRIPTION</h4>
																<p class="milestone-description">Velit elitr dolore eu pri, ut has vero imperdiet dissentiet, sit magna blandit reformidans in. Alia commune disputationi vis no, natum rebum melius in ius.</p>
															</div>
															<div class="milestone-section layout-table project-metrics">
																<div class="cell">
																	<div class="main-info-item">
																		<span class="title">DATE START</span>
																		<span class="value">Jul 23, 2017</span>
																	</div>
																</div>
																<div class="cell">
																	<div class="main-info-item">
																		<span class="title">DATE END</span>
																		<span class="value">Oct 01, 2017</span>
																	</div>
																</div>
																<div class="cell">
																	<div class="main-info-item">
																		<span class="title">EST. VALUE</span>
																		<span class="value">$21,847</span>
																	</div>
																</div>
																<div class="cell">
																	<div class="main-info-item">
																		<span class="title">DELIVERABLE</span>
																		<span class="value">
																			<i class="fa fa-file-archive-o"></i>
																			<a href="#">project_source_main.zip</a>
																		</span>
																	</div>
																</div>
															</div>
														</div>
														<div class="panel-footer">
															<a href="#" class="btn btn-default"><i class="fa fa-pencil"></i> EDIT MILESTONE</a>
															<a href="#" class="btn btn-default"><i class="fa fa-cloud-upload"></i> UPLOAD</a>
															<a href="#" class="btn btn-success"><i class="fa fa-file"></i> CREATE INVOICE</a>
														</div>
													</div>
												</div>
												<!-- end project milestone -->
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
		<script src="<c:url value="/resources/vendor/bootstrap-progressbar/js/bootstrap-progressbar.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/Flot/jquery.flot.js" />"></script>
		<script src="<c:url value="/resources/vendor/Flot/jquery.flot.resize.js" />"></script>
		<script src="<c:url value="/resources/vendor/Flot/jquery.flot.time.js" />"></script>
		<script src="<c:url value="/resources/vendor/flot.tooltip/jquery.flot.tooltip.js" />"></script>
		<script src="<c:url value="/resources/vendor/x-editable/bootstrap3-editable/js/bootstrap-editable.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/jquery.maskedinput/jquery.maskedinput.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/moment/min/moment.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/jquery-sparkline/js/jquery.sparkline.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/bootstrap-tour/js/bootstrap-tour.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/jquery-ui/ui/widget.js" />"></script>
		<script src="<c:url value="/resources/vendor/jquery-ui/ui/data.js" />"></script>
		<script src="<c:url value="/resources/vendor/jquery-ui/ui/scroll-parent.js" />"></script>
		<script src="<c:url value="/resources/vendor/jquery-ui/ui/disable-selection.js" />"></script>
		<script src="<c:url value="/resources/vendor/jquery-ui/ui/widgets/mouse.js" />"></script>
		<script src="<c:url value="/resources/vendor/jquery-ui/ui/widgets/sortable.js" />"></script>
		<script src="<c:url value="/resources/vendor/datatables/js-main/jquery.dataTables.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/datatables/js-bootstrap/dataTables.bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/jquery-appear/jquery.appear.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/jqvmap/jquery.vmap.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/jqvmap/maps/jquery.vmap.world.js" />"></script>
		<script src="<c:url value="/resources/vendor/jqvmap/maps/jquery.vmap.usa.js" />"></script>
		<script src="<c:url value="/resources/vendor/chart-js/Chart.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/raphael/raphael.min.js" />"></script>
		<script src="<c:url value="/resources/vendor/justgage-toorshia/justgage.js" />"></script>
		<script src="<c:url value="/resources/scripts/klorofilpro-common.js" />"></script>
		
	</body>
</html>