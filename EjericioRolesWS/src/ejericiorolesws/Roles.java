/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericiorolesws;

import com.darkdestiny.ws.RolesDTO;

/**
 *
 * @author ricardotg
 */
public class Roles {

    public static void actualizarRolConDto(com.darkdestiny.ws.RolesDTO dto) {
        com.darkdestiny.ws.WSRoles_Service service = new com.darkdestiny.ws.WSRoles_Service();
        com.darkdestiny.ws.WSRoles port = service.getWSRolesPort();
        port.actualizarRolConDto(dto);
    }

    public static RolesDTO buscarRolConDto(com.darkdestiny.ws.RolesDTO dto) {
        com.darkdestiny.ws.WSRoles_Service service = new com.darkdestiny.ws.WSRoles_Service();
        com.darkdestiny.ws.WSRoles port = service.getWSRolesPort();
        return port.buscarRolConDto(dto);
    }

    public static void eliminarRolConDto(com.darkdestiny.ws.RolesDTO dto) {
        com.darkdestiny.ws.WSRoles_Service service = new com.darkdestiny.ws.WSRoles_Service();
        com.darkdestiny.ws.WSRoles port = service.getWSRolesPort();
        port.eliminarRolConDto(dto);
    }

    public static void insertarRolConDto(com.darkdestiny.ws.RolesDTO dto) {
        com.darkdestiny.ws.WSRoles_Service service = new com.darkdestiny.ws.WSRoles_Service();
        com.darkdestiny.ws.WSRoles port = service.getWSRolesPort();
        port.insertarRolConDto(dto);
    }

    public static java.util.List<java.lang.Object> listaDeRoles() {
        com.darkdestiny.ws.WSRoles_Service service = new com.darkdestiny.ws.WSRoles_Service();
        com.darkdestiny.ws.WSRoles port = service.getWSRolesPort();
        return port.listaDeRoles();
    }
    
}
