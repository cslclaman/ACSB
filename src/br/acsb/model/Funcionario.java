package br.acsb.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author 0030481611009
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private Date dataNascimento;
    private String rg;
    private String cpf;
    private Cargo cargo;
    
    private List<HorarioFuncionario> horariosFuncionario; 
    private List<RegistroPontoFuncionario> registrosPontoFuncionario;
    private List<HistoricoSalario> historicosSalario;
    private List<Avaliacao> avaliacoesAvaliado;
    private List<Avaliacao> avaliacoesAvaliador;
    private List<Bonificacao> bonificacoes;
    private List<Beneficio> beneficios;
}
