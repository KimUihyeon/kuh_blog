<%--
  Created by IntelliJ IDEA.
  User: kuh
  Date: 2019-08-15
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title}</title>
    <jsp:include page="/WEB-INF/jsp/common/adminCoomonLib.jsp"/>
</head>

<style>
    /* */
    a, a:active, a:visited, a:hover{
        text-decoration: inherit;
        color: inherit;
    }
    /* Navigation */
    nav {
        background: #00e7eb;
        height: 200px;
        text-align: right;
        padding: 10px;
        position: relative;;
    }
    nav  .blog-menu-item{
        margin-left: 5px;
        margin-right: 5px;
    }
    nav  .blog-menu-item img{
        width: 15px;
        height: 15px;
        margin-left: 3px;
    }

    .font-size-context-title{
        font-size: 24px;
    }
    .font-size-context-ctg{
        font-size: 14px;
    }

    .blog-context-title-continer {
        width: 100%;
        text-align: left;
        position: absolute;
        bottom:  0px;
    }
    .blog-context-title{
        font-size: 18px;
    }

    .blog-context-title-continer-decription {
        position: absolute;
        bottom:  0px;
    }

    /* blog-main */
    .blog-main{
        margin-top: -22px;
        min-height: 500px;
    }

    .blog-context-container{

    }

    .blog-context-container .blog-context{

    }

    .blog-context-container .blog-context-tag-container{

    }
    .blog-context-container .blog-context-tag-container .blog-context-tag{

    }
    /* Footer */

    .footer{
        height: 150px;
    }
    .footer .blog-footer {
        height: 100%;
    }
</style>
<body>
    <div>
        <div class="row">
            <div  class="col-md-12 "style="background: #0f81cc">
                <!-- Image and text -->
                <div  class="col-xs-12 col-md-8 col-md-offset-2"  style="background: #0f81cc">
                    <nav>
                        <span class="blog-menu-item"><a href="javascript:void(0)"><img >홈</a> </span>
                        <span class="blog-menu-item"><a href="javascript:void(0)"><img >메뉴</a> </span>
                        <div class="blog-context-title-continer">
                            <div class="blog-context-title">
                                <span class="font-size-context-title">Title</span>
                                <span class="font-size-context-ctg">ctg1</span>
                                <span class="font-size-context-ctg"> > </span>
                                <span class="font-size-context-ctg">ctg2</span>
                            </div>
                            <div class="blog-context-title-decription">
                                <span></span><a href="javascript:void(0)"><img> kuh1318</a>
                            </div>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
        <div class="row blog-main">
            <div  class="col-xs-12 col-md-8 col-md-offset-2"  style="background: #0f81cc">
                <div class="blog-context-container">
                    <div class="blog-context">
                        <pre>
asdoihasd
asdaksjhldhasldas'
das'dh askldas
dashlkd as
dashdkjasd;lasjkdas
dasdhkljashd;
                        </pre>
                    </div>
                    <div class="blog-context-tag-container">
                        <div class="blog-context-tag"></div>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12 footer" style="background: #00bb00">
                <div  class="col-xs-12 col-md-8 col-md-offset-2"  style="background: #0f81cc">
                    <div class="blog-footer">
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
