<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	var secondsBeforeExpire = ${pageContext.session.maxInactiveInterval};
	var timeToDecide = 45; // Give client 15 seconds to choose.
	alert(secondsBeforeExpire)
    setTimeout(function() {
        alert('세션 타임아웃까지 ' + timeToDecide + ' 초 남았습니다~!~!~')
    }, (secondsBeforeExpire - timeToDecide) * 1000);
	
	
</script>
</body>
</html>