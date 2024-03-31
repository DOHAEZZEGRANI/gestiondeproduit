package org.xproce.myproject.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.xproce.myproject.dao.entities.Product;
import org.xproce.myproject.service.ProductManager;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductManager productManager;
    //la liste
    @GetMapping("/index")
    public String accueil (Model model){
        List<Product>products=productManager.getallProduct();
        model.addAttribute("listproduct",products);
        return "/index";
    }
    @GetMapping("detailsProduct")
    public String detailProduct(Model model,
                                @RequestParam(name = "id") Integer id) {

        Product product = productManager.getProductbyid(id);
        model.addAttribute("productWithDetails", product);
        return "detailProduit" ;

    }

}
