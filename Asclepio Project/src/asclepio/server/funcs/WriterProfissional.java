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
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class WriterProfissional {

    File arquivo;
    FileWriter fw;
    BufferedWriter bw;
    String caminho_base;

    public WriterProfissional() {
        caminho_base = "C:\\Asclepio\\UsersProfissional\\";
    }

    public boolean escreve_EspecialUsers(String nome, String cpf, String sexo, String profissao, String hospital, String senha) throws IOException {
        String id = recuperaID();
        escreveDados(id, nome, cpf, sexo, profissao, hospital);
        escreveSenha(id, senha);

        return true;
    }

    public void escreveDados(String id, String nome, String cpf, String sexo, String profissao, String hospital) throws IOException {
        arquivo = new File(id + "/Dados.txt");
        arquivo.createNewFile();
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);
        bw.write(nome);
        bw.newLine();
        bw.write(cpf);
        bw.newLine();
        bw.write(sexo);
        bw.newLine();
        bw.write(profissao);
        bw.newLine();
        bw.write(hospital);
        bw.newLine();
        bw.close();
        fw.close();
        JOptionPane.showMessageDialog(null, "Usuario Cadastrado com sucesso"
        );

    }

    public void escreveSenha(String id, String senha) throws IOException {
        arquivo = new File(id + "/Senha.txt");
        arquivo.createNewFile();
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);
        bw.write(senha);

        bw.close();
        fw.close();

    }

    public String recuperaID() {
        int i = 1;
        arquivo = new File(caminho_base + i);
        while (arquivo.exists()) {
            i++;
            arquivo = new File(caminho_base + i);
        }
        arquivo.mkdir();
        JOptionPane.showMessageDialog(null, "Seu ID é " + i);
        return caminho_base + i;
    }

}
