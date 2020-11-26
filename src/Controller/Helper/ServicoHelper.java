/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import View.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Giullia
 */
public class ServicoHelper implements IHelper{
    
    private final Servico view;
    
    public ServicoHelper(Servico view) {
        this.view = view;
    }
    
    public void preencherServicos (ArrayList<Models.Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBox1().getModel();
        
        for (Models.Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
