<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ include file="base.jsp" %>
<script type="text/javascript">
	$('#login').click(function(){
		//$("#sname").val()
		$.post(
			"${pageContext.request.contextPath }/student/login/", 
			{"name":$('#sname').val(),"sex":$('#sex').val()}, 
			
        	function(data) {
				if(data != 0){
					alert("登录失败，账号或密码不正确！");
					$('#uname').val(data);
				}else{
					window.location="${pageContext.request.contextPath }/index.jsp";
				}
			}
        )
		
	})
</script>
</head>
<body>
<form class="login-form" method="post">
	 用户名：<input type="text" id="sname" name="sname">
	性别： <input type="text" id="sex" name="sex">
	<input type="text" id="uname" name="uname">
	<button onclick="login()" >
		登 录
	</button>
</form>
</body>
</html>