package MDOC.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import MDOC.Domain.Address;
import MDOC.Domain.Contact;
import MDOC.Domain.HibernateUtil;

public class AddressDao {

	private Session session;
	private SessionFactory s ;
	private Address adresse;
	private Transaction tx;
	
	public AddressDao(){
		
		session = null;
		s = new HibernateUtil().getSessionFactory();
		session =  s.openSession();
		tx = session.beginTransaction();
		
	}
	
	public void CreateAddress(Address address){
		
		session.persist(adresse);
		tx.commit();
		
	}
	
	public Address FindAddressById(int id){
		
		/**
		 * find by criteria
		 * */
		session = null;
		s = new HibernateUtil().getSessionFactory();
		session =  s.openSession();
		Address address = (Address) session.createCriteria(Address.class).add(Restrictions.eq("addressId", id) ).uniqueResult();	
		return address;
	}
	
	public List FindAddressByCity(String city){
		/**
		 * find by examples
		 * */
//		session = null;
//		s = new HibernateUtil().getSessionFactory();
//		session =  s.openSession();
//		List address = session.createCriteria(Address.class)
//				.add( Restrictions.like("city", city+"%"))
//				.addOrder(Order.asc("addressId") )
//				.addOrder(Order.desc("street") )
//				.setMaxResults(3)
//				.list();	
//		return address;
		
		Address addr = new Address();
		addr.setCity(city);
		List results = session.createCriteria(Address.class)
		.add( Example.create(addr) )
		.list();
		return results;
	}
	
	public void DeleteAddress(){
		
	}
}
