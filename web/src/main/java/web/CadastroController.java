package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")

public class CadastroController extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Recupera os dados do formulário
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String email = request.getParameter("email");
        String dataNascimento = request.getParameter("dataNascimento");
        String curso = request.getParameter("curso");
        String instituicao = request.getParameter("instituicao");
        String anoConclusao = request.getParameter("anoConclusao");
        String empresa = request.getParameter("empresa");
        String cargo = request.getParameter("cargo");
        String anoInicio = request.getParameter("anoInicio");
        String anoFim = request.getParameter("anoFim");

        // Cria os cookies com os dados do formulário
        Cookie nomeCookie = new Cookie("nome", nome);
        Cookie sobrenomeCookie = new Cookie("sobrenome", sobrenome);
        Cookie emailCookie = new Cookie("email", email);
        Cookie dataNascimentoCookie = new Cookie("dataNascimento", dataNascimento);
        Cookie cursoCookie = new Cookie("curso", curso);
        Cookie instituicaoCookie = new Cookie("instituicao", instituicao);
        Cookie anoConclusaoCookie = new Cookie("anoConclusao", anoConclusao);
        Cookie empresaCookie = new Cookie("empresa", empresa);
        Cookie cargoCookie = new Cookie("cargo", cargo);
        Cookie anoInicioCookie = new Cookie("anoInicio", anoInicio);
        Cookie anoFimCookie = new Cookie("anoFim", anoFim);

        // Define o tempo de vida dos cookies para 24 horas
        nomeCookie.setMaxAge(24 * 60 * 60);
        sobrenomeCookie.setMaxAge(24 * 60 * 60);
        emailCookie.setMaxAge(24 * 60 * 60);
        dataNascimentoCookie.setMaxAge(24 * 60 * 60);
        cursoCookie.setMaxAge(24 * 60 * 60);
        instituicaoCookie.setMaxAge(24 * 60 * 60);
        anoConclusaoCookie.setMaxAge(24 * 60 * 60);
        empresaCookie.setMaxAge(24 * 60 * 60);
        cargoCookie.setMaxAge(24 * 60 * 60);
        anoInicioCookie.setMaxAge(24 * 60 * 60);
        anoFimCookie.setMaxAge(24 * 60 * 60);

        // Adiciona os cookies na resposta
        response.addCookie(nomeCookie);
        response.addCookie(sobrenomeCookie);
        response.addCookie(emailCookie);
        response.addCookie(dataNascimentoCookie);
        response.addCookie(cursoCookie);
        response.addCookie(instituicaoCookie);
        response.addCookie(anoConclusaoCookie);
        response.addCookie(empresaCookie);
        response.addCookie(cargoCookie);
        response.addCookie(anoInicioCookie);
        response.addCookie(anoFimCookie);

        // Redireciona para a página de exibição dos dados
        response.sendRedirect(request.getContextPath() + "/exibirCookies");
    }
}
