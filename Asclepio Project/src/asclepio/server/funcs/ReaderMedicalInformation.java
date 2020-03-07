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
public class ReaderMedicalInformation {

    File arquivo;
    FileReader fr;
    BufferedReader br;
    String linha;
    String caminho_base;

    public ReaderMedicalInformation() {
        caminho_base = "C:\\Asclepio\\MedicalInformation/";
    }

    public String leituraMedicos(String medico) throws FileNotFoundException, IOException {
        linha = "";
        arquivo = new File(caminho_base + medico + ".txt");
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
}
