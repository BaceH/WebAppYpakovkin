<%@ page language="java" contentType="text/html; charset=UTF-8" session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!--
    ========================================================
                                HEADER
    ========================================================
    -->
    <header>
        <div class="container">
            <div class="brand">
                <h1 class="brand_name"><a href="./">YPAKOVKIN</a></h1>
                <p class="brand_slogan">.COM</p>
            </div><a href="callto:#" class="fa-phone">+38(063) 388-13-03</a>
            <p>Подарочная упаковка оптом. Доставка по Украине и СНГ.</p>
        </div>
        <div id="stuck_container" class="stuck_container">
            <div class="container">
                <nav class="nav">
                    <ul data-type="navbar" class="sf-menu">
                        <c:forEach items="${menuItemList}" var="menu">
                            <c:if test="${menu.activ}"><c:set var="activ">class="active"</c:set></c:if>
                            <c:if test="${!menu.activ}"><c:set var="activ"> </c:set></c:if>

                            <li ${activ}><a href="${pageContext.servletContext.contextPath}${menu.link}" title="${menu.description}">${menu.name}</a></li>

                        </c:forEach>
                        <!--li class="active"><a href="/">Главная</a></li-->
                    </ul>
                </nav>
            </div>
        </div>

    </header>


