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
    /*font-family: 'Yellowtail', cursive;
font-family: 'Vampiro One', cursive;
font-family: 'Nanum Myeongjo', serif;
font-family: 'Alex Brush', cursive;
*/
    a, a:active, a:visited, a:hover{
        text-decoration: inherit;
        color: inherit;
    }
    .margin-top-10{
        margin-top: 10px;
    }

    .cicle-border-none{
        display: block;
        border: 1px solid #8c8c8c;
        border-radius: 100%;
        overflow: hidden;
    }
    /* Navigation */
    nav {
        height: 200px;
        text-align: right;
        padding: 10px;
        position: relative;
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
    .nav-title-bottom-line{
        height: 1px;
        margin-left: 3%;
        margin-right: 3%;
        border-bottom: 1px solid #ffffffa1;
    }

    .font-size-nav-title {
        text-align: center;
        color: #ffffffa1;
        font-family: 'Alex Brush', cursive;
        padding: 10px;
        font-size: 30px;
    }
    .font-size-context-title{
        font-family: 'Nanum Myeongjo', serif;
        font-size: 2em;
        font-weight: bold;
        color: #ffffffde;

    }
    .nav-bttom-arrow-box{
        bottom: 5%;
        position: absolute;
        width: 100%;
        transition: all 3s;
    }
    .nav-bottom-arrow{
        margin: 0 auto;
        display: block;
        font-weight: 900;
        color: #fff9;
        font-size: 25px;
        border: 1px solid #ffffff38;
        padding: 5px;
        border-radius: 30px;
        width: 35px;
        height: 35px;
    }

    .nav-ctg-context-ctg-border{

        border: 1px solid #9c9c9c;
        border-radius: 5px;
    }
    .font-size-context-ctg{
        font-family: 'Nanum Myeongjo', serif;
        font-size: 14px;
        color: #ffffff78;
        padding: 5px;
    }
    .font-size-context-name {
        font-size: 14px;
        color: #ffffff78;
    }

    .blog-context-title{
        font-size: 18px;
    }

    .blog-context-title-continer {
        width: 100%;
        text-align: left;
        position: absolute;
        top: 30%;
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
        margin: 15px;
        padding: 5px;
        background: #eee;
    }
    .blog-context-container .blog-context-tag-container .blog-context-tag .label {
        background-color: #afafaf;
    }
    /* Footer */


    .footer{
        padding-top: 15px;
        padding-bottom: 15px;
        background: rgb(243, 243, 243);
        border-top: 1px solid #dcdcdc;
    }
    @media screen and (min-width: 769px) { .footer { height: 150px;} }
    @media screen and (max-width: 768px) { .footer { height: 250px;} }

    .footer .blog-footer {
        height: 100%;
    }
    .footer .blog-footer .photoBox {
        margin: 0 auto;
        width: 100px;
        height: 100px;
        margin-top: 10px;
    }
    .footer .blog-footer .photoBox .photo {
        width: 100%;
        height: 100%;
        background: url("/resources/img/back.jpeg") no-repeat center 0;
        background-size: cover;
    }
    .nav-background-area{
        width: 100%;
        position: absolute;
        height: 100%;
        background: #000000;
        z-index: 0;
        top: 0;
        overflow: hidden;
    }
    .nav-serach-icon{
        width: 20px;
    }
    .nav-background{
        background: url("/resources/img/back.jpeg") no-repeat center 0;
        background-size: cover;
        background-attachment: fixed;
    }
    .author-box img{

    }
    .full-size-background{
        height: 100%;
    }
    .margin-padding-zero{
        margin: 0px;
        padding: 0px;
    }
    .author-box img{
        opacity: 0.5;
        width: 30px;
    }
    .footer i {
        font-size: 18px;
        margin: 4px;
    }

    .footer .footerHeader{
        font-size: 24px;
        font-weight: bold;
    }
    .footer .footerDescription{
        font-size: 12px;
    }
</style>
<body>
<div id="blog-app">
    <div class="row full-size-background margin-padding-zero">
        <div  class="col-md-12 full-size-background margin-padding-zero">
            <!-- Image and text -->
            <div class="nav-background-area full-size-background">
                <div class="nav-background full-size-background">
                    <div class="topNav font-size-nav-title ">Devloper.log
                        <span ><img class="nav-serach-icon" src="/resources/img/lib/loupe.svg"></span>
                    </div>
                    <div class="nav-title-bottom-line"></div>
                </div>

            </div>
            <div  class="col-xs-12 col-md-8 col-md-offset-2" >
                <nav class="full-size-background">
                    <div class="blog-context-title-continer">
                        <div class="blog-context-title">
                            <div class="text-center">
                                <span class="font-size-context-title">{{context.title}}</span>
                            </div>
                            <div class="text-center margin-top-10">
                                <span class="font-size-context-ctg">Mysql</span>
                                <span class="font-size-context-ctg">/</span>
                                <span class="font-size-context-ctg">Error처리</span>

                                <span class="font-size-context-ctg nav-ctg-context-ctg-border">{{context.regDate | dateFormate}}</span>
                            </div>


                        </div>
                        <div class="blog-context-title-decription text-center author-box margin-top-10">
                            <span class="font-size-context-name"> <a href="javascript:void(0)">author. <img src="/resources/img/lib/icons8-git-black.svg" alt="">KimUihyeon</a></span>
                        </div>
                    </div>


                    <div class="text-center nav-bttom-arrow-box ">
                        <a href="javascript:void(0)" onclick="screenMove('#blog-main')" >
                                <span class="nav-bottom-arrow">
                                    <i class="fas fa-chevron-down"></i>
                                </span>
                        </a>
                    </div>
                </nav>
            </div>
        </div>
    </div>
    <div class="row blog-main margin-padding-zero" id="blog-main"><!-- 메인 -->
        <div  class="col-xs-12   col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
            <div class="blog-context-container">
                <div class="blog-context">
                    <div id="viewerSection" class="tui-editor-contents" v-html="context.contextHTML">
                    </div>
                </div>
                <div class="blog-context-tag-container">
                    <div class="blog-context-tag">
                        <span class="label label-primary">Primary</span>
                        <span class="label label-success">Success</span>
                        <span class="label label-info">Info</span>
                        <span class="label label-warning">Warning</span>
                        <span class="label label-danger">Danger</span>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row margin-padding-zero"> <!-- List -->
        <div class="col-xs-12   col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
            <div class="row">
                <div class="col-md-6">
                    <div>유사한 주제의 게시물</div>
                    <ul>
                        <li><span>1123129837218 asdlkashd lkasjd lakdjl937219</span></li>
                        <li><span>1</span></li>
                        <li><span>1</span></li>
                        <li><span>1</span></li>
                        <li><span>1</span></li>
                    </ul>
                </div>
                <div class="col-md-6">

                </div>
            </div>
        </div>
    </div>



    <div class="row margin-padding-zero  footer"><!-- footer -->
        <div class="col-md-12" style="background: rgb(243, 243, 243);" >
            <div  class="col-xs-12 col-md-8 col-md-offset-2" >
                <div class="blog-footer">
                    <div class="col-xs-12 col-md-4 col-sm-4">
                        <div class="cicle-border-none photoBox">
                            <div class="photo">

                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-md-8 col-sm-8">
                        <div class="row">
                            <div class="col-md-12">
                                <div><span class="footerHeader">herda</span></div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-6 col-xs-6" col-sm-6 >
                                <div><i class="fas fa-portrait"></i><span class="footerDescription">KimUihyeon</span></div>
                                <div><i class="fas fa-map-marker-alt"></i><span class="footerDescription">Bundang-gu, Seongnam-si</span></div>
                                <div><i class="fab fa-github"></i><a href="https://github.com/KimUihyeon"><span class="footerDescription">https://github.com/KimUihyeon</span></a></div>
                            </div>
                            <div class="col-md-6 col-xs-6 col-sm-6">
                                <div><i class="fas fa-cubes"></i><span class="footerDescription">Spring, WPF, Node Express, Vue, React, Azure devops, AWS </span></div>
                                <div><i class="fas fa-database"></i><span class="footerDescription">mySql, SqlServer,Oracle</span></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
</body>

<script>

    // 뷰객채로 등록할것.
    function screenMove(hash){
        $('html, body').animate({
            scrollTop: $(hash).offset().top
        }, 500, function(){

            window.location.hash = hash;
        });
    }

    let vm = new Vue({
        el : '#blog-app',
        data : {
            context : {}
        },
        mounted : () =>{
            _promise('/board/read?id=${id}', null)
                .then((res)=>{ vm.context = res; console.log(res); })
        }
    })

    function setDate(content){
        console.log(content);

        var editor = new tui.Editor({
            el: document.querySelector('#viewerSection'),
            isViewer : true,
            height: '300px',
            initialValue: content
        });
    }

</script>
</html>
