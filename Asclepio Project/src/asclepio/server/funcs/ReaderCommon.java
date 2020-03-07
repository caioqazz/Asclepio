/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asclepio.server.funcs;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

/**
 *
 * @author Caio
 */
public class ReaderCommon {

    File arquivo;
    FileReader fr;
    BufferedReader br;
    String linha;
    String caminho_base;

    public ReaderCommon() {
        linha = "";
        caminho_base = "C:\\Asclepio\\UsersCommon\\";
    }

    public String leituraAlergias(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "Alergias.txt");
        if (arquivo.length() == 0) {

            return "";
        }
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);

        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine() + "#";

//faz algo com a linha
        }
        br.close();
        fr.close();

        return linha;
    }

    public String leituraContatos(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "Contatos.txt");
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine() + "#";

//faz algo com a linha
        }
        br.close();
        fr.close();
        return linha;
    }

    public String leituraConvenio(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "Convenio.txt");
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine();

//faz algo com a linha
        }
        br.close();
        fr.close();
        return linha;
    }

    public String leituraDadosFixos(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "Dados Fixos.txt");
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine() + "#";

//faz algo com a linha
        }
        br.close();
        fr.close();
        return linha;
    }

    public String leituraDoenças(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "Doenças.txt");
        if (arquivo.length() == 0) {
            return "";
        }
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine() + "#";

//faz algo com a linha
        }
        br.close();
        fr.close();
        return linha;
    }

    public String leituraEndereço(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "Endereço.txt");
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine() + "#";

//faz algo com a linha
        }
        br.close();
        fr.close();
        return linha;
    }

    public String leituraHistoricoConsultas(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "Historico de Consulta.txt");
        if (arquivo.length() == 0) {
            return "";
        }
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine() + "#";

//faz algo com a linha
        }
        br.close();
        fr.close();
        return linha;
    }

    public String leituraHistoricoDrogas(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "Historico de Drogas.txt");
        if (arquivo.length() == 0) {
            return "";
        }
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine() + "#";

//faz algo com a linha
        }
        br.close();
        fr.close();
        return linha;
    }

    public String leituraMedicamentos(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "Medicamentos.txt");
        if (arquivo.length() == 0) {
            return "";
        }
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine() + "#";

//faz algo com a linha
        }
        br.close();
        fr.close();
        return linha;
    }

    public String leituraPessoaContato(String CPF) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + CPF + "/" + "PessoaContato.txt");

        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine() + "#";

//faz algo com a linha
        }
        br.close();
        fr.close();
        return linha;
    }

    public boolean cpfExist(String CPF) {
        arquivo = new File(caminho_base + CPF);
        if (!arquivo.exists()) {
            return false;
        } else {
            return true;
        }
    }

}
