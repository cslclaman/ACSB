package br.acsb.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 0030481611009
 */
public class Bonificacao {
    private String nome;
    private String descricao;
    private int tipoValor;
    private BigDecimal valor;
    private String tipoCriterioAplicacao;
    private Date dataAplicacao;
    private String criterioAplicacao;
    private String condicaoAplicacao;
    private int valorCondicaoAplicacao;
    
    private List<Cargo> cargos;
    private List<Funcionario> funcionarios;
    
}
