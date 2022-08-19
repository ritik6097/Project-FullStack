package com.example.demo.Config;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
@Component
public class Consumer {
    @Autowired
    private ProductService productService;

    @RabbitListener(queues="test")
    public void gettaxDtoFromRabbitMq(Product product1)
    {
        System.out.println(product1.toString());
        Product product=new Product();
        product.setBD(product1.getBD());
        product.setDed1(product1.getDed1());
        product.setDed2(product1.getDed2());
        product.setDTC(product1.getDTC());
        product.setEDS(product1.getEDS());
        product.setGTI1(product1.getGTI1());
        product.setGTI2(product1.getGTI2());
        product.setIFD(product1.getIFD());
        product.setIFDS(product1.getIFDS());
        product.setIFS(product1.getIFS());
        product.setIOEL(product1.getIOEL());
        product.setIOHL(product1.getIOHL());
        product.setIPHL(product1.getIPHL());
        product.setIPL(product1.getIPL());
        product.setMD(product1.getMD());
        product.setNPS(product1.getNPS());
        product.setOI(product1.getOI());
        product.setRIR(product1.getRIR());
        product.setTax1(product1.getTax1());
        product.setTax2(product1.getTax2());
        System.out.println(product.getTax1());
        System.out.println(product.getTax2());
        productService.saveProduct(product);
    }
}

