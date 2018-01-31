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

        <section class="well1">
            <div class="container">
                <div class="row">
                    <!-- LEFT MENU -->
                    <c:import url="/pages/common/left_menu.jsp" />
                    <!-- LEFT MENU -->
                    <div class="grid_9">



                        <section class="well1 ins2 mobile-center">

                            <h2>Новости</h2>
                            <div class="row off2">
                                <div class="grid_4">
                                    <img src="images/page-3_img01.jpg" alt="">
                                </div>
                                <div class="grid_5">
                                    <h3>Ut pharetra augue nec viverra</h3>
                                    <p>Donec justo urna, malesuada a viverra ac, pellentesque vitae nunc. Aenean ac leo eget nunc fringilla a non nulla! Nunc orci mi, venenatis quis ultrices vitae, congue non nibh. Nulla bibendum, justo eget ultrices vestibulum.</p><a href="#" class="btn">Read more</a>
                                </div>

                            </div>
                            <hr>
                            <div class="row">
                                <div class="grid_5">
                                    <h3>Proin dictum elementum velit</h3>
                                    <p>Nunc orci mi, venenatis quis ultrices vitae, congue non nibh. Nulla bibendum, justo eget ultrices vestibulum erat tortor venenatis risus, sit amet cursus dui augue a arcu. Quisque mauris risus, gravida a molestie eu.</p><a href="#" class="btn">Read more</a>
                                </div>
                                <div class="grid_4">
                                    <img src="images/page-3_img05.jpg" alt="">
                                </div>
                            </div>

                        </section>

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