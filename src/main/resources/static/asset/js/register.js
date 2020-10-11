window.addEventListener('DOMContentLoaded', (event) => {
	// validate for register
	var btnRegist = document.getElementById('btnRegist');
	btnRegist.addEventListener('onclick',function() {
		let userName = document.getElementById('user_name');
		let password = document.getElementById('password');
		let rePassword = document.getElementById('re_password');
	})
	
	var userName = document.getElementById('user_name');
	var locationPath = String(window.location).substring(0, String(window.location).indexOf("/",10));
	userName.addEventListener('focusout', function() {
		let userNameVl = userName.value;
		var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		  if (xhttp.readyState == 4 && xhttp.status == 200) {
			  console.log(xhttp.responseText);
		      if (xhttp.responseText == "" ) {
		    	  document.getElementById("check_message").innerHTML = "You can use this user name";
		    	  document.getElementById("check_message").style.color= "green";
		      } else {
		    	  document.getElementById("check_message").innerHTML = "This user name has used";
		    	  document.getElementById("check_message").style.color= "red";
		      }
		    }
		  };
		  xhttp.open("GET", locationPath+"/users/"+userNameVl, true);
		  xhttp.send();
	});
});