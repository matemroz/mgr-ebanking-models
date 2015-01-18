function getXMLObject() // XML OBJECT
{
	var xmlHttp = false;
	try {
		xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
	} catch (e) {
		try {
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		} catch (e2) {
			xmlHttp = false;
		}
	}
	if (!xmlHttp && typeof XMLHttpRequest != 'undefined') {
		xmlHttp = new XMLHttpRequest();
	}
	return xmlHttp;
}

var xmlhttp = new getXMLObject();

function ajaxGETFunction(servletURL) {
	if (xmlhttp) {
		xmlhttp.open("GET", servletURL, true);
		xmlhttp.onreadystatechange = handleServerResponse;
		xmlhttp.setRequestHeader('Content-Type',
				'application/x-www-form-urlencoded');
		xmlhttp.send(null);
	}
}

function orderConfirmationAjaxGETFunction(input) {
	ajaxGETFunction("PrzelewMiedzynarodowyServlet?" + input);
}

function handleServerResponse() {
	if (xmlhttp.readyState == 4) {
		document.getElementById("statusPrzelewu").innerHTML = '';
		document.getElementById("statusPrzelwuOpis").innerHTML = xmlhttp.responseText;
	}
}