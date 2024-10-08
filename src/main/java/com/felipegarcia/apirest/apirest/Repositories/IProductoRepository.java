package com.felipegarcia.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipegarcia.apirest.apirest.Entities.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long> {

}
