<%--
  Created by IntelliJ IDEA.
  User: kuh
  Date: 2019-08-15
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/WEB-INF/jsp/common/adminCoomonLib.jsp"/>
</head>
<body>
    <div>
        <div id="vue">

            <form action="/test/jsonTest" method="post">
                <div id="summernote"><p>Hello Summernote</p></div>

                <input type="button" value="전송" @click="submit">
            </form>

        </div>
    </div>
</body>
<script>

    let temp = null;
    let vm = new Vue({
        el : '#vue',
        data : {
            editContext : '',
        },
        mounted : function (){
            _summernote.init('summernote');
        },
        methods: {
          submit : function (){

              var parameter = {
                  editorWhrite : $('#summernote').summernote('code')
              }
              temp = parameter.editorWhrite;

              console.log(parameter);

          }
        }
    })
</script>
</html>
