package MDOC.Dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import MDOC.Domain.Address;
import MDOC.Domain.Contact;
import MDOC.Domain.ContactGroup;
import MDOC.Domain.Entreprise;
import MDOC.Domain.HibernateUtil;
import MDOC.Domain.PhoneNumber;

public class ContactDao {
	public ContactDao(){
		
		Contact contact = new Contact();
		Address adresse = new Address();
		ContactGroup group = new ContactGroup();
		PhoneNumber number = new PhoneNumber();
		Entreprise entreprise = new Entreprise();
		
		Set<ContactGroup>  set = new HashSet<ContactGroup> ();
		entreprise.setFirstName("ludovic");
		entreprise.setLastName("seleucus");
		entreprise.setEmail("ludovic@gmail.com");
		entreprise.setNumSiret(132045);
		adresse.setCity("nanterre");
		adresse.setCountry("france");
		adresse.setStreet("5 rue soleil");
		adresse.setZip("92000");
		group.setGroupName("famille");
		//créer une liste de contacts pour contactgroup
		group.setGroupName("Famille");
		set.add(group);
		number.setPhoneNumber("06.29.70.34.24");
		number.setPhoneKind("mobile");
		Session session = null;
		SessionFactory s = new HibernateUtil().getSessionFactory();
		session =  s.openSession();

	Transaction tx = session.beginTransaction();
	
	session.persist(adresse);
	session.persist(group);
	entreprise.setAdd(adresse);
	entreprise.setBooks(set);
	session.persist(entreprise);
	number.setContact(entreprise);
	session.persist(number);
	tx.commit();
	}
	
	public List getContact(String city){
		
		Session session = null;
		SessionFactory s = new HibernateUtil().getSessionFactory();
		session =  s.openSession();
//		
//		List contact = session.createCriteria(Contact.class)
//		.add(Restrictions.like("firstName", "l%") ).list();
//		
//		Contact cont = (Contact) contact.get(0);
//		System.out.println(cont.toString());
//		return contact;
		
		Address addr = new Address();
		addr.setCity(city);
		List results = session.createCriteria(Address.class)
		.add( Example.create(addr) )
		.list();
		for(int i=0; i<results.size();i++){
			addr = (Address) results.get(i);
			System.out.println(addr.toString());
		}
		return results;
	}
}
