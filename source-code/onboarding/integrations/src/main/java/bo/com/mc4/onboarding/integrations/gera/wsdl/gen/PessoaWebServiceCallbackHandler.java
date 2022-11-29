/**
 * PessoaWebServiceCallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;

/**
 *  PessoaWebServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class PessoaWebServiceCallbackHandler {


    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public PessoaWebServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public PessoaWebServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }


    /**
     * auto generated Axis2 call back method for atualizarComprovanteContrato method
     * override this method for handling normal response from atualizarComprovanteContrato operation
     */
    public void receiveResultatualizarComprovanteContrato(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AtualizarComprovanteContratoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from atualizarComprovanteContrato operation
     */
    public void receiveErroratualizarComprovanteContrato(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autenticarUsuarioLoginEmailCfp method
     * override this method for handling normal response from autenticarUsuarioLoginEmailCfp operation
     */
    public void receiveResultautenticarUsuarioLoginEmailCfp(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AutenticarUsuarioLoginEmailCfpResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autenticarUsuarioLoginEmailCfp operation
     */
    public void receiveErrorautenticarUsuarioLoginEmailCfp(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterCadastroPessoa method
     * override this method for handling normal response from obterCadastroPessoa operation
     */
    public void receiveResultobterCadastroPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterCadastroPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterCadastroPessoa operation
     */
    public void receiveErrorobterCadastroPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterRespostasPerguntaCampoVariavel method
     * override this method for handling normal response from obterRespostasPerguntaCampoVariavel operation
     */
    public void receiveResultobterRespostasPerguntaCampoVariavel(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterRespostasPerguntaCampoVariavelResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterRespostasPerguntaCampoVariavel operation
     */
    public void receiveErrorobterRespostasPerguntaCampoVariavel(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for recuperarNovaSenha method
     * override this method for handling normal response from recuperarNovaSenha operation
     */
    public void receiveResultrecuperarNovaSenha(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RecuperarNovaSenhaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from recuperarNovaSenha operation
     */
    public void receiveErrorrecuperarNovaSenha(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for manterControleIndicacaoGeral method
     * override this method for handling normal response from manterControleIndicacaoGeral operation
     */
    public void receiveResultmanterControleIndicacaoGeral(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ManterControleIndicacaoGeralResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from manterControleIndicacaoGeral operation
     */
    public void receiveErrormanterControleIndicacaoGeral(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterServicoSMS method
     * override this method for handling normal response from obterServicoSMS operation
     */
    public void receiveResultobterServicoSMS(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterServicoSMSResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterServicoSMS operation
     */
    public void receiveErrorobterServicoSMS(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterNomePessoa method
     * override this method for handling normal response from obterNomePessoa operation
     */
    public void receiveResultobterNomePessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterNomePessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterNomePessoa operation
     */
    public void receiveErrorobterNomePessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDadosSiteConsultor method
     * override this method for handling normal response from obterDadosSiteConsultor operation
     */
    public void receiveResultobterDadosSiteConsultor(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDadosSiteConsultorResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDadosSiteConsultor operation
     */
    public void receiveErrorobterDadosSiteConsultor(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autenticarUsuarioCompletoEudoraExtranet method
     * override this method for handling normal response from autenticarUsuarioCompletoEudoraExtranet operation
     */
    public void receiveResultautenticarUsuarioCompletoEudoraExtranet(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AutenticarUsuarioCompletoEudoraExtranetResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autenticarUsuarioCompletoEudoraExtranet operation
     */
    public void receiveErrorautenticarUsuarioCompletoEudoraExtranet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for manterControleIndicacao method
     * override this method for handling normal response from manterControleIndicacao operation
     */
    public void receiveResultmanterControleIndicacao(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ManterControleIndicacaoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from manterControleIndicacao operation
     */
    public void receiveErrormanterControleIndicacao(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for validaEmailExiste method
     * override this method for handling normal response from validaEmailExiste operation
     */
    public void receiveResultvalidaEmailExiste(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ValidaEmailExisteResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from validaEmailExiste operation
     */
    public void receiveErrorvalidaEmailExiste(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for enviarEmail method
     * override this method for handling normal response from enviarEmail operation
     */
    public void receiveResultenviarEmail(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.EnviarEmailResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from enviarEmail operation
     */
    public void receiveErrorenviarEmail(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for gerarRetornarNovaSenha method
     * override this method for handling normal response from gerarRetornarNovaSenha operation
     */
    public void receiveResultgerarRetornarNovaSenha(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.GerarRetornarNovaSenhaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from gerarRetornarNovaSenha operation
     */
    public void receiveErrorgerarRetornarNovaSenha(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterCamposExpirados method
     * override this method for handling normal response from obterCamposExpirados operation
     */
    public void receiveResultobterCamposExpirados(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterCamposExpiradosResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterCamposExpirados operation
     */
    public void receiveErrorobterCamposExpirados(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for trocarSenhaLembreteUsuario method
     * override this method for handling normal response from trocarSenhaLembreteUsuario operation
     */
    public void receiveResulttrocarSenhaLembreteUsuario(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.TrocarSenhaLembreteUsuarioResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from trocarSenhaLembreteUsuario operation
     */
    public void receiveErrortrocarSenhaLembreteUsuario(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for validarConsultor method
     * override this method for handling normal response from validarConsultor operation
     */
    public void receiveResultvalidarConsultor(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ValidarConsultorResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from validarConsultor operation
     */
    public void receiveErrorvalidarConsultor(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDetalhesIndicacao method
     * override this method for handling normal response from obterDetalhesIndicacao operation
     */
    public void receiveResultobterDetalhesIndicacao(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDetalhesIndicacaoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDetalhesIndicacao operation
     */
    public void receiveErrorobterDetalhesIndicacao(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterHistoricoCredito method
     * override this method for handling normal response from obterHistoricoCredito operation
     */
    public void receiveResultobterHistoricoCredito(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterHistoricoCreditoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterHistoricoCredito operation
     */
    public void receiveErrorobterHistoricoCredito(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterMensagemMarketing method
     * override this method for handling normal response from obterMensagemMarketing operation
     */
    public void receiveResultobterMensagemMarketing(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterMensagemMarketingResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterMensagemMarketing operation
     */
    public void receiveErrorobterMensagemMarketing(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDadosDetalhadosConsultor method
     * override this method for handling normal response from obterDadosDetalhadosConsultor operation
     */
    public void receiveResultobterDadosDetalhadosConsultor(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDadosDetalhadosConsultorResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDadosDetalhadosConsultor operation
     */
    public void receiveErrorobterDadosDetalhadosConsultor(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterMovimentacaoEstruturaComercial method
     * override this method for handling normal response from obterMovimentacaoEstruturaComercial operation
     */
    public void receiveResultobterMovimentacaoEstruturaComercial(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterMovimentacaoEstruturaComercialResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterMovimentacaoEstruturaComercial operation
     */
    public void receiveErrorobterMovimentacaoEstruturaComercial(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterCodigoEstruturaGeografica method
     * override this method for handling normal response from obterCodigoEstruturaGeografica operation
     */
    public void receiveResultobterCodigoEstruturaGeografica(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterCodigoEstruturaGeograficaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterCodigoEstruturaGeografica operation
     */
    public void receiveErrorobterCodigoEstruturaGeografica(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterCiclosEstruturaComercial method
     * override this method for handling normal response from obterCiclosEstruturaComercial operation
     */
    public void receiveResultobterCiclosEstruturaComercial(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterCiclosEstruturaComercialResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterCiclosEstruturaComercial operation
     */
    public void receiveErrorobterCiclosEstruturaComercial(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDetalhesCredito method
     * override this method for handling normal response from obterDetalhesCredito operation
     */
    public void receiveResultobterDetalhesCredito(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDetalhesCreditoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDetalhesCredito operation
     */
    public void receiveErrorobterDetalhesCredito(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterHistoricoConvite method
     * override this method for handling normal response from obterHistoricoConvite operation
     */
    public void receiveResultobterHistoricoConvite(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterHistoricoConviteResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterHistoricoConvite operation
     */
    public void receiveErrorobterHistoricoConvite(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for prorrogarValidadeChaveAcesso method
     * override this method for handling normal response from prorrogarValidadeChaveAcesso operation
     */
    public void receiveResultprorrogarValidadeChaveAcesso(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ProrrogarValidadeChaveAcessoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from prorrogarValidadeChaveAcesso operation
     */
    public void receiveErrorprorrogarValidadeChaveAcesso(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterExtratoRemuneracaoPessoa method
     * override this method for handling normal response from obterExtratoRemuneracaoPessoa operation
     */
    public void receiveResultobterExtratoRemuneracaoPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterExtratoRemuneracaoPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterExtratoRemuneracaoPessoa operation
     */
    public void receiveErrorobterExtratoRemuneracaoPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterCamposObrigatorios method
     * override this method for handling normal response from obterCamposObrigatorios operation
     */
    public void receiveResultobterCamposObrigatorios(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterCamposObrigatoriosResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterCamposObrigatorios operation
     */
    public void receiveErrorobterCamposObrigatorios(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterLiderBelcorp method
     * override this method for handling normal response from obterLiderBelcorp operation
     */
    public void receiveResultobterLiderBelcorp(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterLiderBelcorpResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterLiderBelcorp operation
     */
    public void receiveErrorobterLiderBelcorp(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterLucratividadePeriodo method
     * override this method for handling normal response from obterLucratividadePeriodo operation
     */
    public void receiveResultobterLucratividadePeriodo(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterLucratividadePeriodoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterLucratividadePeriodo operation
     */
    public void receiveErrorobterLucratividadePeriodo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterRankingMilhagem method
     * override this method for handling normal response from obterRankingMilhagem operation
     */
    public void receiveResultobterRankingMilhagem(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterRankingMilhagemResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterRankingMilhagem operation
     */
    public void receiveErrorobterRankingMilhagem(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterEventosAgendaRevendedora method
     * override this method for handling normal response from obterEventosAgendaRevendedora operation
     */
    public void receiveResultobterEventosAgendaRevendedora(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterEventosAgendaRevendedoraResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterEventosAgendaRevendedora operation
     */
    public void receiveErrorobterEventosAgendaRevendedora(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDadosAniversariantes method
     * override this method for handling normal response from obterDadosAniversariantes operation
     */
    public void receiveResultobterDadosAniversariantes(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDadosAniversariantesResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDadosAniversariantes operation
     */
    public void receiveErrorobterDadosAniversariantes(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterSituacaoComprovantes method
     * override this method for handling normal response from obterSituacaoComprovantes operation
     */
    public void receiveResultobterSituacaoComprovantes(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterSituacaoComprovantesResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterSituacaoComprovantes operation
     */
    public void receiveErrorobterSituacaoComprovantes(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for atualizarDadosConsultora method
     * override this method for handling normal response from atualizarDadosConsultora operation
     */
    public void receiveResultatualizarDadosConsultora(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AtualizarDadosConsultoraResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from atualizarDadosConsultora operation
     */
    public void receiveErroratualizarDadosConsultora(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for buscarCentroDistribuicao method
     * override this method for handling normal response from buscarCentroDistribuicao operation
     */
    public void receiveResultbuscarCentroDistribuicao(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.BuscarCentroDistribuicaoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from buscarCentroDistribuicao operation
     */
    public void receiveErrorbuscarCentroDistribuicao(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for gerarNovaSenhaUsuario method
     * override this method for handling normal response from gerarNovaSenhaUsuario operation
     */
    public void receiveResultgerarNovaSenhaUsuario(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.GerarNovaSenhaUsuarioResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from gerarNovaSenhaUsuario operation
     */
    public void receiveErrorgerarNovaSenhaUsuario(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDadosTreinamento method
     * override this method for handling normal response from obterDadosTreinamento operation
     */
    public void receiveResultobterDadosTreinamento(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDadosTreinamentoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDadosTreinamento operation
     */
    public void receiveErrorobterDadosTreinamento(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for atualizarCamposExpirados method
     * override this method for handling normal response from atualizarCamposExpirados operation
     */
    public void receiveResultatualizarCamposExpirados(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AtualizarCamposExpiradosResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from atualizarCamposExpirados operation
     */
    public void receiveErroratualizarCamposExpirados(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterControleIndicacaoRevendedor method
     * override this method for handling normal response from obterControleIndicacaoRevendedor operation
     */
    public void receiveResultobterControleIndicacaoRevendedor(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterControleIndicacaoRevendedorResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterControleIndicacaoRevendedor operation
     */
    public void receiveErrorobterControleIndicacaoRevendedor(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterControleIndicacaoCliente method
     * override this method for handling normal response from obterControleIndicacaoCliente operation
     */
    public void receiveResultobterControleIndicacaoCliente(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterControleIndicacaoClienteResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterControleIndicacaoCliente operation
     */
    public void receiveErrorobterControleIndicacaoCliente(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autenticarUsuarioCompletoPorEmailESenha method
     * override this method for handling normal response from autenticarUsuarioCompletoPorEmailESenha operation
     */
    public void receiveResultautenticarUsuarioCompletoPorEmailESenha(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AutenticarUsuarioCompletoPorEmailESenhaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autenticarUsuarioCompletoPorEmailESenha operation
     */
    public void receiveErrorautenticarUsuarioCompletoPorEmailESenha(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autenticarUsuario method
     * override this method for handling normal response from autenticarUsuario operation
     */
    public void receiveResultautenticarUsuario(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AutenticarUsuarioResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autenticarUsuario operation
     */
    public void receiveErrorautenticarUsuario(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autenticarUsuarioCompletoPorCPFESenha method
     * override this method for handling normal response from autenticarUsuarioCompletoPorCPFESenha operation
     */
    public void receiveResultautenticarUsuarioCompletoPorCPFESenha(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AutenticarUsuarioCompletoPorCPFESenhaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autenticarUsuarioCompletoPorCPFESenha operation
     */
    public void receiveErrorautenticarUsuarioCompletoPorCPFESenha(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterListagemIndicacoes method
     * override this method for handling normal response from obterListagemIndicacoes operation
     */
    public void receiveResultobterListagemIndicacoes(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterListagemIndicacoesResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterListagemIndicacoes operation
     */
    public void receiveErrorobterListagemIndicacoes(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterCamposVariaveisPessoa method
     * override this method for handling normal response from obterCamposVariaveisPessoa operation
     */
    public void receiveResultobterCamposVariaveisPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterCamposVariaveisPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterCamposVariaveisPessoa operation
     */
    public void receiveErrorobterCamposVariaveisPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterPessoaSituacaoComercial method
     * override this method for handling normal response from obterPessoaSituacaoComercial operation
     */
    public void receiveResultobterPessoaSituacaoComercial(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterPessoaSituacaoComercialResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterPessoaSituacaoComercial operation
     */
    public void receiveErrorobterPessoaSituacaoComercial(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autenticarUsuarioCompletoPorCPFECodigoPessoa method
     * override this method for handling normal response from autenticarUsuarioCompletoPorCPFECodigoPessoa operation
     */
    public void receiveResultautenticarUsuarioCompletoPorCPFECodigoPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AutenticarUsuarioCompletoPorCPFECodigoPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autenticarUsuarioCompletoPorCPFECodigoPessoa operation
     */
    public void receiveErrorautenticarUsuarioCompletoPorCPFECodigoPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterInformacoesPessoa method
     * override this method for handling normal response from obterInformacoesPessoa operation
     */
    public void receiveResultobterInformacoesPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterInformacoesPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterInformacoesPessoa operation
     */
    public void receiveErrorobterInformacoesPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterRevendedoresPorResponsavelEstrutura method
     * override this method for handling normal response from obterRevendedoresPorResponsavelEstrutura operation
     */
    public void receiveResultobterRevendedoresPorResponsavelEstrutura(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterRevendedoresPorResponsavelEstruturaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterRevendedoresPorResponsavelEstrutura operation
     */
    public void receiveErrorobterRevendedoresPorResponsavelEstrutura(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterPerfisPessoa method
     * override this method for handling normal response from obterPerfisPessoa operation
     */
    public void receiveResultobterPerfisPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterPerfisPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterPerfisPessoa operation
     */
    public void receiveErrorobterPerfisPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultarPessoas method
     * override this method for handling normal response from consultarPessoas operation
     */
    public void receiveResultconsultarPessoas(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ConsultarPessoasResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultarPessoas operation
     */
    public void receiveErrorconsultarPessoas(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterInformeRendimentos method
     * override this method for handling normal response from obterInformeRendimentos operation
     */
    public void receiveResultobterInformeRendimentos(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterInformeRendimentosResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterInformeRendimentos operation
     */
    public void receiveErrorobterInformeRendimentos(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterCalendario method
     * override this method for handling normal response from obterCalendario operation
     */
    public void receiveResultobterCalendario(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterCalendarioResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterCalendario operation
     */
    public void receiveErrorobterCalendario(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cadastrarPessoa method
     * override this method for handling normal response from cadastrarPessoa operation
     */
    public void receiveResultcadastrarPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.CadastrarPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cadastrarPessoa operation
     */
    public void receiveErrorcadastrarPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reenviarSenhaUsuario method
     * override this method for handling normal response from reenviarSenhaUsuario operation
     */
    public void receiveResultreenviarSenhaUsuario(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ReenviarSenhaUsuarioResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reenviarSenhaUsuario operation
     */
    public void receiveErrorreenviarSenhaUsuario(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterRedeIndicacao method
     * override this method for handling normal response from obterRedeIndicacao operation
     */
    public void receiveResultobterRedeIndicacao(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterRedeIndicacaoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterRedeIndicacao operation
     */
    public void receiveErrorobterRedeIndicacao(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cadastrarPessoaCamposVariados method
     * override this method for handling normal response from cadastrarPessoaCamposVariados operation
     */
    public void receiveResultcadastrarPessoaCamposVariados(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.CadastrarPessoaCamposVariadosResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cadastrarPessoaCamposVariados operation
     */
    public void receiveErrorcadastrarPessoaCamposVariados(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterQuantidadeConviteDisponivel method
     * override this method for handling normal response from obterQuantidadeConviteDisponivel operation
     */
    public void receiveResultobterQuantidadeConviteDisponivel(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterQuantidadeConviteDisponivelResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterQuantidadeConviteDisponivel operation
     */
    public void receiveErrorobterQuantidadeConviteDisponivel(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for trocarSenhaUsuario method
     * override this method for handling normal response from trocarSenhaUsuario operation
     */
    public void receiveResulttrocarSenhaUsuario(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.TrocarSenhaUsuarioResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from trocarSenhaUsuario operation
     */
    public void receiveErrortrocarSenhaUsuario(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterPessoaCamposVariados method
     * override this method for handling normal response from obterPessoaCamposVariados operation
     */
    public void receiveResultobterPessoaCamposVariados(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterPessoaCamposVariadosResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterPessoaCamposVariados operation
     */
    public void receiveErrorobterPessoaCamposVariados(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for gravaDocumentoPessoa method
     * override this method for handling normal response from gravaDocumentoPessoa operation
     */
    public void receiveResultgravaDocumentoPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.GravaDocumentoPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from gravaDocumentoPessoa operation
     */
    public void receiveErrorgravaDocumentoPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for recuperarLembreteSenha method
     * override this method for handling normal response from recuperarLembreteSenha operation
     */
    public void receiveResultrecuperarLembreteSenha(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RecuperarLembreteSenhaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from recuperarLembreteSenha operation
     */
    public void receiveErrorrecuperarLembreteSenha(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDadosConsultorSiteCN method
     * override this method for handling normal response from obterDadosConsultorSiteCN operation
     */
    public void receiveResultobterDadosConsultorSiteCN(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDadosConsultorSiteCNResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDadosConsultorSiteCN operation
     */
    public void receiveErrorobterDadosConsultorSiteCN(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterSituacaoRanking method
     * override this method for handling normal response from obterSituacaoRanking operation
     */
    public void receiveResultobterSituacaoRanking(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterSituacaoRankingResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterSituacaoRanking operation
     */
    public void receiveErrorobterSituacaoRanking(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for recuperarSenhaPerguntaSecreta method
     * override this method for handling normal response from recuperarSenhaPerguntaSecreta operation
     */
    public void receiveResultrecuperarSenhaPerguntaSecreta(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RecuperarSenhaPerguntaSecretaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from recuperarSenhaPerguntaSecreta operation
     */
    public void receiveErrorrecuperarSenhaPerguntaSecreta(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for criarVinculoMultinivel method
     * override this method for handling normal response from criarVinculoMultinivel operation
     */
    public void receiveResultcriarVinculoMultinivel(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.CriarVinculoMultinivelResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from criarVinculoMultinivel operation
     */
    public void receiveErrorcriarVinculoMultinivel(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reativarRevendedor method
     * override this method for handling normal response from reativarRevendedor operation
     */
    public void receiveResultreativarRevendedor(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ReativarRevendedorResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reativarRevendedor operation
     */
    public void receiveErrorreativarRevendedor(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterEmailEnviado method
     * override this method for handling normal response from obterEmailEnviado operation
     */
    public void receiveResultobterEmailEnviado(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterEmailEnviadoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterEmailEnviado operation
     */
    public void receiveErrorobterEmailEnviado(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterInformacoesAdicionaisPessoa method
     * override this method for handling normal response from obterInformacoesAdicionaisPessoa operation
     */
    public void receiveResultobterInformacoesAdicionaisPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterInformacoesAdicionaisPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterInformacoesAdicionaisPessoa operation
     */
    public void receiveErrorobterInformacoesAdicionaisPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autenticarUsuarioCompletoPorCPF method
     * override this method for handling normal response from autenticarUsuarioCompletoPorCPF operation
     */
    public void receiveResultautenticarUsuarioCompletoPorCPF(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AutenticarUsuarioCompletoPorCPFResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autenticarUsuarioCompletoPorCPF operation
     */
    public void receiveErrorautenticarUsuarioCompletoPorCPF(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterRanking method
     * override this method for handling normal response from obterRanking operation
     */
    public void receiveResultobterRanking(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterRankingResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterRanking operation
     */
    public void receiveErrorobterRanking(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autenticarUsuarioCompleto method
     * override this method for handling normal response from autenticarUsuarioCompleto operation
     */
    public void receiveResultautenticarUsuarioCompleto(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AutenticarUsuarioCompletoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autenticarUsuarioCompleto operation
     */
    public void receiveErrorautenticarUsuarioCompleto(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDadosConsultor method
     * override this method for handling normal response from obterDadosConsultor operation
     */
    public void receiveResultobterDadosConsultor(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDadosConsultorResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDadosConsultor operation
     */
    public void receiveErrorobterDadosConsultor(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for buscarConsultorPorCep method
     * override this method for handling normal response from buscarConsultorPorCep operation
     */
    public void receiveResultbuscarConsultorPorCep(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.BuscarConsultorPorCepResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from buscarConsultorPorCep operation
     */
    public void receiveErrorbuscarConsultorPorCep(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for alterarSenhaPerguntaSecreta method
     * override this method for handling normal response from alterarSenhaPerguntaSecreta operation
     */
    public void receiveResultalterarSenhaPerguntaSecreta(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AlterarSenhaPerguntaSecretaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from alterarSenhaPerguntaSecreta operation
     */
    public void receiveErroralterarSenhaPerguntaSecreta(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterInformacoesCep method
     * override this method for handling normal response from obterInformacoesCep operation
     */
    public void receiveResultobterInformacoesCep(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterInformacoesCepResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterInformacoesCep operation
     */
    public void receiveErrorobterInformacoesCep(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterEstruturaComercialPessoa method
     * override this method for handling normal response from obterEstruturaComercialPessoa operation
     */
    public void receiveResultobterEstruturaComercialPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterEstruturaComercialPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterEstruturaComercialPessoa operation
     */
    public void receiveErrorobterEstruturaComercialPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterPapeis method
     * override this method for handling normal response from obterPapeis operation
     */
    public void receiveResultobterPapeis(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterPapeisResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterPapeis operation
     */
    public void receiveErrorobterPapeis(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDadosMovimentacoesFinanceiras method
     * override this method for handling normal response from obterDadosMovimentacoesFinanceiras operation
     */
    public void receiveResultobterDadosMovimentacoesFinanceiras(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDadosMovimentacoesFinanceirasResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDadosMovimentacoesFinanceiras operation
     */
    public void receiveErrorobterDadosMovimentacoesFinanceiras(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDadosGerenteDeVenda method
     * override this method for handling normal response from obterDadosGerenteDeVenda operation
     */
    public void receiveResultobterDadosGerenteDeVenda(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDadosGerenteDeVendaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDadosGerenteDeVenda operation
     */
    public void receiveErrorobterDadosGerenteDeVenda(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for atualizarServicoSMS method
     * override this method for handling normal response from atualizarServicoSMS operation
     */
    public void receiveResultatualizarServicoSMS(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AtualizarServicoSMSResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from atualizarServicoSMS operation
     */
    public void receiveErroratualizarServicoSMS(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDadosPessoaIndicante method
     * override this method for handling normal response from obterDadosPessoaIndicante operation
     */
    public void receiveResultobterDadosPessoaIndicante(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDadosPessoaIndicanteResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDadosPessoaIndicante operation
     */
    public void receiveErrorobterDadosPessoaIndicante(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for manterControleIndicacao2 method
     * override this method for handling normal response from manterControleIndicacao2 operation
     */
    public void receiveResultmanterControleIndicacao2(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ManterControleIndicacao2Response result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from manterControleIndicacao2 operation
     */
    public void receiveErrormanterControleIndicacao2(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterResumoIndicacoes method
     * override this method for handling normal response from obterResumoIndicacoes operation
     */
    public void receiveResultobterResumoIndicacoes(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterResumoIndicacoesResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterResumoIndicacoes operation
     */
    public void receiveErrorobterResumoIndicacoes(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for atualizarComprovante method
     * override this method for handling normal response from atualizarComprovante operation
     */
    public void receiveResultatualizarComprovante(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AtualizarComprovanteResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from atualizarComprovante operation
     */
    public void receiveErroratualizarComprovante(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterDominiosCadastro method
     * override this method for handling normal response from obterDominiosCadastro operation
     */
    public void receiveResultobterDominiosCadastro(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterDominiosCadastroResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterDominiosCadastro operation
     */
    public void receiveErrorobterDominiosCadastro(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for atualizarEmailIndicante method
     * override this method for handling normal response from atualizarEmailIndicante operation
     */
    public void receiveResultatualizarEmailIndicante(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AtualizarEmailIndicanteResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from atualizarEmailIndicante operation
     */
    public void receiveErroratualizarEmailIndicante(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registrarAcessoExterno method
     * override this method for handling normal response from registrarAcessoExterno operation
     */
    public void receiveResultregistrarAcessoExterno(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RegistrarAcessoExternoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registrarAcessoExterno operation
     */
    public void receiveErrorregistrarAcessoExterno(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterSetoresIndicacao method
     * override this method for handling normal response from obterSetoresIndicacao operation
     */
    public void receiveResultobterSetoresIndicacao(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterSetoresIndicacaoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterSetoresIndicacao operation
     */
    public void receiveErrorobterSetoresIndicacao(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autenticarUsuarioCompletoPorCodigoPessoa method
     * override this method for handling normal response from autenticarUsuarioCompletoPorCodigoPessoa operation
     */
    public void receiveResultautenticarUsuarioCompletoPorCodigoPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.AutenticarUsuarioCompletoPorCodigoPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autenticarUsuarioCompletoPorCodigoPessoa operation
     */
    public void receiveErrorautenticarUsuarioCompletoPorCodigoPessoa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterSituacaoComprovanteContrato method
     * override this method for handling normal response from obterSituacaoComprovanteContrato operation
     */
    public void receiveResultobterSituacaoComprovanteContrato(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterSituacaoComprovanteContratoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterSituacaoComprovanteContrato operation
     */
    public void receiveErrorobterSituacaoComprovanteContrato(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for buscarConsultorPorEstruturaGeografica method
     * override this method for handling normal response from buscarConsultorPorEstruturaGeografica operation
     */
    public void receiveResultbuscarConsultorPorEstruturaGeografica(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.BuscarConsultorPorEstruturaGeograficaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from buscarConsultorPorEstruturaGeografica operation
     */
    public void receiveErrorbuscarConsultorPorEstruturaGeografica(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterResumoCampanha method
     * override this method for handling normal response from obterResumoCampanha operation
     */
    public void receiveResultobterResumoCampanha(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterResumoCampanhaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterResumoCampanha operation
     */
    public void receiveErrorobterResumoCampanha(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for obterFuncoesPessoa method
     * override this method for handling normal response from obterFuncoesPessoa operation
     */
    public void receiveResultobterFuncoesPessoa(
            bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ObterFuncoesPessoaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from obterFuncoesPessoa operation
     */
    public void receiveErrorobterFuncoesPessoa(java.lang.Exception e) {
    }


}
