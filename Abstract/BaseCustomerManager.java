package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kayd�n�z  ba�ar�l� bir �ekilde tamamlanm��t�r.");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" bilgileriniz ba�ar�l� bir �ekilde g�ncellenmi�tir.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kayd�n�z  ba�ar�l� bir �ekilde silinmi�tir.");
    }
}