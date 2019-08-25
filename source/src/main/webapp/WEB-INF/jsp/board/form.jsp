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
<div id="vue">
    <div>
        {{context.id}}
    </div>
    <div>
        <span>타이틀</span>
        <span>{{context.title}}</span>
    </div>
    <div id="editSection"></div>
    <div >
        <div>
            <input type="button" value="전송"  @click="submit()"/>
            <input type="button" value="텍스트 넣기" @click="insert()"/>
            <input type="button" value="마크다운 넣기" @click="htmlToMark()">
        </div>
    </div>
</div>
<script>

    let formType = '';

    let blogId ='${blog_id}';
    let blogDetailUrl = '/board/read?id='+blogId;
    let postUrl = '';
    let vm = new Vue({
        el : '#vue',
        data : {
            context : {
                id : 0,
                title : ''
            }
        },
        mounted : () => {
            _toastEditor.create('editSection');
            formType = '${pageType}';   // { new , edit }

            if(formType === 'edit') { // Edit mode Setting

                if(blogId === ''){
                    blog_alert('','정상적인 접근이 아닙니다.');
                }
                else {
                    blog_log(null, '정상적인 접근');

                    _promise(blogDetailUrl, null)
                        .then((res)=>{
                            console.log(res);
                            vm.context.id = res.id;
                            vm.context.title = res.title;
                            _toastEditor.editor.setMarkdown(res.contextMarkdown);
                        })
                        .catch((err)=>{
                            blog_alert(null,'정상적인 접근이 아닙니다.');
                        });
                }
            }
        },
        methods : {
            submit : () => {
                let data = {
                    blog_id : vm.context.id,
                    blog_title : vm.context.title,
                    blog_context_md : _toastEditor.getMarkdown(),
                    blog_context_html : _toastEditor.getHtml(),
                };
                _promise( vm.getFormUrl(formType) , data)
                    .then((res)=> {
                        console.log(res)
                        return true;
                    })
                    .catch((error)=> {
                        console.error(error)
                        return false;
                    })
                    .then((res)=>{
                        console.log(res);
                        if(res === true){
                            window.location.href = blogDetailUrl;
                        }
                    });

            },
            getFormUrl : (type) => {

                let insertUrl = '/admin/board/insert';
                let updateUrl = '/admin/board/update';
                return (type === 'edit') ? updateUrl : insertUrl;
            }
        }
    })


</script>
</body>
</html>
