/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import Models.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Giullia
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "Gisele", 'F', "09/05/1996", "30212121", "nutri@nutrifacts.com", "521454123", "nutricionista", "administrador");
        Usuario usuario2 = new Usuario(2, "Marcos", 'M', "25/01/2000", "30212122", "estagiario@nutrifacts.com", "451244123", "estagiario", "funcionario");
         
        Cliente cliente1 = new Cliente(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Cliente cliente3 = new Cliente(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(4, "Neymar Santos", 'M', "20/08/1995", "30212130", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Cliente cliente5 = new Cliente(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Cliente cliente6 = new Cliente(6, "Matuidi Pareira", 'M', "17/08/1994", "302122324", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Cliente cliente7 = new Cliente(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Cliente cliente8 = new Cliente(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        Cliente cliente9 = new Cliente(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Cliente cliente10 = new Cliente(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
        Servico servico1 = new Servico(1, "Diabetes", 180);
        Servico servico2 = new Servico(2, "Emagrecimento", 300);
        Servico servico3 = new Servico(3, "Saúde Geral", 150);
        Servico servico4 = new Servico(4, "Ganho de Massa Muscular", 250);
        

        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 300, "30/11/2020 09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 250, "30/11/2020 10:00");
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 180, "30/11/2020 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
       
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
