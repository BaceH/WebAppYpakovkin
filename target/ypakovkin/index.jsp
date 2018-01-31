<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<c:import url="/pages/common/head.jsp" />

<body>
<div class="page">
    <!-- HEADER -->
    <c:import url="/pages/common/header.jsp" />
    <!-- HEADER -->
    <!--
    ========================================================
                                CONTENT
    ========================================================
    -->
    <main>
        <section class="camera_container">
            <div id="camera" class="camera_wrap">
                <div data-src="images/page-1_slide01.jpg">
                    <div class="camera_caption fadeIn">
                        <div class="container">
                            <div class="row">
                                <div class="preffix_6 grid_6">Helping with any of your business needs!</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div data-src="images/page-1_slide02.jpg">
                    <div class="camera_caption fadeIn">
                        <div class="container">
                            <div class="row">
                                <div class="preffix_6 grid_6">The best strategies to attract new business</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div data-src="images/page-1_slide03.jpg">
                    <div class="camera_caption fadeIn">
                        <div class="container">
                            <div class="row">
                                <div class="preffix_6 grid_6">A wide range of global business information</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="well1">
            <div class="container">
                <div class="row">
                    <!-- LEFT MENU -->
                    <c:import url="/pages/common/left_menu.jsp" />
                    <!-- LEFT MENU -->
                    <div class="grid_9">
                        <h2>About</h2><img src="images/page-1_img01.jpg" alt="">
                        <p>Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatu. Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt. Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.</p><a href="#" class="btn">Read more</a>
                    </div>

                </div>
            </div>
        </section>
    </main>
    <!-- FOOTER -->
    <c:import url="/pages/common/footer.jsp" />
    <!-- FOOTER -->
</div>
<script src="js/script.js"></script>
</body>
</html>