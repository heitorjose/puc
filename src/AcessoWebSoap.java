import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.tempuri.Person;
import org.tempuri.PersonIdentification;
import org.tempuri.SOAPDemoLocator;
import org.tempuri.SOAPDemoSoap;

public class AcessoWebSoap {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("http.proxyHost", "127.0.0.1");
	    System.setProperty("https.proxyHost", "127.0.0.1");
	    System.setProperty("http.proxyPort", "3128");
	    System.setProperty("https.proxyPort", "3128");

		SOAPDemoLocator locador = new SOAPDemoLocator();
		try {
			SOAPDemoSoap demo = locador.getSOAPDemoSoap();
//			Listar Objeto Person Identification
//			PersonIdentification[] nomes = demo.getListByName(null);
//			for (PersonIdentification personIdentification : nomes) {
//				System.out.println(personIdentification.getID() + " " + personIdentification.getName());
//			}
			
//			Listar Objeto person 
//			Person pessoa = demo.findPerson("95");
//			System.out.println(pessoa.getName() + " - " + pessoa.getAge() + " - " + pessoa.getHome().getStreet() + " / " + pessoa.getHome().getCity() + " / " + pessoa.getHome().getState() + " - " + pessoa.getHome().getZip());

//	Divide integer
			Long resultDiv = demo.divideInteger(100l, 20l);
			System.out.println("O resultado da divisão é " +resultDiv);
	
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
