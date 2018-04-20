/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.TextField;
import Service.ServiceProduit;
import Entite.Produit;
import Entite.Task;
import Service.ServiceTask;

/**
 *
 * @author sana
 */
public class HomeForm {

    Form f;
    TextField tnom;
    TextField tetat;
    Button btnajout,btnaff;

    public HomeForm() {
        f = new Form("home");
        tnom = new TextField();
        tetat = new TextField();
        btnajout = new Button("ajouter");
        btnaff=new Button("Affichage");
        f.add(tnom);
        f.add(tetat);
        f.add(btnajout);
        f.add(btnaff);
        btnajout.addActionListener((e) -> {
            ServiceTask ser = new ServiceTask();
            Task t = new Task(0, tnom.getText(), tetat.getText());
            ser.ajoutTask(t);
            

        });
        btnaff.addActionListener((e)->{
        Affichage a=new Affichage();
        a.getF().show();
        });
    }

    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }

    public TextField getTnom() {
        return tnom;
    }

    public void setTnom(TextField tnom) {
        this.tnom = tnom;
    }

}
