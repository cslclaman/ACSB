package br.acsb.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 0030481611009
 */
public class Cargo {
    private int cbo;
    private String nome;
    private String descricao;
    private Date dataVigencia;
    private String formacaoRequerida;
    private BigDecimal pisoSalarial;
    private BigDecimal tetoSalarial;
    private Setor setor;
    
    private List<Competencia> competencias;
    private List<Formulario> formularios;
    private List<Bonificacao> bonificacoes;
    private List<Beneficio> beneficios;
}
