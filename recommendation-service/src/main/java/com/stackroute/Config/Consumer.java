package com.stackroute.Config;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.stackroute.entity.Product;
import com.stackroute.service.ProductService;
@Component
public class Consumer {
    @Autowired
    private ProductService productService;

    @RabbitListener(queues="message_queue")
    public void gettaxDtoFromRabbitMq(Product product1)
    {
        System.out.println(product1.toString());
        Product product=new Product();
        product.setBD(product1.getBD());


        product.setDTC(product1.getDTC());
        product.setEDS(product1.getEDS());
        product.setIFI(product1.getIFI());

        product.setIFD(product1.getIFD());
        product.setIDA(product1.getIDA());
        product.setIFS(product1.getIFS());
        product.setIEL(product1.getIEL());
        product.setIHL(product1.getIHL());
        product.setIPHL(product1.getIPHL());
        product.setIPL(product1.getIPL());
        product.setMI(product1.getMI());
        product.setNPS(product1.getNPS());
        product.setOI(product1.getOI());
        product.setRI(product1.getRI());
        product.setTax1(product1.getTax1());
        product.setTax2(product1.getTax2());
        System.out.println(product.getTax1());
        System.out.println(product.getTax2());
        productService.saveProduct(product);
    }
}

