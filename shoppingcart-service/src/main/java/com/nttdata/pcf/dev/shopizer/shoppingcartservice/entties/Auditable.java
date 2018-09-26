package com.nttdata.pcf.dev.shopizer.shoppingcartservice.entties;

public interface Auditable {
	
	AuditSection getAuditSection();
	
	void setAuditSection(AuditSection audit);
}
