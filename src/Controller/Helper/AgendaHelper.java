/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import View.Agenda;
import View.Relatorio;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giullia
 */
public class AgendaHelper implements IHelper{
    
    private final Agenda view;
    private String Valor;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }
    
    

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
       DefaultTableModel tableModel = (DefaultTableModel) view.getjTableAgendamentos().getModel();
       tableModel.setNumRows(0);
       
       
        //percorrer a lista preenchendo o table model
        agendamentos.forEach((agendamento) -> {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        });
    }
    
    

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxPaciente().getModel();
        
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
            
            
            
        }
        
    }
        
    public void preencherServicos (ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }
    
    public Cliente obterCliente() {
       return (Cliente) view.getjComboBoxPaciente().getSelectedItem();
    }
    
    public Servico obterServico() {
       return (Servico) view.getjComboBoxServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getjTextFieldValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getjTextFieldId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getjTextFieldValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getjTextFieldData().getText();
        String hora = view.getjTextFieldHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextArea1().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
        //new Agendamento();
    }

    @Override
    public void limparTela() {
        view.getjTextFieldData().setText("");
        view.getjTextFieldHora().setText("");
        view.getjTextArea1().setText("");
    }
    
    
}

