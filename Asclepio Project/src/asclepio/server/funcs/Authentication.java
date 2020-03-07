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
public class Authentication {

    File arquivo;
    FileReader fr;
    BufferedReader br;
    String linha;
    String caminho_base_common;
    String caminho_base_profissional;

    public Authentication() {
        caminho_base_profissional = "C:\\Asclepio\\UsersProfissional\\";
        caminho_base_common = "C:\\Asclepio\\UsersCommon\\";
    }

    public boolean auteticaçãoCommon(String CPF, String password) throws FileNotFoundException, IOException {
        arquivo = new File(caminho_base_common + CPF + "/" + "Senha.txt");
        if (!arquivo.exists()) {
            return false;
        }
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        linha = "";

        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine();

//faz algo com a linha
        }
        br.close();
        fr.close();

        if(password.equals(linha)) {

            return true;
        }
        return false;
    }

    public boolean auteticaçãoEspecial(String ID, String password) throws FileNotFoundException, IOException {
        arquivo = new File(caminho_base_profissional + ID + "/" + "Senha.txt");
        if (!arquivo.exists()) {
            return false;
        }
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        linha = "";

        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine();

//faz algo com a linha
        }
        br.close();
        fr.close();

        if (password.equals(linha)) {

            return true;
        }
        return false;
    }

    public boolean auteticaçãoServer(String ID, String password) throws FileNotFoundException, IOException {
        arquivo = new File("C:\\Asclepio/" + ID + ".txt");
        if (!arquivo.exists()) {
            return false;
        }
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        linha = "";

        while (br.ready()) {
//lê a proxima linha
            linha += br.readLine();

//faz algo com a linha
        }
        br.close();
        fr.close();

        if (password.equals(linha)) {

            return true;
        }
        return false;
    }

}
