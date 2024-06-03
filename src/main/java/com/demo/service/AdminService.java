package com.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.ShipRepository.AdminRepository;
import com.demo.entity.Admin;

import jakarta.servlet.http.HttpSession;

@Service
public class AdminService{
@Autowired
AdminRepository adminrepo;
public void save(Admin admin) {

       adminrepo.save(admin);

     }

public Admin getAdminbyAdminId(String adminId) {

Admin admin = adminrepo.getAdminByAdminId(adminId);

return admin;

}

public boolean changePassword(String password, String changePassword, HttpSession session) {
	Admin admin = (Admin) session.getAttribute("admin");
	if(admin!=null) {
		if(admin.getPassword().equals(password)){
			admin.setPassword(changePassword);
			System.out.println("called");
			adminrepo.save(admin);
			return true;
		}
	}
	return false;
}


}