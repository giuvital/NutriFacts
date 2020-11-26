/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Models.DAO.UsuarioDAO;
import Models.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Giullia
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
        
        
    }
    
    public void entrarNoSistema(){
        
        //Pegar um Usuario da View
        Usuario usuario = helper.obterModelo();
      
        
        //Pesquisar Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        //Se o usuario da view for compativel com do banco direcionar para menu principal
        if(usuarioAutenticado != null){
            //navegar para menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou senha inválidos");
        }
        //Caso contrário mostrar mensagem: "Usuário ou senha inválido"
    }
    
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do Banco de Dados!");
        
        this.view.exibeMensagem("Executei o Fiz Tarefa");
    }
    
    
}
