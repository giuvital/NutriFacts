/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.ServicoHelper;
import Models.DAO.ServicoDAO;
import View.Servico;
import java.util.ArrayList;

/**
 *
 * @author Giullia
 */
public class ServicoController {
    
    private final Servico view;
    private final ServicoHelper helper;
    
    public ServicoController(Servico view) {
        this.view = view;
        this.helper = new ServicoHelper(view);
    }
    
    
    public void atualizaServico(){
        //Buscar Servico do BD
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Models.Servico> servicos = servicoDAO.selectAll();
        //Exibir Servico no ComboBOX
        helper.preencherServicos(servicos);
    }
    
}
