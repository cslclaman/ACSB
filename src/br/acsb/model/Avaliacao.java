package br.acsb.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author 0030481611009
 */
public class Avaliacao {
    private Funcionario funcionarioAvaliado;
    private Funcionario funcionarioAvaliador;
    private Date dataAgendada;
    private Date dataRealizada;
    private Formulario formulario;
    private List<QuestaoRespondida> questoesRespondidas;
    private List<NotasCompetencia> notasCompetencias;
}
