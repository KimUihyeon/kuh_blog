<%--
  Created by IntelliJ IDEA.
  User: kuh
  Date: 2019-08-30
  Time: 오후 4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/WEB-INF/jsp/common/adminCoomonLib.jsp"/>
<div id="blog-admin-menu-container">
    <ul>
        <li v-for="(menu , index ) in menuItems">
            <span><a v-bind:href="menu.url+'?uiFlag='+menu.uiFlag">{{menu.name}}</a></span>
        </li>
    </ul>
</div>

<script>
    let admin_menu_vm = new Vue({
        el : '#blog-admin-menu-container',
        data : {
            menuItems : [],
        },
        mounted : function()  {

            _promise('/admin/menuList', null )
                .then((res)=>{
                    blog_log(res);
                    this.menuItems = res;
                })
                .catch((err)=>{
                    blog_error(err);
                })
            var tempResponse = [
                { id : 0, uiFlag: 0 , url : '/admin/', name :'Home'},
                { id : 1, uiFlag: 1 , url : '/admin/board/list', name :'board List'},
                { id : 2, uiFlag: 2 , url : '/admin/manager/categoris', name :'카테고리 관리'},
                { id : 3, uiFlag: 3 ,  url : '/admin/manager/footer', name :'footer 관리'},
            ];

        },
        method : {

        }
    })
</script>