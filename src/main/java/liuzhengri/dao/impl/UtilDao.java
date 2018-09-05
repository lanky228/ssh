package liuzhengri.dao.impl;

import liuzhengri.dao.IUtilDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import org.hibernate.SessionFactory;

@Repository
public class UtilDao extends HibernateDaoSupport implements IUtilDao {
    @Override
    public <T> T select(Long id, Class T) throws Exception {
        return (T) getHibernateTemplate().get(T, id);
    }

    @Override
    public <T> T save(T obj) {
        getHibernateTemplate().saveOrUpdate(obj);
        return obj;
    }

    @Resource  
    public void setSessionFacotry(SessionFactory sessionFacotry) {  
        super.setSessionFactory(sessionFacotry);  
    }
}
