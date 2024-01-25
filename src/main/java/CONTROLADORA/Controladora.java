/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADORA;

import MODELO.Cliente;
import MODELO.Proveedor;
import MODELO.Transportista;
import MODELO.*;
import PERSISTENCIA.ControladorPersistencia;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco
 */
public class Controladora {
    ControladorPersistencia controladorPersistencia = new ControladorPersistencia();
    
    public void crearCliente(Cliente cliente){
        controladorPersistencia.crearCliente(cliente);
    }
    
    public List<Cliente> leerClientes(){
        return controladorPersistencia.leerClientes();
    }
    
    public List<Almacen> leerAlmacenes(){
        return controladorPersistencia.leerAlmacenes();
    }
    
    public void crearTransportista(Transportista transportista){
        controladorPersistencia.crearTransportista(transportista);
    }
    
    public void crearProveedor(Proveedor proveedor){
        controladorPersistencia.crearProveedor(proveedor);
    }
    
    public int obtenerUltimoIdRegistradoProveedor() {
        return controladorPersistencia.obtenerUltimoIdRegistradoProveedor();
    }
    
    public void crearAlmacen(Almacen almacen){
        controladorPersistencia.crearAlmacen(almacen);
    }
    
    public long obtenerUltimoIdRegistradoAlmacen() {
        return controladorPersistencia.obtenerUltimoIdRegistradoAlmacen();
    }
    
    public List<Integer> obtenerIDUbicacionesPorIDAlmacen(long almacenID) {
        return controladorPersistencia.obtenerIDUbicacionesPorIDAlmacen(almacenID);
    }
    
    public void insertarRelacionAlmacenUbicacion(long almacenID, int ubicacionID) {
        controladorPersistencia.insertarRelacionAlmacenUbicacion(almacenID, ubicacionID);
    }
    
    public void crearUbicacion(UbicacionDeAlmacenamiento ubicacion){
        controladorPersistencia.crearUbicacion(ubicacion);
    }
    
    public void crearCarga(Carga carga){
        controladorPersistencia.crearCarga(carga);
    }
    
    public long obtenerUltimoIdRegistradoCarga() {
        return controladorPersistencia.obtenerUltimoIdRegistradoCarga();
    }
    
    public String obtenerUbicacionAlmacenPorID(long idAlmacen) {
        return controladorPersistencia.obtenerUbicacionPorID(idAlmacen);
    }
    
    public List<Carga> leerCargas(){
        return controladorPersistencia.leerCargas();
    }
    
    public void crearDescarga(Descarga descarga){
        controladorPersistencia.crearDescarga(descarga);
    }
    
    public long obtenerUltimoIdRegistradoDescarga() {
        return controladorPersistencia.obtenerUltimoIdRegistradoDescarga();
    }
    
    public List<Descarga> leerDescargas(){
        return controladorPersistencia.leerDescargas();
    }
}
