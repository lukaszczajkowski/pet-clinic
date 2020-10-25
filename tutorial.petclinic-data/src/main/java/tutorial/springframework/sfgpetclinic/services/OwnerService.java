package tutorial.springframework.sfgpetclinic.services;

import java.util.Set;

import tutorial.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService <Owner, Long>{
	
	Owner findByLastName(String lastName);

}
