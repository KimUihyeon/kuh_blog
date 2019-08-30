<%--
  Created by IntelliJ IDEA.
  User: kuh
  Date: 2019-08-30
  Time: 오후 4:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <div>
        <jsp:include page="/WEB-INF/jsp/admin/menu.jsp"></jsp:include>
    </div>
    <div id="vue">
        <div id="grid">

        </div>
    </div>
</div>

<script>

    let vm = new Vue({
        el : '#vue',
        data :  {

        },
        mounted : function (){
            let colunms  = [
                {
                    header: 'Name',
                    name: 'name'
                },
                {
                    header: 'artist',
                    name: 'artist'
                },
                {
                    header: 'release',
                    name: 'release'
                },
                {
                    header: 'genre',
                    name: 'genre'
                }
            ]
            _toastGrid.create('grid' , colunms);
        },
    });

    function ttt (){
        var data =[
            {
                name: 'Beautiful Lies',
                artist: 'Birdy',
                release: '2016.03.26',
                genre: 'Pop'
            },
            {
                name: 'Beautiful Lies',
                artist: 'Birdy',
                release: '2016.03.26',
                genre: 'Pop'
            },
            {
                name: 'Beautiful Lies',
                artist: 'Birdy',
                release: '2016.03.26',
                genre: 'Pop'
            },
            {
                name: 'Beautiful Lies',
                artist: 'Birdy',
                release: '2016.03.26',
                genre: 'Pop'
            },
        ];
        _toastGrid.addRows(data);
    }



</script>

</body>
</html>
