package ru.job4j.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.job4j.models.Location;
import ru.job4j.repositories.LocationProfileService;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class DAOImpl implements LocationProfileService {

    private SessionFactory sessionFactory;

    @Autowired
    public DAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @SuppressWarnings("unchecked")
    @Override
    public List<Location> findByFullnameLike(String fullname) {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<Location> query = session.getNamedQuery("findByFullnameLike");
        query.setParameter("fullname", fullname);
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Location save(Location location) {
        Session session = this.sessionFactory.openSession();
        session.save(location);
        session.close();
        return location;
    }

    @Override
    public void update(Location location) {
        Session session = this.sessionFactory.openSession();

    }
}
