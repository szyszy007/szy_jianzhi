package com.jianZhi.ssh.web.mapper;

import com.jianZhi.ssh.entities.Company;
import com.jianZhi.ssh.entities.Recruiter;
import com.jianZhi.ssh.enums.CompanyStatusEnum;
import com.jianZhi.ssh.web.RecruiterRegister;
import org.springframework.stereotype.Component;

/**
 * 招聘端注册映射组件
 * @author szy
 */
@Component
public class RecruiterMapper {

    /**
     * id需要自己回填
     * @param register
     * @return
     */
    public Recruiter toRecruiter(RecruiterRegister register) {
        Recruiter recruiter = new Recruiter();
        recruiter.setEmail(register.getEmail());
        recruiter.setPassword(register.getPassword());
        recruiter.setTelphone(register.getTelphone());
        recruiter.setUsername(register.getUsername());
        recruiter.setName(register.getName());
        return recruiter;
    }

    /**
     * id需要自己回填
     * @param register
     * @return
     */
    public Company toCompany(RecruiterRegister register) {
        Company company = new Company();
        company.setCity(register.getCity());
        company.setAddress(register.getAddress());
        company.setCompanyName(register.getCompanyName());
        company.setStatus(CompanyStatusEnum.defaultStatus());
        company.setDistrict(register.getDistrict());
        return company;
    }

}
