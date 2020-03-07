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
public class Initialization {

    public void iniciaPrograma() throws IOException {
        File diretorio = new File("C:\\Asclepio");
        diretorio.mkdir();

        diretorio = new File("C:\\Asclepio\\UsersProfissional");
        diretorio.mkdir();
        diretorio = new File("C:\\Asclepio\\UsersCommon");
        diretorio.mkdir();
        diretorio = new File("C:\\Asclepio\\MedicalInformation");
        diretorio.mkdir();

        File arquivo = new File("C:\\Asclepio/admin.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("admin");
            bw.close();
            fw.close();
        }
    }
}
