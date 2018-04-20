/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import Entite.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sana
 */
public class ServiceTask {

    public void ajoutTask(Task ta) {
        ConnectionRequest con = new ConnectionRequest();
        String Url = "http://localhost/ParcAutomobile/web/app_dev.php/api/task/new?name=" + ta.getNom() + "&status=" + ta.getEtat();
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
    

    public ArrayList<Task> getList2() {
        ArrayList<Task> listTasks = new ArrayList<>();
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
                        Task task = new Task();
                        float id = Float.parseFloat(obj.get("id").toString());
                        
                        task.setId((int) id);
                        task.setEtat(obj.get("status").toString());
                        task.setNom(obj.get("name").toString());
                        listTasks.add(task);

                    }
                } catch (IOException ex) {
                }

            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return listTasks;
    }

}
