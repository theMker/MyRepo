package testpackage.audit.service;

import org.springframework.stereotype.Service;

import testpackage.audit.AuditLog;

@Service
public class AuditService {

	public void execute(AuditLog bean) {
            //TODO: Save the audit data to audit repository
	}
}
