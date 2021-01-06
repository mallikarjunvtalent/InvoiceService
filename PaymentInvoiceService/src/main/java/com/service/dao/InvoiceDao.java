package com.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.service.entity.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Integer> {

	Invoice findByInvoiceNumber(String invoiceNumber);

	@Transactional
	void deleteByInvoiceNumber(String invoiceNumber);

}
