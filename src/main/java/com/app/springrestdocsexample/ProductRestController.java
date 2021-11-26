package com.app.springrestdocsexample;

import com.app.springrestdocsexample.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/product")
public class ProductRestController {
    @GetMapping
    @ResponseBody
    public Product getProduct() {
        return new Product("Dorflex", 4.9);
    }
}
