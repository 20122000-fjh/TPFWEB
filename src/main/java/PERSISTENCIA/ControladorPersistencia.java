
package PERSISTENCIA;

import MODELO.Cliente;
import MODELO.Proveedor;
import MODELO.Transportista;
import MODELO.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;


public class ControladorPersistencia {
    ClienteDAO clienteDAO = new ClienteDAO();
    TransportistaDAO transportistaDAO = new TransportistaDAO();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    AlmacenDAO almacenDAO = new AlmacenDAO();
    UbicacionDeAlmacenamientoDAO ubicacionDAO = new UbicacionDeAlmacenamientoDAO();
    CargaDAO cargaDAO = new CargaDAO();
    DescargaDAO descargaDAO = new DescargaDAO();
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("TPFPU");
    
    public void crearCliente(Cliente cliente){
        try {
            clienteDAO.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente> leerClientes(){
        return clienteDAO.findClienteEntities();
    }
    
    public void crearTransportista(Transportista transportista){
        try {
            transportistaDAO.create(transportista);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearProveedor(Proveedor proveedor){
        try {
            proveedorDAO.create(proveedor);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int obtenerUltimoIdRegistradoProveedor() {
        return proveedorDAO.obtenerUltimoIdRegistrado();
    }
    
    public void crearAlmacen(Almacen almacen){
        try {
            almacenDAO.create(almacen);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public long obtenerUltimoIdRegistradoAlmacen() {
        return almacenDAO.obtenerUltimoIdRegistrado();
    }
    
    public List<Almacen> leerAlmacenes(){
        return almacenDAO.findAlmacenEntities();
    }
    
    public List<Integer> obtenerIDUbicacionesPorIDAlmacen(long almacenID) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            // Utiliza el índice del parámetro en lugar del nombre
            Query query = em.createNativeQuery("SELECT ubicacion_almacenamiento_ID_ZONA FROM ALMACEN_UBICACIONDEALMACENAMIENTO WHERE Almacen_ID = ?1")
                    .setParameter(1, almacenID);

            // Ejecutar la consulta nativa para obtener los pedidos_CODIGO para un Cliente_DNI dado
            List<Integer> ubicaciones = query.getResultList();

            em.getTransaction().commit();

            return ubicaciones;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
    
    public void insertarRelacionAlmacenUbicacion(long almacenID, int ubicacionID) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            
            // Insertar en la tabla intermedia directamente usando una consulta nativa
            em.createNativeQuery("INSERT INTO ALMACEN_UBICACIONDEALMACENAMIENTO (Almacen_ID, ubicacion_almacenamiento_ID_ZONA) VALUES (?, ?)")
                    .setParameter(1, almacenID)
                    .setParameter(2, ubicacionID)
                    .executeUpdate();
            
            em.getTransaction().commit();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }
    
    public void crearUbicacion(UbicacionDeAlmacenamiento ubicacion){
        try {
            ubicacionDAO.create(ubicacion);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearCarga(Carga carga){
        try {
            cargaDAO.create(carga);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Estoy aca");
        }
    }
    public long obtenerUltimoIdRegistradoCarga() {
        return cargaDAO.obtenerUltimoIdRegistrado();
    }
    
    public String obtenerUbicacionPorID(long idAlmacen) {
        return almacenDAO.obtenerUbicacionPorID(idAlmacen);
    }
    
    public List<Carga> leerCargas(){
        return cargaDAO.findCargaEntities();
    }
    
    public void crearDescarga(Descarga descarga){
        try {
            descargaDAO.create(descarga);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Estoy aca");
        }
    }
    
    public long obtenerUltimoIdRegistradoDescarga() {
        return descargaDAO.obtenerUltimoIdRegistrado();
    }
    
    public List<Descarga> leerDescargas(){
        return descargaDAO.findDescargaEntities();
    }
}
