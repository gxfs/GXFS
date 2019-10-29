package mx.equipo.chido.bs;

import mx.equipo.chido.bean.Pago;
import mx.equipo.chido.dao.PagoDao;
import 
public class Pagobs {
	public int registraPago(Pago pago) {
		
		PagoDao pagoDao = new PagoDao();
		int codigo=(Integer)pagoDao.registrarPago(pago);
		return codigo;
	}
	
	public Pago findById(Integer id) {
		PagoDao pagoDAO = new PagoDao();
		Pago pago;
		pago = pagoDAO.findById(id);
		System.out.println("--->BS.pago" + pago);
		return pago;
	}
	
	public static void main(String[] args) {
		PagoDao pagoDao = new PagoDao();
		Pago pago;
		pago = pagoDao.findById(1);
		if (persona!=null) {
			System.out.println("Nombre: " + pago.getNombre());
			}
		else {
			System.out.println("ERROR");
		}
	}
	

