package servidor.servicios;

import com.google.gson.Gson;
import servidor.DTO.InformacionDTO;

/**
 *
 * @author lmarango
 */
public class ConversorJson {
    public static String objectToJson(InformacionDTO information){
        Gson gson = new Gson();
        String response;
        response = gson.toJson(information);
        return response;
    }
}
