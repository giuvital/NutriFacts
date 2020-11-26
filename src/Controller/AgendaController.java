/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Models.Agendamento;
import Models.Cliente;
import Models.DAO.AgendamentoDAO;
import Models.DAO.ClienteDAO;
import Models.DAO.ServicoDAO;
import Models.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Giullia
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;
    
    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        //Buscar lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        //Exibir lista na view
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaCliente(){
        //Buscar Paciente do BD 
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        //Exibir Paciente no Combox 
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico(){
        //Buscar Servico do BD
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        //Exibir Servico no ComboBOX
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
        //Buscar Valor do BD
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        //Buscar objeto agendamento da tela
        Agendamento agendamento = helper.obterModelo();
        //Salvar no BD
        new AgendamentoDAO().insert(agendamento);
        //Inserir na tabela
        atualizaTabela();
        helper.limparTela();
    }
   
}
