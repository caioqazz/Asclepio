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

/**
 *
 * @author Caio
 */
public class WriterMedicalInformation {

    File arquivo;
    FileWriter fw;
    BufferedWriter bw;
    String caminho_base;

    public WriterMedicalInformation() {
        caminho_base = "C:\\Asclepio\\MedicalInformation/";
    }

    public void escreveMedicos(String medico, String nome, String endereço, int tempo, String tel) throws IOException {
        arquivo = new File(caminho_base + medico + ".txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        fw = new FileWriter(arquivo, true);
        bw = new BufferedWriter(fw);

        bw.write(nome + ";" + endereço + ";" + tempo + ";" + tel);
        bw.newLine();

        bw.close();
        fw.close();
    }
}
