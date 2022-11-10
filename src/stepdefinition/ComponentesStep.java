package stepdefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuario acessou o arquivo Campo de Treinamento")
    public void que_o_usuario_acessou_o_arquivo_Campo_de_Treinamento() {
        componentes.inicializar();
    }

    @Quando("o usuario digitar Batatinha")
    public void o_usuario_digitar_Batatinha() {
        componentes.testarTextField();
    }

    @Quando("o usuario digitar um texto grande no campo textArea")
    public void o_usuario_digitar_um_texto_grande_no_campo_textArea() {
        componentes.testarTextArea();
    }

    @Então("o resultado no campo textField deve ser Batatinha")
    public void o_resultado_no_campo_textField_deve_ser_Batatinha() {
        componentes.validarTextField();
    }

    @Então("o resultado no campo textArea deve ser um texto grande no campo textArea")
    public void o_resultado_no_campo_textArea_deve_ser_um_texto_grande_no_campo_textArea() {
        componentes.validarTextArea();
    }
}
