package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product iphone = new Product("Iphone 7s");
        Product samsung = new Product("Samsung Galaxy");

        Item item = new Item(iphone, new BigDecimal(3550), 3);
        Item item2 = new Item(samsung, new BigDecimal(2500), 2);

        iphone.getItems().add(item);
        samsung.getItems().add(item2);


        Invoice invoice = new Invoice("5/2019");

        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertEquals(2, invoice.getItems().size());

        //CleanUp
        invoiceDao.deleteById(id);

    }

}
