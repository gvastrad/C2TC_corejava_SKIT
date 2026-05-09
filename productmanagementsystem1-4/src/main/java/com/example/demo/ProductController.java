package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RequestMapping("/products")
@RestController
public class ProductController {

@Autowired	
ProductService service;

@GetMapping
public List<ProductEntity> list()
{
return service.listAll();
}

@GetMapping("/{id}")
public ResponseEntity<ProductEntity> get(@PathVariable Integer id)
{
try
{
ProductEntity product = service.get(id);
return new ResponseEntity<ProductEntity>(product, HttpStatus.OK);
}
catch (NoSuchElementException e)
{
return new ResponseEntity<ProductEntity>(HttpStatus.NOT_FOUND);
}
}

//RESTful API method for Create operation
	@PostMapping
	public void add(@RequestBody ProductEntity product)
	{
	service.save(product);
	}

	// RESTful API method for Update operation
		@PutMapping("/{id}")
		public ResponseEntity<?> update(@RequestBody ProductEntity product, @PathVariable Integer id)
		{
		try
		{
		ProductEntity existProduct = service.get(id);
		service.save(product);
		return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}
		// RESTful API method for Delete operation
		@DeleteMapping("/{id}")
		public void delete(@PathVariable Integer id)
		{
		service.delete(id);
		}

}
