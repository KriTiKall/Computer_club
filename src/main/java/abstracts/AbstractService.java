package abstracts;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractService<Entity, Id extends Serializable> implements Service<Entity, Id> {

    protected AbstractDao<Entity, Id> dao;

    public AbstractService(AbstractDao<Entity, Id> dao) {
        this.dao = dao;
    }

    @Override
    public void create(Entity entity) {
        dao.create(entity);
    }

    @Override
    public Entity read(Id id) {
        return dao.read(id);
    }

    @Override
    public void update(Entity entity) {
        dao.update(entity);
    }

    @Override
    public void delete(Entity entity) {
        dao.delete(entity);
    }

    @Override
    public List<Entity> getList() {
        return dao.getList();
    }
}