package com.sda.alexjelescu.hibernate3;

import com.sda.alexjelescu.hibernate3.model.Client;
import com.sda.alexjelescu.hibernate3.repository.ClientRepository;
import com.sda.alexjelescu.hibernate3.utils.SessionManager;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        ClientRepository clientRepository = new ClientRepository();
        Client client1 = new Client("Marius", "Nicolae", "marius.nicolae@fkfwe.com", Date.valueOf("1995-08-15"));
        Client client2 = new Client("Claudiu", "Vasile", "claudiu.vasile@fkfwe.com", Date.valueOf("1991-11-05"));
        clientRepository.save(client1);
        clientRepository.save(client2);
        clientRepository.findAll().forEach(client -> System.out.println(client));

        SessionManager.shutDown();
    }


}
