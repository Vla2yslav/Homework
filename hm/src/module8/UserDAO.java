package module8;

import java.util.List;

public class UserDAO extends AbstractDAOImpl{

    @Override
         public Object save(Object t) {
         return super.save(t);
         }

    @Override
        public void delete (Object o){
            super.delete(o);
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
