package com.cts.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jt;

	// List all products
	@Override
	public List<Product> listAll() {

		String sqlQry = "select * from product";
		return jt.queryForObject(sqlQry, new FetchAllProduct());

	}

	// save Product
	public void saveProduct(Product prod) {
		String saveQry = "insert into product values(?,?,?,?)";
		jt.update(saveQry, prod.getId(), prod.getDescription(), prod.getName(), prod.getPrice());
	}

}

class FetchAllProduct implements RowMapper<List<Product>> {

	@Override
	public List<Product> mapRow(ResultSet rs, int rowNum) throws SQLException {

		List<Product> prods = new ArrayList<>();

		while (rs.next()) {
			Product prod = new Product();
			prod.setId(rs.getInt("id"));
			prod.setName(rs.getString("name"));
			prod.setDescription(rs.getString("description"));
			prod.setPrice(rs.getDouble("price"));

			prods.add(prod);
		}
		return prods;
	}

}
