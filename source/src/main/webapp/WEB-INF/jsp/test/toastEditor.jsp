<%--
  Created by IntelliJ IDEA.
  User: kuh
  Date: 2019-08-21
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/WEB-INF/jsp/common/adminCoomonLib.jsp"/>
</head>
<body>

    <div id="editSection"></div>
    <div id="vue">
        <div>
            <input type="button" value="전송"  @click="submit()"/>
            <input type="button" value="텍스트 넣기" @click="insert()"/>
            <input type="button" value="마크다운 넣기" @click="htmlToMark()">
        </div>
    </div>
    <script>
        var editor = null;
        window.onload = function(){
            editor =  _toastEditor.create('editSection');
        };


        let vm = new Vue({
            el : '#vue',
            data : {

            },
            methods : {
                submit : function (){
                    _toastEditor.

                },
                insert : function (){
                    let value = '이미지에요';
                    console.log(_toastEditor);
                    _toastEditor.insertImage(value, 'https://uicdn.toast.com/tui-editor/tui-editor-preview-1520325258239.gif');
                    _toastEditor.editor.hooks.addImageBlobHook(file, function(dd){ console.log(dd) ; console.log('asdad')});
                },
                htmlToMark : function (){
                    var tt = `<p>asljkdhasd<br>
                    asdklsajd<br>
                    <img src="https://uicdn.toast.com/tui-editor/tui-editor-preview-1520325258239.gif" alt="이미지에요"></p>
                    `
                    _toastEditor.htmlToMarkdown(tt);
                }
            }
        })


    </script>
</body>
</html>
