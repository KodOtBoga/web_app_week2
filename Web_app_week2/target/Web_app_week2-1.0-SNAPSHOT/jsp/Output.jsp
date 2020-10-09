<%@ page import="classes.GameList" %>
<%@ page import="classes.Game" %>
<%@ page import="classes.User" %>
<%@ page import="servlets.Servlet" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
    <%!User user; %>
<%  user = (User) request.getAttribute("user");
    Game game = (Game) request.getAttribute("game");
%>
<h3>So, about your game:</h3>
<h4>Game name: <%=game.getGameName()%></h4>
<h4>Game Genre: <%=game.getGameGanre()%></h4>
<h4>This game for people aged: <%=game.getGameAgeCategory()%></h4>
<h3>This game is registred by the id: <%= game.getUserId()%></h3>
<%@include file="footer.jsp"%>