/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entite.Produit;
import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Yassine
 */
public class ServiceProduit {
      public void ajoutProduit(Produit p) {
        ConnectionRequest con = new ConnectionRequest();
        String Url = "http://localhost/BonPlan/web/app_dev.php/api/produit/new?nom_produit=" + p.getNom_produit()+ "&prix_produit=" + p.getPrix_produit()+"&photo_produit="+p.getPhoto_produit()+"&etab_produit="+p.getEtablissement();
        con.setUrl(Url);

        System.out.println("tt");

        con.addResponseListener((e) -> {
            String str = new String(con.getResponseData());
            System.out.println(str);
//            if (str.trim().equalsIgnoreCase("OK")) {
//                f2.setTitle(tlogin.getText());
//             f2.show();
//            }
//            else{
//            Dialog.show("error", "login ou pwd invalid", "ok", null);
//            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
    }
    

    public ArrayList<Produit> getListProduits() {
        ArrayList<Produit> listProduits = new ArrayList<>();
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl("http://localhost/ParcAutomobile/web/app_dev.php/api/task/all");
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                //listTasks = getListTask(new String(con.getResponseData()));
                JSONParser jsonp = new JSONParser();
                
                try {
                    Map<String, Object> tasks = jsonp.parseJSON(new CharArrayReader(new String(con.getResponseData()).toCharArray()));
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                    System.out.println(tasks.keySet());
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                    System.out.println(tasks.values());
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                    System.out.println(tasks.size());
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                    //System.out.println(tasks);
                    List<Map<String, Object>> list = (List<Map<String, Object>>) tasks.get("root");
                    for (Map<String, Object> obj : list) {
                        Produit prod = new Produit();
                        float id = Float.parseFloat(obj.get("id").toString());
                        
                        prod.setId_produit((int) id);
                        prod.setNom_produit(obj.get("name").toString());
                  //      prod.setPrix_produit(obj.get("status"));
                        prod.setPhoto_produit(obj.get("photo").toString());
                   //     prod.setEtablissement(obj.get("etab").toString());
                        listProduits.add(prod);

                    }
                } catch (IOException ex) {
                }

            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return listProduits;
    }
}
