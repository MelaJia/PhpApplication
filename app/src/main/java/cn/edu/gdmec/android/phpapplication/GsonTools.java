package cn.edu.gdmec.android.phpapplication;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by HP on 2018/5/15.
 */

public class GsonTools {
    public GsonTools(){

    }

    public static List<Map<String,Object>> getList(String jsonString){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        try {
            Gson gson=new Gson();
            list=gson.fromJson(jsonString,new TypeToken<List<Map<String,Object>>>(){}.getType());

        }catch (Exception e){

        }
        return list;


    }
}
