package servlets;

import classes.Game;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gameName = request.getParameter("GameName");
        String genre = request.getParameter("Genre");
        int age = Integer.parseInt(request.getParameter("Age"));
        Game game = chooseGame(gameName,genre,age);
        request.setAttribute("game", game);
        request.setAttribute("IDE", "Dark_Souls");
        request.getRequestDispatcher("/servlets.Forward2").forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public Game chooseGame(String gameName, String genre, int age){
        Game game = new Game();
        game.setUserId(254);
        game.setGameGanre(genre);
        game.setGameAgeCategory(age);
        game.setGameName(gameName);
        if(game.getGameId() == null){
            game.setGameId("2284853");
        }
        return game;
    }
}
