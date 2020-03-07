/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asclepio.server.funcs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * @author Caio
 */
public class WriterCommon {

    File arquivo;
    FileWriter fw;
    BufferedWriter bw;
    String caminho_base;

    public WriterCommon() {
        caminho_base = "C:\\Asclepio\\UsersCommon\\";
    }

    public boolean escreve_CommonUsers(String nome, String CPF, String RG, String sexo,
            String data, String t_Sanguineo, String convenio, String tel, String cel,
            String email, String p_Nome, String p_Parentesco, String p_Tel, String p_Cel,
            String p_Email, String endereço, String CEP,
            ArrayList<String> alergias, ArrayList<String> doenças, ArrayList<String> medicamentos) throws IOException {
        arquivo = new File(caminho_base + CPF);

        if (!arquivo.exists()) {
            cria_Usuario(CPF);
        } else {
            return false;
        }
        escrevePessoaContato(CPF, p_Nome, p_Parentesco, p_Tel, p_Cel, p_Email, false);
        escreveContatos(CPF, tel, cel, email, false);
        escreveConvenio(CPF, convenio, false);
        escreveDadosFixos(CPF, nome, RG, sexo, data, t_Sanguineo, false);
        escreveEndereço(CPF, endereço, CEP, false);
        escreveAlergias(CPF, alergias, false);
        escreveDoenças(CPF, doenças, false);
        escreveMedicamentos(CPF, medicamentos, false);

        return true;
    }

    public void escrevePessoaContato(String CPF, String p_Nome, String p_Parentesco, String p_Tel, String p_Cel,
            String p_Email, boolean operation) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "PessoaContato.txt");
        if (operation) {
            limpaArquivo(arquivo);
        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);
        bw.write(p_Nome);
        bw.newLine();
        bw.write(p_Parentesco);
        bw.newLine();
        bw.write(p_Tel);
        bw.newLine();
        bw.write(p_Cel);
        bw.newLine();
        bw.write(p_Email);

        bw.close();
        fw.close();
    }

    public void escreveSenha(String CPF, String senha, boolean operation) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Senha.txt");
        if (operation) {
            limpaArquivo(arquivo);
        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);

        bw.write(senha);

        bw.close();
        fw.close();
    }

    public void escreveContatos(String CPF, String tel, String cel, String email, boolean operation) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Contatos.txt");

        if (operation) {
            limpaArquivo(arquivo);
        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);

        bw.write(tel);
        bw.newLine();
        bw.write(cel);
        bw.newLine();
        bw.write(email);

        bw.close();
        fw.close();
    }

    public void escreveConvenio(String CPF, String convenio, boolean operation) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Convenio.txt");
        if (operation) {
            limpaArquivo(arquivo);
        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);

        bw.write(convenio);

        bw.close();
        fw.close();
    }

    public void escreveEndereço(String CPF, String endereço, String CEP, boolean operation) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Endereço.txt");
        if (operation) {
            limpaArquivo(arquivo);

        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);

        bw.write(endereço);
        bw.newLine();
        bw.write(CEP);
        bw.newLine();

        bw.close();
        fw.close();
    }

    public void escreveAlergias(String CPF, ArrayList<String> alergias, boolean operation) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Alergias.txt");
        if (operation) {
            limpaArquivo(arquivo);

        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);

        for (int i = 0; i < alergias.size(); i++) {

            bw.write(alergias.get(i));
            bw.newLine();

        }

        bw.close();
        fw.close();
    }

    public void escreveDoenças(String CPF, ArrayList<String> doenças, boolean operation) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Doenças.txt");
        if (operation) {
            limpaArquivo(arquivo);
        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);

        for (int i = 0; i < doenças.size(); i++) {

            bw.write(doenças.get(i));

            bw.newLine();

        }

        bw.close();
        fw.close();
    }

    public void escreveMedicamentos(String CPF, ArrayList<String> medicamentos, boolean operation) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Medicamentos.txt");
        if (operation) {
            limpaArquivo(arquivo);
        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);

        for (int i = 0; i < medicamentos.size(); i++) {

            bw.write(medicamentos.get(i));

            bw.newLine();

        }

        bw.close();
        fw.close();
    }

    public void escreveDadosFixos(String CPF, String nome, String RG, String sexo, String data, String t_Sanguineo, boolean operation) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Dados Fixos.txt");
        if (operation) {
            limpaArquivo(arquivo);
        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);

        bw.write(nome);
        bw.newLine();
        bw.write(CPF);
        bw.newLine();
        bw.write(RG);
        bw.newLine();
        bw.write(sexo);
        bw.newLine();
        bw.write(data);
        bw.newLine();
        bw.write(t_Sanguineo);
        bw.newLine();

        bw.close();
        fw.close();
    }

    public void escreveHistoricoDrogas(String CPF, ArrayList<String> historico) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Historico de Drogas.txt");

        limpaArquivo(arquivo);

        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);
        for (int i = 0; i < historico.size(); i++) {

            bw.write(historico.get(i));

            bw.newLine();

        }

        bw.close();
        fw.close();

    }

    public void escreveHistoricoConsultas(String CPF, ArrayList<String> historico) throws IOException {
        arquivo = new File(caminho_base + CPF + "/" + "Historico de Consulta.txt");

        limpaArquivo(arquivo);

        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);
        for (int i = 0; i < historico.size(); i++) {

            bw.write(historico.get(i));

            bw.newLine();

        }

        bw.close();
        fw.close();

    }

    public void cria_Usuario(String CPF) throws IOException {

        File diretorio = new File(caminho_base + CPF);
        diretorio.mkdir();

        arquivo = new File(caminho_base + CPF + "/" + "Alergias.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "Convenio.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "Dados Fixos.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "Doenças.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "Historico de Consulta.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "Historico de Drogas.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "Medicamentos.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "Contatos.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "PessoaContato.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "Endereço.txt");
        arquivo.createNewFile();
        arquivo = new File(caminho_base + CPF + "/" + "Senha.txt");
        arquivo.createNewFile();

    }

    public void limpaArquivo(File arquivo) throws IOException {
        Writer out = new FileWriter(arquivo);
        out.write("");
        out.flush();
        out.close();
    }

}
