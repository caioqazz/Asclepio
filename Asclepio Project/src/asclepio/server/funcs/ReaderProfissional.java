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
public class ReaderProfissional {

    File arquivo;
    FileReader fr;
    BufferedReader br;
    String caminho_base;

    public ReaderProfissional() {
        caminho_base = "C:\\Asclepio\\UsersProfissional\\";
    }

    public String getProfissao(String id) throws FileNotFoundException, IOException {

        String info[] = new String[5];
        arquivo = new File(caminho_base + id + "/Dados.txt");

        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        for (int i = 0; i < info.length; i++) {
            info[i] = br.readLine();

        }

        br.close();
        fr.close();

        return info[3];

    }

    public String[] getInformacoes(String id) throws FileNotFoundException, IOException {

        String info[] = new String[5];
        arquivo = new File(caminho_base + id + "/Dados.txt");

        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        for (int i = 0; i < info.length; i++) {
            info[i] = br.readLine();

        }

        br.close();
        fr.close();

        return info;

    }
}
