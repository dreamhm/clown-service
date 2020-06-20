package com.hm.manage.role.service.impl;

import com.hm.common.entity.ClownResult;
import com.hm.common.utils.ClownResultUtil;
import com.hm.common.utils.SnowFlake;
import com.hm.manage.role.dao.IRoleDao;
import com.hm.manage.role.model.RoleBo;
import com.hm.manage.role.model.RolePowerBo;
import com.hm.manage.role.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Service("roleService")
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;

    public ClownResult addRoleInfo(RoleBo roleBo) {
        int retrunCode = 0;
        if(roleBo.getId() == null || roleBo.getId().equals("")){
            roleBo.setId(SnowFlake.genId());
            retrunCode = roleDao.insertRoleInfo(roleBo);
        }else {
            retrunCode = roleDao.updateRoleInfo(roleBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getRoleInfoById(Long id) {
        RoleBo roleBo = roleDao.selectRoleInfoById(id);
        return ClownResultUtil.getClowenResultByData(roleBo);
    }

    public ClownResult deleteRoleInfoById(Long id) {
        int retrunCode = roleDao.delRoleInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult addRolePowerInfo(RolePowerBo rolePowerBo) {
        int retrunCode = 0;
        if(rolePowerBo.getId() == null || rolePowerBo.getId().equals("")){
            rolePowerBo.setId(SnowFlake.genId());
            retrunCode = roleDao.insertRolePowerInfo(rolePowerBo);
        }else {
            retrunCode = roleDao.updateRolePowerInfo(rolePowerBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getRolePowerInfoById(Long id) {
        RolePowerBo rolePowerBo = roleDao.selectRolePowerInfoById(id);
        return ClownResultUtil.getClowenResultByData(rolePowerBo);
    }

    public ClownResult deleteRolePowerInfoById(Long id) {
        int retrunCode = roleDao.delRolePowerInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }
}
