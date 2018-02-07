<%@ page language="java" contentType="text/html; charset=UTF-8" session="true" %>
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
                        <section class="well1">
                            <h2>${itemMenu.name}</h2>

                            ${itemMenu.text}
                            
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