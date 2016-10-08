package module8;

import java.util.List;

public class UserDAO extends AbstractDAOImpl{
        @Override
        public void save (User t){
            super.save(t);
        }

        @Override
        public Object delete (Object o){
            return super.delete(o);
        }

        @Override
        public void deleteAll (List list){
            super.deleteAll(list);
        }

        @Override
        public void saveAll (List list){
            super.saveAll(list);
        }

        @Override
        public List getList () {
            return super.getList();
        }


}
