<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<button id = "find-me">Show my location</button><br/>
<p id = "status"></p>
<a id = "map-link" target="_blank"></a>


<script>

	function geoFindMe() {

	   const status = document.querySelector('#status');
	   const mapLink = document.querySelector('#map-link');

	   mapLink.href = '';
	   mapLink.textContent = '';

             // 성공했을 떄 , 현재나의 위치 좌표를 전달받음
	    function success(position) {
	     const latitude  = position.coords.latitude;   //위도
	     const longitude = position.coords.longitude;  //경도

	     status.textContent = '';
	      mapLink.href = `https://www.openstreetmap.org/#map=18/${latitude}/${longitude}`;
	  //  mapLink.href = 'https://www.openstreetmap.org/#map=18/'+latitude + '/' + longitude;
	      mapLink.textContent = `Latitude: ${latitude} °, Longitude: ${longitude} °`;
	     }

	  
              // 실패했을 떄
	    function error() {
	      status.textContent = 'Unable to retrieve your location';
	    }
             

	  if(!navigator.geolocation) {
	    status.textContent = 'Geolocation is not supported by your browser';
	  } else {
	    status.textContent = 'Locating…';
	    navigator.geolocation.getCurrentPosition(success, error);
	  }

	}

	//버튼에 클릭이벤트 등록하기
	document.querySelector('#find-me').addEventListener('click', geoFindMe);
</script>
</body>
</html>
>