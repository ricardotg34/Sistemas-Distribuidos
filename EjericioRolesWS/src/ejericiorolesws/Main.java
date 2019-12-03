package ejericiorolesws;

import com.darkdestiny.ws.RolesDTO;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<RolesDTO> list =(List<RolesDTO>)(Object) listaDeRoles();
        System.out.println(list.get(0).getId());
    }

    private static java.util.List<java.lang.Object> listaDeRoles() {
        com.darkdestiny.ws.WSRoles_Service service = new com.darkdestiny.ws.WSRoles_Service();
        com.darkdestiny.ws.WSRoles port = service.getWSRolesPort();
        return port.listaDeRoles();
    }
    
}