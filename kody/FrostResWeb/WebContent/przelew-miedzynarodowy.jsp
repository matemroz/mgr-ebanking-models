<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Strona banku FrostRes</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/modern-business.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
<div class="container"><!-- Brand and toggle get grouped for better mobile display -->
<div class="navbar-header">
<button type="button" class="navbar-toggle" data-toggle="collapse"
	data-target="#bs-example-navbar-collapse-1"><span
	class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
<span class="icon-bar"></span> <span class="icon-bar"></span></button>
<a class="navbar-brand" href="index.html">FrostRes</a></div>
<!-- Collect the nav links, forms, and other content for toggling -->
<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
<ul class="nav navbar-nav navbar-right">
	<li><a href="about.html">O Banku</a></li>
	<li class="dropdown">
      <a href="#" class="dropdown-toggle" data-toggle="dropdown">Usługi <b class="caret"></b></a>
      <ul class="dropdown-menu">
          <li>
              <a href="przelew-miedzynarodowy.jsp">Przelew międzynarodowy</a>
          </li>
          <li>
              <a href="#">Przelew krajowy</a>
          </li>
          <li>
              <a href="#">Pobierz informacje o koncie klienta</a>
          </li>
          <li>
          	<a href="#">Pobierz historię operacji klienta</a>
          </li>
          <li>
          	<a href="#">Wpłata</a>
          </li>
          <li>
          	<a href="#">Wypłata</a>
          </li>
          <li>
          	<a href="#">Otwórz nowe konto</a>
          </li>
          <li>
          	<a href="#">Zamknij konto</a>
          </li>
      </ul>
	</li>
	<li><a href="contact.html">Kontakt</a></li>
</ul>
</div>
<!-- /.navbar-collapse --></div>
<!-- /.container -->
</nav>

<!-- Page Content -->
<div class="container"><!-- Page Heading/Breadcrumbs -->
<div class="row">
<div class="col-lg-12">
<h1 class="page-header">FrostRes <small>Przelew
międzynarodowy</small></h1>
<ol class="breadcrumb">
	<li><a href="index.html">Strona Główna</a></li>
	<li class="active">Przelew międzynarodowy</li>
</ol>
</div>
</div>

<div class="container">
<form class="form-horizontal" method="POST" action="PrzelewMiedzynarodowyServlet">
<div class="form-group"><label for="nrRachNadLabel"
	class="col-sm-2 control-label">Nr rachunku nadawcy</label>
<div class="col-xs-4"><input type="text" class="form-control"
	id="nrRachNadLabel" name="nrRachunkuNadawcy"></div>
</div>
<div class="form-group"><label for="nrRachOdLabel"
	class="col-sm-2 control-label">Nr rachunku odbiorcy</label>
<div class="col-xs-4"><input type="text" class="form-control"
	id="nrRachOdLabel" name="nrRachunkuOdbiorcy"></div>
</div>
<div class="form-group"><label for="kodKrajuLabel"
	class="col-sm-2 control-label">Kod kraju</label>
<div class="col-xs-2"><input type="text" class="form-control"
	id="kodKrajuLabel" name="kodKraju"></div>
</div>
<div class="form-group"><label for="walutaLabel"
	class="col-sm-2 control-label">Waluta</label>
<div class="col-xs-1"><input type="text" class="form-control"
	id="walutaLabel" name="waluta"></div>
</div>
<div class="form-group"><label for="przelicznikLabel"
	class="col-sm-2 control-label">Przelicznik</label>
<div class="col-xs-1"><input type="text" class="form-control"
	id="przelicznikLabel" name="przelicznik"></div>
</div>
<div class="form-group"><label for="tytulLabel"
	class="col-sm-2 control-label">Tytuł</label>
<div class="col-xs-3"><input type="text" class="form-control"
	id="tytulLabel" name="tytul"></div>
</div>
<div class="form-group"><label for="opisLabel"
	class="col-sm-2 control-label">Opis</label>
<div class="col-xs-3"><textarea class="form-control"
	id="opisLabel" rows="3" name="opis"></textarea></div>
</div>
<div class="form-group"><label for="kwotaLabel"
	class="col-sm-2 control-label">Kwota</label>
<div class="col-xs-1"><input type="text" class="form-control" 
id="kwotaLabel" name="kwota"></div>
</div>
<div class="form-group">
<div class="col-sm-offset-2 col-sm-10">
<button type="submit" class="btn btn-primary" id="wykonajBtn">Wykonaj</button>
</div>
</div>
</form>
</div>
<br>
<br>
<hr>

<!-- Footer --> <footer>
<div class="row">
<div class="col-lg-12">
<p>Copyright &copy; Mateusz Mróz - Praca magisterska 2015</p>
</div>
</div>
</footer></div>
<!-- /.container -->

<!-- jQuery -->
<script src="js/jquery.js"></script>
<!-- 
         <script>
            $(document).ready(function() {                        
                $('#wykonajBtn').click(function(event) {  
                    var kwotaPrzelewu=$('#kwotaLabel').val();
                $.post('PrzelewMiedzynarodowyServlet',{kwota:kwotaPrzelewu},function(responseText) { 
                        $('#statusPrzelewu').text(responseText);
                    });
                });
            });
        </script>
 -->
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
 
 
</body>
</html>