package co.edu.unicauca.modelo;

import co.edu.unicauca.servicios.InformacionDTO;
import com.google.gson.Gson;

public class GestionJSON {
    public static InformacionDTO JsonToObject(String json){
        Gson gson = new Gson();
        InformacionDTO response = new InformacionDTO();
        response = gson.fromJson(json, InformacionDTO.class);
        return response;
    }
}
